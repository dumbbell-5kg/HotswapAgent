package com.example.springbootdemo.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @author: 周子恒
 * @create: 2023-09-15 14:18
 **/
@RestController
public class MongoController {

    @Autowired
    private AnotherService anotherService;


    @GetMapping("/another")
    public String another() {
        anotherService.t();
        return anotherService.service();
    }

}
