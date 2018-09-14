package com.helloworld.arnold;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class HelloArnoldController {
    Logger log = Logger.getLogger(HelloArnoldController.class.getName());

    @GetMapping("/")
    public String index(Model model) {
        log.info("Index called...");

        return "index";

    }

    @GetMapping("/yes")
    public String yes(Model model) {
        log.info("yes called...");

        return "yes";
    }

    @GetMapping("/no")
    public String no(Model model) {
        log.info("no called...");
        return "no";
    }
}
