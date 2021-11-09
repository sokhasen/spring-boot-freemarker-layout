package com.example.springfreemarkerlayout.controller;

import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping
public class AppController {


    @Autowired
    private Configuration freeMarkerConfiguration;

    @SneakyThrows
    @GetMapping
    public Object index() {

        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("message", "Welcome Message.");


        Template template = freeMarkerConfiguration.getTemplate("ui/index_en_US.ftl");
        return FreeMarkerTemplateUtils.processTemplateIntoString(template, objectObjectHashMap);
    }

}
