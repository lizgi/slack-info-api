package com.liz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SlackInfo {
    private String slack_name;
    private String current_day;
    private String utc_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private Integer status_code;

}
