package com.digitalinnovationone.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvVariable;

    @GetMapping(value = "/message")
    public String getAppMessage(){
        return appMessage;
    }

    @GetMapping(value = "/variable")
    public String getDbEnvVariable(){
        return "A seguinte variavel foi passada: " + dbEnvVariable;
    }
}
