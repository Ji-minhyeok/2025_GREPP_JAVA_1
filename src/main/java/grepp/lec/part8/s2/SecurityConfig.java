package grepp.lec.part8.s2;

public class SecurityConfig {

    public static void main(String[] args) {

        HttpSecurity http = new HttpSecurity();

        http.authorizeHttpRequests(
        auth -> auth.requestMatchers("/posts/**")
                    .hasRole("MEMBER")
                .requestMatchers("/admin/**")
                    .hasRole("ADMIN")
                .anyRequest()
                    .hasRole("MEMBER")
        );

        http.printConfig();

    }

}
