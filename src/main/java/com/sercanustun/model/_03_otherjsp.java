package com.sercanustun.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _03_otherjsp {
    @GetMapping("/otherpage")
    public String getJspMethod(){
        return "otherfile/other";
    }

    @GetMapping("/other/diffuculPAGE")
    public String getJspMethod2() {
        return "otherfile/other";
    }


}
