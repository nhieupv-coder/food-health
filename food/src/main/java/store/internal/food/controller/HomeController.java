package store.internal.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/home","/"})
public class HomeController {
    @RequestMapping
    public String index(){
        return "home";
    }

    @RequestMapping("product-detail")
    public String productDetail(){
        return "product-detail";
    }
}
