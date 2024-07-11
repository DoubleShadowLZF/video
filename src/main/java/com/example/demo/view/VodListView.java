package com.example.demo.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VodListView {
    @JsonProperty("vod_id")
    private Integer vodId;
    @JsonProperty("vod_name")
    private String voName;
    @JsonProperty("vod_pic")
    private String vodPic;
    @JsonProperty("vod_remarks")
    private String vodRemarks;
}
