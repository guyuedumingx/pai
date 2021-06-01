package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Florence
 */
@Controller
public class CardController {

    @RequestMapping("/hello")
    public String test(){
        System.out.println("请求成功");
        return "test";
    }
}
