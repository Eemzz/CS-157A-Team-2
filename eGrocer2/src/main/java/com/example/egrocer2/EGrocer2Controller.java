package com.example.egrocer2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//@Slf4j
//@Controller
//@RequestMapping("/")
//public class eGrocerController {
//    @GetMapping
//    public String getAction(Model model){
//        return "eGrocer";
//    }
//
//}


//import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/")
public class EGrocer2Controller {

    @GetMapping
    public String getAction(@ModelAttribute("command") EGrocer2Command command, Model model) {
        return "homepage";

    }

    @PostMapping
    public String postAction() {


        return "homepage";
    }

}
