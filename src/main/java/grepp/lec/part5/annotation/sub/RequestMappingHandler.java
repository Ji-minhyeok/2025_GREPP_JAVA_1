package grepp.lec.part5.annotation.sub;

import grepp.lec.part5.annotation.ViewResolver;
import grepp.lec.part5.annotation.sub.annotation.GetMapping;

import java.lang.reflect.Method;

public class RequestMappingHandler {

    public static void main(String[] args) throws Exception {

        Request request = new Request();

        ViewResolver viewResolver = new ViewResolver();
        MockController mockController = new MockController();

        Class<? extends MockController> mockControllerClass = mockController.getClass();

        Method[] methods = mockControllerClass.getMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(GetMapping.class)) {
                String templateTarget = method.invoke(mockController).toString();
                String templatePath = viewResolver.getTemplatePath(templateTarget);
                request.templatePath = templatePath;
                request.targetPath = templateTarget;

                GetMapping annotation = method.getAnnotation(GetMapping.class);
                String httpMethod = annotation.httpMethod();
                request.method = httpMethod;
            }

        }

        System.out.println("request = " + request);
    }

    private static class Request {

        private String method;
        private String templatePath;
        private String targetPath;

        @Override
        public String toString() {
            return "Request{" +
                    "method='" + method + '\'' +
                    ", templatePath='" + templatePath + '\'' +
                    ", targetPath='" + targetPath + '\'' +
                    '}';
        }

    }

}
