package org.launchcode.hello_spring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello ppl!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Cya chumps!";
    }

    @GetMapping("hello")
    @ResponseBody
    public String helloQueryParam(@RequestParam String coder){
        return "Yo " + coder;
    }

    @GetMapping
    @ResponseBody
    public String helloForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/hello'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}
