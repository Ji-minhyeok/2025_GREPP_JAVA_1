package grepp.lec.part8.s2;

public class MvcRequestMatchers {

    private String path;
    private String role;

    public MvcRequestMatchers(String path) {
        this.path = path;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "MvcRequestMatchers{" +
                "path='" + path + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

}
