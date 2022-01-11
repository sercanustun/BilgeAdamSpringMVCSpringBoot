package com.sercanustun.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _2_IndexJSP {

    @GetMapping("/jsp")
    public String getJSP(){
        return "index";
    }
}
