package com.durga;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
//@RequestMapping("/MVCTest")
public class HelloController{
//private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
   @RequestMapping( method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");

      return "hello";
   }
   
   @RequestMapping("/hello")
   public String hello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");

      return "hello";
   }
   
   @RequestMapping("test/*")
   public String test(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");

      return "test/{1}";
   }


}
