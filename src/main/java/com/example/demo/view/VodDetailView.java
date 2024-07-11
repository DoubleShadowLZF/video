package com.example.demo.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@Data
public class VodDetailView {

    @JsonProperty("group_id")
    private Integer groupId;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("type_id")
    private Integer typeId;
    @JsonProperty("type_id_1")
    private Integer typeId1;
    @JsonProperty("type_name")
    private String typeName;
    @JsonProperty("vod_actor")
    private String vodActor;
    @JsonProperty("vod_area")
    private String vodArea;
    @JsonProperty("vod_author")
    private String vodAuthor;
    @JsonProperty("vod_behind")
    private String vodBehind;
    @JsonProperty("vod_blurb")
    private String vodBlurb;
    @JsonProperty("vod_class")
    private String vodClass;
    @JsonProperty("vod_color")
    private String vodColor;
    @JsonProperty("vod_content")
    private String vodContent;
    @JsonProperty("vod_copyright")
    private Integer vodCopyright;
    @JsonProperty("vod_director")
    private String vodDirector;
    @JsonProperty("vod_douban_id")
    private Integer vodDoubanId;
    @JsonProperty("vod_douban_score")
    private String vodDoubanScore;
    @JsonProperty("vod_down")
    private Integer vodDown;
    @JsonProperty("vod_down_from")
    private String vodDownFrom;
    @JsonProperty("vod_down_note")
    private String vodDownNote;
    @JsonProperty("vod_down_server")
    private String vodDownServer;
    @JsonProperty("vod_down_url")
    private String vodDownUrl;
    @JsonProperty("vod_duration")
    private String vodDuration;
    @JsonProperty("vod_en")
    private String vodEn;
    @JsonProperty("vod_hits")
    private Integer vodHits;
    @JsonProperty("vod_hits_day")
    private Integer vodHitsDay;
    @JsonProperty("vod_hits_month")
    private Integer vodHitsMonth;
    @JsonProperty("vod_hits_week")
    private Integer vodHitsWeek;
    @JsonProperty("vod_id")
    private Integer vodId;
    @JsonProperty("vod_isend")
    private Integer vodIsend;
    @JsonProperty("vod_jumpurl")
    private String vodJumpurl;
    @JsonProperty("vod_lang")
    private String vodLang;
    @JsonProperty("vod_letter")
    private String vodLetter;
    @JsonProperty("vod_level")
    private Integer vodLevel;
    @JsonProperty("vod_lock")
    private Integer vodLock;
    @JsonProperty("vod_name")
    private String vodName;
    @JsonProperty("vod_pic")
    private String vodPic;
    @JsonProperty("vod_pic_screenshot")
    private String vodPicScreenshot;
    @JsonProperty("vod_pic_slide")
    private String vodPicSlide;
    @JsonProperty("vod_pic_thumb")
    private String vodPicThumb;
    @JsonProperty("vod_play_from")
    private String vodPlayFrom;
    @JsonProperty("vod_play_note")
    private String vodPlayNote;
    @JsonProperty("vod_play_server")
    private String vodPlayServer;
    @JsonProperty("vod_play_url")
    private Map<String,String> vodPlayUrl;
    @JsonProperty("vod_plot")
    private Integer vodPlot;
    @JsonProperty("vod_plot_detail")
    private String vodPlotDetail;
    @JsonProperty("vod_plot_name")
    private String vodPlotName;
    @JsonProperty("vod_points")
    private Integer vodPoints;
    @JsonProperty("vod_points_down")
    private Integer vodPointsDown;
    @JsonProperty("vod_points_play")
    private Integer vodPointsPlay;
    @JsonProperty("vod_pubdate")
    private String vodPubdate;
    @JsonProperty("vod_pwd")
    private String vodPwd;
    @JsonProperty("vod_pwd_down")
    private String vodPwdDown;
    @JsonProperty("vod_pwd_down_url")
    private String vodPwdDownUrl;
    @JsonProperty("vod_pwd_play")
    private String vodPwdPlay;
    @JsonProperty("vod_pwd_play_url")
    private String vodPwdPlayUrl;
    @JsonProperty("vod_pwd_url")
    private String vodPwdUrl;
    @JsonProperty("vod_rel_art")
    private String vodRelArt;
    @JsonProperty("vod_rel_vod")
    private String vodRelVod;
    @JsonProperty("vod_remarks")
    private String vodRemarks;
    @JsonProperty("vod_reurl")
    private String vodReurl;
    @JsonProperty("vod_score")
    private String vodScore;
    @JsonProperty("vod_score_all")
    private Integer vodScoreAll;
    @JsonProperty("vod_score_num")
    private Integer vodScoreNum;
    @JsonProperty("vod_serial")
    private String vodSerial;
    @JsonProperty("vod_state")
    private String vodState;
    @JsonProperty("vod_status")
    private Integer vodStatus;
    @JsonProperty("vod_sub")
    private String vodSub;
    @JsonProperty("vod_tag")
    private String vodTag;
    @JsonProperty("vod_time")
    private String vodTime;
    @JsonProperty("vod_time_add")
    private Integer vodTimeAdd;
    @JsonProperty("vod_time_hits")
    private Integer vodTimeHits;
    @JsonProperty("vod_time_make")
    private Integer vodTimeMake;
    @JsonProperty("vod_total")
    private Integer vodTotal;
    @JsonProperty("vod_tpl")
    private String vodTpl;
    @JsonProperty("vod_tpl_down")
    private String vodTplDown;
    @JsonProperty("vod_tpl_play")
    private String vodTplPlay;
    @JsonProperty("vod_trysee")
    private Integer vodTrysee;
    @JsonProperty("vod_tv")
    private String vodTv;
    @JsonProperty("vod_up")
    private Integer vodUp;
    @JsonProperty("vod_version")
    private String vodVersion;
    @JsonProperty("vod_weekday")
    private String vodWeekday;
    @JsonProperty("vod_writer")
    private String vodWriter;
    @JsonProperty("vod_year")
    private String vodYear;

}
