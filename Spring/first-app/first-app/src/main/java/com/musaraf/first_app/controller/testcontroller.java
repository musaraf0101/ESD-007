package com.musaraf.first_app.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/test")
public class testcontroller {

    //@controller -> return HTML and xml
    //@restcontroller = responsebody -> return json,http code
}
