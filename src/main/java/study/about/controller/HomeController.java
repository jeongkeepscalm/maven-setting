package study.about.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // JSP로 응답
    @RequestMapping("/hello")
    public String hello() {
        // "hello"라는 뷰 이름 -> /WEB-INF/views/hello.jsp
        return "hello";
    }

    // 문자열 그대로 응답 (테스트용)
    @RequestMapping("/test")
    @ResponseBody
    public String testString() {
        return "test response";
    }
}

