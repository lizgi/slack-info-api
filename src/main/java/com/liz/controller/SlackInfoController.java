package com.liz.controller;

import com.liz.model.SlackInfo;
import com.liz.service.SlackInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class SlackInfoController {

    @Autowired
    SlackInfoService slackInfoService;

    @GetMapping("/get")
    public SlackInfo getSlackInfo(
            @RequestParam(name = "slackName") String slackName,
            @RequestParam(name = "dayOfWeek") String dayOfWeek) {
       SlackInfo slackInfo = new SlackInfo();
        if(!slackName.isEmpty()&& !dayOfWeek.isEmpty()) {

            slackInfo = slackInfoService.getSlackInfo(slackName, dayOfWeek);
       }

        return slackInfo;
    }
}





