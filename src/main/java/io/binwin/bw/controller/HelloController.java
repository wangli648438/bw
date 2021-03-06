package io.binwin.bw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Desc
 * Package: io.binwin.bw.controller
 * User: wangli
 * Date: 2017-7-30
 * Time: 15:01
 */
@Controller
public class HelloController {
    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/hello")
    public String welcome(ModelMap model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "hello";
    }

}
