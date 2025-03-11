package grepp.lec.part5.annotation.sub;

import grepp.lec.part5.annotation.sub.annotation.Controller;
import grepp.lec.part5.annotation.sub.annotation.GetMapping;

@Controller
public class MockController {

    @GetMapping(path = "/")
    public String index() {
        return "index";
    }

}
