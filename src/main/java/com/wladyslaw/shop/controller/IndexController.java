package com.wladyslaw.shop.controller;

import com.wladyslaw.shop.model.First;
import com.wladyslaw.shop.service.FirstI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @Autowired
    private FirstI firstService;


    @GetMapping("/search")
    public String first(@RequestBody First first) {
        return "hello " + firstService.fullName (first);
    }

    @GetMapping("/")
    public String second() {
        return "default";
    }


    @DeleteMapping ("/")
    public String delete() {
        return "delete";
    }



}
