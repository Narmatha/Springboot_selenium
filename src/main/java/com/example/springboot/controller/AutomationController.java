package com.example.springboot.controller;

import com.example.springboot.service.AutomationService;
import com.example.springboot.utils.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.prefs.BackingStoreException;

@RestController
public class AutomationController extends BaseTest {

    @Autowired
    private AutomationService automationService;

    @GetMapping("/test")
    public String index() {

        String textTitleAb = automationService.abPage.clickLinkABTesting().getTextTitleAB();
        System.out.println("text===" + textTitleAb);
       // String textTitleAb = abPage.clickLinkABTesting().getTextTitleAB();
        return "Done";
    }

}
