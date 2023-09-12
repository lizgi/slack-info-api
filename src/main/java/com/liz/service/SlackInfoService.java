package com.liz.service;

import com.liz.model.SlackInfo;
import org.springframework.stereotype.Service;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.TimeZone;

@Service
public class SlackInfoService {

    public SlackInfo getSlackInfo(String slackName, String dayOfWeek) {
        SlackInfo slackInfo = new SlackInfo();
        String day = LocalDate.now().getDayOfWeek().toString();
        if (!dayOfWeek.equalsIgnoreCase(day)) {

            slackInfo.setCurrent_day(day);
        } else {
            slackInfo.setCurrent_day(dayOfWeek);
        }
        slackInfo.setSlack_name("Liz");
        slackInfo.setTrack("Backend");
        slackInfo.setUtc_time(generateTimestamp());
        slackInfo.setGithub_file_url("https://github.com/lizgi/slack-info-api/blob/master/src/main/java/com/liz/service/SlackInfoService.java");
        slackInfo.setGithub_repo_url("https://github.com/lizgi/slack-info-api");
        slackInfo.setStatus_code(200);

        return slackInfo;

    }

    public String generateTimestamp(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT+3"));
        return dateFormat.format(new Date());
    }



}
