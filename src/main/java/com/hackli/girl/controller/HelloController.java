package com.hackli.girl.controller;

import com.hackli.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String say(@RequestParam("id") Integer id) {

        return "id:" + id;
//        return girlProperties.getCupSize();
    }
}
