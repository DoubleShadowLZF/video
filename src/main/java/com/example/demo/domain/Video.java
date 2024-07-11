package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName VIDEO
 */
@TableName(value ="VIDEO")
@Data
public class Video implements Serializable {
    /**
     * 
     */
    @TableField(value = "ID")
    private Integer id;

    /**
     * 
     */
    @TableField(value = "GROUP_ID")
    private Integer groupId;

    /**
     * 
     */
    @TableField(value = "TYPE_ID")
    private Integer typeId;

    /**
     * 
     */
    @TableField(value = "TYPE_ID_1")
    private Integer typeId1;

    /**
     * 
     */
    @TableField(value = "TYPE_NAME")
    private String typeName;

    /**
     * 
     */
    @TableField(value = "VOD_ACTOR")
    private String vodActor;

    /**
     * 
     */
    @TableField(value = "VOD_AREA")
    private String vodArea;

    /**
     * 
     */
    @TableField(value = "VOD_AUTHOR")
    private String vodAuthor;

    /**
     * 
     */
    @TableField(value = "VOD_BEHIND")
    private String vodBehind;

    /**
     * 
     */
    @TableField(value = "VOD_BLURB")
    private String vodBlurb;

    /**
     * 
     */
    @TableField(value = "VOD_CLASS")
    private String vodClass;

    /**
     * 
     */
    @TableField(value = "VOD_COLOR")
    private String vodColor;

    /**
     * 
     */
    @TableField(value = "VOD_CONTENT")
    private String vodContent;

    /**
     * 
     */
    @TableField(value = "VOD_COPYRIGHT")
    private Integer vodCopyright;

    /**
     * 
     */
    @TableField(value = "VOD_DIRECTOR")
    private String vodDirector;

    /**
     * 
     */
    @TableField(value = "VOD_DOUBAN_ID")
    private Integer vodDoubanId;

    /**
     * 
     */
    @TableField(value = "VOD_DOUBAN_SCORE")
    private String vodDoubanScore;

    /**
     * 
     */
    @TableField(value = "VOD_DOWN")
    private Integer vodDown;

    /**
     * 
     */
    @TableField(value = "VOD_DOWN_FROM")
    private String vodDownFrom;

    /**
     * 
     */
    @TableField(value = "VOD_DOWN_NOTE")
    private String vodDownNote;

    /**
     * 
     */
    @TableField(value = "VOD_DOWN_SERVER")
    private String vodDownServer;

    /**
     * 
     */
    @TableField(value = "VOD_DOWN_URL")
    private String vodDownUrl;

    /**
     * 
     */
    @TableField(value = "VOD_DURATION")
    private String vodDuration;

    /**
     * 
     */
    @TableField(value = "VOD_EN")
    private String vodEn;

    /**
     * 
     */
    @TableField(value = "VOD_HITS")
    private Integer vodHits;

    /**
     * 
     */
    @TableField(value = "VOD_HITS_DAY")
    private Integer vodHitsDay;

    /**
     * 
     */
    @TableField(value = "VOD_HITS_MONTH")
    private Integer vodHitsMonth;

    /**
     * 
     */
    @TableField(value = "VOD_HITS_WEEK")
    private Integer vodHitsWeek;

    /**
     * 
     */
    @TableField(value = "VOD_ID")
    private Integer vodId;

    /**
     * 
     */
    @TableField(value = "VOD_ISEND")
    private Integer vodIsend;

    /**
     * 
     */
    @TableField(value = "VOD_JUMPURL")
    private String vodJumpurl;

    /**
     * 
     */
    @TableField(value = "VOD_LANG")
    private String vodLang;

    /**
     * 
     */
    @TableField(value = "VOD_LETTER")
    private String vodLetter;

    /**
     * 
     */
    @TableField(value = "VOD_LEVEL")
    private Integer vodLevel;

    /**
     * 
     */
    @TableField(value = "VOD_LOCK")
    private Integer vodLock;

    /**
     * 
     */
    @TableField(value = "VOD_NAME")
    private String vodName;

    /**
     * 
     */
    @TableField(value = "VOD_PIC")
    private String vodPic;

    /**
     * 
     */
    @TableField(value = "VOD_PIC_SCREENSHOT")
    private String vodPicScreenshot;

    /**
     * 
     */
    @TableField(value = "VOD_PIC_SLIDE")
    private String vodPicSlide;

    /**
     * 
     */
    @TableField(value = "VOD_PIC_THUMB")
    private String vodPicThumb;

    /**
     * 
     */
    @TableField(value = "VOD_PLAY_FROM")
    private String vodPlayFrom;

    /**
     * 
     */
    @TableField(value = "VOD_PLAY_NOTE")
    private String vodPlayNote;

    /**
     * 
     */
    @TableField(value = "VOD_PLAY_SERVER")
    private String vodPlayServer;

    /**
     * 
     */
    @TableField(value = "VOD_PLOT")
    private Integer vodPlot;

    /**
     * 
     */
    @TableField(value = "VOD_PLOT_DETAIL")
    private String vodPlotDetail;

    /**
     * 
     */
    @TableField(value = "VOD_PLOT_NAME")
    private String vodPlotName;

    /**
     * 
     */
    @TableField(value = "VOD_POINTS")
    private Integer vodPoints;

    /**
     * 
     */
    @TableField(value = "VOD_POINTS_DOWN")
    private Integer vodPointsDown;

    /**
     * 
     */
    @TableField(value = "VOD_POINTS_PLAY")
    private Integer vodPointsPlay;

    /**
     * 
     */
    @TableField(value = "VOD_PUBDATE")
    private String vodPubdate;

    /**
     * 
     */
    @TableField(value = "VOD_PWD")
    private String vodPwd;

    /**
     * 
     */
    @TableField(value = "VOD_PWD_DOWN")
    private String vodPwdDown;

    /**
     * 
     */
    @TableField(value = "VOD_PWD_DOWN_URL")
    private String vodPwdDownUrl;

    /**
     * 
     */
    @TableField(value = "VOD_PWD_PLAY")
    private String vodPwdPlay;

    /**
     * 
     */
    @TableField(value = "VOD_PWD_PLAY_URL")
    private String vodPwdPlayUrl;

    /**
     * 
     */
    @TableField(value = "VOD_PWD_URL")
    private String vodPwdUrl;

    /**
     * 
     */
    @TableField(value = "VOD_REL_ART")
    private String vodRelArt;

    /**
     * 
     */
    @TableField(value = "VOD_REL_VOD")
    private String vodRelVod;

    /**
     * 
     */
    @TableField(value = "VOD_REMARKS")
    private String vodRemarks;

    /**
     * 
     */
    @TableField(value = "VOD_REURL")
    private String vodReurl;

    /**
     * 
     */
    @TableField(value = "VOD_SCORE")
    private String vodScore;

    /**
     * 
     */
    @TableField(value = "VOD_SCORE_ALL")
    private Integer vodScoreAll;

    /**
     * 
     */
    @TableField(value = "VOD_SCORE_NUM")
    private Integer vodScoreNum;

    /**
     * 
     */
    @TableField(value = "VOD_SERIAL")
    private String vodSerial;

    /**
     * 
     */
    @TableField(value = "VOD_STATE")
    private String vodState;

    /**
     * 
     */
    @TableField(value = "VOD_STATUS")
    private Integer vodStatus;

    /**
     * 
     */
    @TableField(value = "VOD_SUB")
    private String vodSub;

    /**
     * 
     */
    @TableField(value = "VOD_TAG")
    private String vodTag;

    /**
     * 
     */
    @TableField(value = "VOD_TIME")
    private String vodTime;

    /**
     * 
     */
    @TableField(value = "VOD_TIME_ADD")
    private Integer vodTimeAdd;

    /**
     * 
     */
    @TableField(value = "VOD_TIME_HITS")
    private Integer vodTimeHits;

    /**
     * 
     */
    @TableField(value = "VOD_TIME_MAKE")
    private Integer vodTimeMake;

    /**
     * 
     */
    @TableField(value = "VOD_TOTAL")
    private Integer vodTotal;

    /**
     * 
     */
    @TableField(value = "VOD_TPL")
    private String vodTpl;

    /**
     * 
     */
    @TableField(value = "VOD_TPL_DOWN")
    private String vodTplDown;

    /**
     * 
     */
    @TableField(value = "VOD_TPL_PLAY")
    private String vodTplPlay;

    /**
     * 
     */
    @TableField(value = "VOD_TRYSEE")
    private Integer vodTrysee;

    /**
     * 
     */
    @TableField(value = "VOD_TV")
    private String vodTv;

    /**
     * 
     */
    @TableField(value = "VOD_UP")
    private Integer vodUp;

    /**
     * 
     */
    @TableField(value = "VOD_VERSION")
    private String vodVersion;

    /**
     * 
     */
    @TableField(value = "VOD_WEEKDAY")
    private String vodWeekday;

    /**
     * 
     */
    @TableField(value = "VOD_WRITER")
    private String vodWriter;

    /**
     * 
     */
    @TableField(value = "VOD_YEAR")
    private String vodYear;

    /**
     * 
     */
    @TableField(value = "CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 
     */
    @TableField(value = "UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Video other = (Video) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getTypeId1() == null ? other.getTypeId1() == null : this.getTypeId1().equals(other.getTypeId1()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getVodActor() == null ? other.getVodActor() == null : this.getVodActor().equals(other.getVodActor()))
            && (this.getVodArea() == null ? other.getVodArea() == null : this.getVodArea().equals(other.getVodArea()))
            && (this.getVodAuthor() == null ? other.getVodAuthor() == null : this.getVodAuthor().equals(other.getVodAuthor()))
            && (this.getVodBehind() == null ? other.getVodBehind() == null : this.getVodBehind().equals(other.getVodBehind()))
            && (this.getVodBlurb() == null ? other.getVodBlurb() == null : this.getVodBlurb().equals(other.getVodBlurb()))
            && (this.getVodClass() == null ? other.getVodClass() == null : this.getVodClass().equals(other.getVodClass()))
            && (this.getVodColor() == null ? other.getVodColor() == null : this.getVodColor().equals(other.getVodColor()))
            && (this.getVodContent() == null ? other.getVodContent() == null : this.getVodContent().equals(other.getVodContent()))
            && (this.getVodCopyright() == null ? other.getVodCopyright() == null : this.getVodCopyright().equals(other.getVodCopyright()))
            && (this.getVodDirector() == null ? other.getVodDirector() == null : this.getVodDirector().equals(other.getVodDirector()))
            && (this.getVodDoubanId() == null ? other.getVodDoubanId() == null : this.getVodDoubanId().equals(other.getVodDoubanId()))
            && (this.getVodDoubanScore() == null ? other.getVodDoubanScore() == null : this.getVodDoubanScore().equals(other.getVodDoubanScore()))
            && (this.getVodDown() == null ? other.getVodDown() == null : this.getVodDown().equals(other.getVodDown()))
            && (this.getVodDownFrom() == null ? other.getVodDownFrom() == null : this.getVodDownFrom().equals(other.getVodDownFrom()))
            && (this.getVodDownNote() == null ? other.getVodDownNote() == null : this.getVodDownNote().equals(other.getVodDownNote()))
            && (this.getVodDownServer() == null ? other.getVodDownServer() == null : this.getVodDownServer().equals(other.getVodDownServer()))
            && (this.getVodDownUrl() == null ? other.getVodDownUrl() == null : this.getVodDownUrl().equals(other.getVodDownUrl()))
            && (this.getVodDuration() == null ? other.getVodDuration() == null : this.getVodDuration().equals(other.getVodDuration()))
            && (this.getVodEn() == null ? other.getVodEn() == null : this.getVodEn().equals(other.getVodEn()))
            && (this.getVodHits() == null ? other.getVodHits() == null : this.getVodHits().equals(other.getVodHits()))
            && (this.getVodHitsDay() == null ? other.getVodHitsDay() == null : this.getVodHitsDay().equals(other.getVodHitsDay()))
            && (this.getVodHitsMonth() == null ? other.getVodHitsMonth() == null : this.getVodHitsMonth().equals(other.getVodHitsMonth()))
            && (this.getVodHitsWeek() == null ? other.getVodHitsWeek() == null : this.getVodHitsWeek().equals(other.getVodHitsWeek()))
            && (this.getVodId() == null ? other.getVodId() == null : this.getVodId().equals(other.getVodId()))
            && (this.getVodIsend() == null ? other.getVodIsend() == null : this.getVodIsend().equals(other.getVodIsend()))
            && (this.getVodJumpurl() == null ? other.getVodJumpurl() == null : this.getVodJumpurl().equals(other.getVodJumpurl()))
            && (this.getVodLang() == null ? other.getVodLang() == null : this.getVodLang().equals(other.getVodLang()))
            && (this.getVodLetter() == null ? other.getVodLetter() == null : this.getVodLetter().equals(other.getVodLetter()))
            && (this.getVodLevel() == null ? other.getVodLevel() == null : this.getVodLevel().equals(other.getVodLevel()))
            && (this.getVodLock() == null ? other.getVodLock() == null : this.getVodLock().equals(other.getVodLock()))
            && (this.getVodName() == null ? other.getVodName() == null : this.getVodName().equals(other.getVodName()))
            && (this.getVodPic() == null ? other.getVodPic() == null : this.getVodPic().equals(other.getVodPic()))
            && (this.getVodPicScreenshot() == null ? other.getVodPicScreenshot() == null : this.getVodPicScreenshot().equals(other.getVodPicScreenshot()))
            && (this.getVodPicSlide() == null ? other.getVodPicSlide() == null : this.getVodPicSlide().equals(other.getVodPicSlide()))
            && (this.getVodPicThumb() == null ? other.getVodPicThumb() == null : this.getVodPicThumb().equals(other.getVodPicThumb()))
            && (this.getVodPlayFrom() == null ? other.getVodPlayFrom() == null : this.getVodPlayFrom().equals(other.getVodPlayFrom()))
            && (this.getVodPlayNote() == null ? other.getVodPlayNote() == null : this.getVodPlayNote().equals(other.getVodPlayNote()))
            && (this.getVodPlayServer() == null ? other.getVodPlayServer() == null : this.getVodPlayServer().equals(other.getVodPlayServer()))
            && (this.getVodPlot() == null ? other.getVodPlot() == null : this.getVodPlot().equals(other.getVodPlot()))
            && (this.getVodPlotDetail() == null ? other.getVodPlotDetail() == null : this.getVodPlotDetail().equals(other.getVodPlotDetail()))
            && (this.getVodPlotName() == null ? other.getVodPlotName() == null : this.getVodPlotName().equals(other.getVodPlotName()))
            && (this.getVodPoints() == null ? other.getVodPoints() == null : this.getVodPoints().equals(other.getVodPoints()))
            && (this.getVodPointsDown() == null ? other.getVodPointsDown() == null : this.getVodPointsDown().equals(other.getVodPointsDown()))
            && (this.getVodPointsPlay() == null ? other.getVodPointsPlay() == null : this.getVodPointsPlay().equals(other.getVodPointsPlay()))
            && (this.getVodPubdate() == null ? other.getVodPubdate() == null : this.getVodPubdate().equals(other.getVodPubdate()))
            && (this.getVodPwd() == null ? other.getVodPwd() == null : this.getVodPwd().equals(other.getVodPwd()))
            && (this.getVodPwdDown() == null ? other.getVodPwdDown() == null : this.getVodPwdDown().equals(other.getVodPwdDown()))
            && (this.getVodPwdDownUrl() == null ? other.getVodPwdDownUrl() == null : this.getVodPwdDownUrl().equals(other.getVodPwdDownUrl()))
            && (this.getVodPwdPlay() == null ? other.getVodPwdPlay() == null : this.getVodPwdPlay().equals(other.getVodPwdPlay()))
            && (this.getVodPwdPlayUrl() == null ? other.getVodPwdPlayUrl() == null : this.getVodPwdPlayUrl().equals(other.getVodPwdPlayUrl()))
            && (this.getVodPwdUrl() == null ? other.getVodPwdUrl() == null : this.getVodPwdUrl().equals(other.getVodPwdUrl()))
            && (this.getVodRelArt() == null ? other.getVodRelArt() == null : this.getVodRelArt().equals(other.getVodRelArt()))
            && (this.getVodRelVod() == null ? other.getVodRelVod() == null : this.getVodRelVod().equals(other.getVodRelVod()))
            && (this.getVodRemarks() == null ? other.getVodRemarks() == null : this.getVodRemarks().equals(other.getVodRemarks()))
            && (this.getVodReurl() == null ? other.getVodReurl() == null : this.getVodReurl().equals(other.getVodReurl()))
            && (this.getVodScore() == null ? other.getVodScore() == null : this.getVodScore().equals(other.getVodScore()))
            && (this.getVodScoreAll() == null ? other.getVodScoreAll() == null : this.getVodScoreAll().equals(other.getVodScoreAll()))
            && (this.getVodScoreNum() == null ? other.getVodScoreNum() == null : this.getVodScoreNum().equals(other.getVodScoreNum()))
            && (this.getVodSerial() == null ? other.getVodSerial() == null : this.getVodSerial().equals(other.getVodSerial()))
            && (this.getVodState() == null ? other.getVodState() == null : this.getVodState().equals(other.getVodState()))
            && (this.getVodStatus() == null ? other.getVodStatus() == null : this.getVodStatus().equals(other.getVodStatus()))
            && (this.getVodSub() == null ? other.getVodSub() == null : this.getVodSub().equals(other.getVodSub()))
            && (this.getVodTag() == null ? other.getVodTag() == null : this.getVodTag().equals(other.getVodTag()))
            && (this.getVodTime() == null ? other.getVodTime() == null : this.getVodTime().equals(other.getVodTime()))
            && (this.getVodTimeAdd() == null ? other.getVodTimeAdd() == null : this.getVodTimeAdd().equals(other.getVodTimeAdd()))
            && (this.getVodTimeHits() == null ? other.getVodTimeHits() == null : this.getVodTimeHits().equals(other.getVodTimeHits()))
            && (this.getVodTimeMake() == null ? other.getVodTimeMake() == null : this.getVodTimeMake().equals(other.getVodTimeMake()))
            && (this.getVodTotal() == null ? other.getVodTotal() == null : this.getVodTotal().equals(other.getVodTotal()))
            && (this.getVodTpl() == null ? other.getVodTpl() == null : this.getVodTpl().equals(other.getVodTpl()))
            && (this.getVodTplDown() == null ? other.getVodTplDown() == null : this.getVodTplDown().equals(other.getVodTplDown()))
            && (this.getVodTplPlay() == null ? other.getVodTplPlay() == null : this.getVodTplPlay().equals(other.getVodTplPlay()))
            && (this.getVodTrysee() == null ? other.getVodTrysee() == null : this.getVodTrysee().equals(other.getVodTrysee()))
            && (this.getVodTv() == null ? other.getVodTv() == null : this.getVodTv().equals(other.getVodTv()))
            && (this.getVodUp() == null ? other.getVodUp() == null : this.getVodUp().equals(other.getVodUp()))
            && (this.getVodVersion() == null ? other.getVodVersion() == null : this.getVodVersion().equals(other.getVodVersion()))
            && (this.getVodWeekday() == null ? other.getVodWeekday() == null : this.getVodWeekday().equals(other.getVodWeekday()))
            && (this.getVodWriter() == null ? other.getVodWriter() == null : this.getVodWriter().equals(other.getVodWriter()))
            && (this.getVodYear() == null ? other.getVodYear() == null : this.getVodYear().equals(other.getVodYear()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getTypeId1() == null) ? 0 : getTypeId1().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getVodActor() == null) ? 0 : getVodActor().hashCode());
        result = prime * result + ((getVodArea() == null) ? 0 : getVodArea().hashCode());
        result = prime * result + ((getVodAuthor() == null) ? 0 : getVodAuthor().hashCode());
        result = prime * result + ((getVodBehind() == null) ? 0 : getVodBehind().hashCode());
        result = prime * result + ((getVodBlurb() == null) ? 0 : getVodBlurb().hashCode());
        result = prime * result + ((getVodClass() == null) ? 0 : getVodClass().hashCode());
        result = prime * result + ((getVodColor() == null) ? 0 : getVodColor().hashCode());
        result = prime * result + ((getVodContent() == null) ? 0 : getVodContent().hashCode());
        result = prime * result + ((getVodCopyright() == null) ? 0 : getVodCopyright().hashCode());
        result = prime * result + ((getVodDirector() == null) ? 0 : getVodDirector().hashCode());
        result = prime * result + ((getVodDoubanId() == null) ? 0 : getVodDoubanId().hashCode());
        result = prime * result + ((getVodDoubanScore() == null) ? 0 : getVodDoubanScore().hashCode());
        result = prime * result + ((getVodDown() == null) ? 0 : getVodDown().hashCode());
        result = prime * result + ((getVodDownFrom() == null) ? 0 : getVodDownFrom().hashCode());
        result = prime * result + ((getVodDownNote() == null) ? 0 : getVodDownNote().hashCode());
        result = prime * result + ((getVodDownServer() == null) ? 0 : getVodDownServer().hashCode());
        result = prime * result + ((getVodDownUrl() == null) ? 0 : getVodDownUrl().hashCode());
        result = prime * result + ((getVodDuration() == null) ? 0 : getVodDuration().hashCode());
        result = prime * result + ((getVodEn() == null) ? 0 : getVodEn().hashCode());
        result = prime * result + ((getVodHits() == null) ? 0 : getVodHits().hashCode());
        result = prime * result + ((getVodHitsDay() == null) ? 0 : getVodHitsDay().hashCode());
        result = prime * result + ((getVodHitsMonth() == null) ? 0 : getVodHitsMonth().hashCode());
        result = prime * result + ((getVodHitsWeek() == null) ? 0 : getVodHitsWeek().hashCode());
        result = prime * result + ((getVodId() == null) ? 0 : getVodId().hashCode());
        result = prime * result + ((getVodIsend() == null) ? 0 : getVodIsend().hashCode());
        result = prime * result + ((getVodJumpurl() == null) ? 0 : getVodJumpurl().hashCode());
        result = prime * result + ((getVodLang() == null) ? 0 : getVodLang().hashCode());
        result = prime * result + ((getVodLetter() == null) ? 0 : getVodLetter().hashCode());
        result = prime * result + ((getVodLevel() == null) ? 0 : getVodLevel().hashCode());
        result = prime * result + ((getVodLock() == null) ? 0 : getVodLock().hashCode());
        result = prime * result + ((getVodName() == null) ? 0 : getVodName().hashCode());
        result = prime * result + ((getVodPic() == null) ? 0 : getVodPic().hashCode());
        result = prime * result + ((getVodPicScreenshot() == null) ? 0 : getVodPicScreenshot().hashCode());
        result = prime * result + ((getVodPicSlide() == null) ? 0 : getVodPicSlide().hashCode());
        result = prime * result + ((getVodPicThumb() == null) ? 0 : getVodPicThumb().hashCode());
        result = prime * result + ((getVodPlayFrom() == null) ? 0 : getVodPlayFrom().hashCode());
        result = prime * result + ((getVodPlayNote() == null) ? 0 : getVodPlayNote().hashCode());
        result = prime * result + ((getVodPlayServer() == null) ? 0 : getVodPlayServer().hashCode());
        result = prime * result + ((getVodPlot() == null) ? 0 : getVodPlot().hashCode());
        result = prime * result + ((getVodPlotDetail() == null) ? 0 : getVodPlotDetail().hashCode());
        result = prime * result + ((getVodPlotName() == null) ? 0 : getVodPlotName().hashCode());
        result = prime * result + ((getVodPoints() == null) ? 0 : getVodPoints().hashCode());
        result = prime * result + ((getVodPointsDown() == null) ? 0 : getVodPointsDown().hashCode());
        result = prime * result + ((getVodPointsPlay() == null) ? 0 : getVodPointsPlay().hashCode());
        result = prime * result + ((getVodPubdate() == null) ? 0 : getVodPubdate().hashCode());
        result = prime * result + ((getVodPwd() == null) ? 0 : getVodPwd().hashCode());
        result = prime * result + ((getVodPwdDown() == null) ? 0 : getVodPwdDown().hashCode());
        result = prime * result + ((getVodPwdDownUrl() == null) ? 0 : getVodPwdDownUrl().hashCode());
        result = prime * result + ((getVodPwdPlay() == null) ? 0 : getVodPwdPlay().hashCode());
        result = prime * result + ((getVodPwdPlayUrl() == null) ? 0 : getVodPwdPlayUrl().hashCode());
        result = prime * result + ((getVodPwdUrl() == null) ? 0 : getVodPwdUrl().hashCode());
        result = prime * result + ((getVodRelArt() == null) ? 0 : getVodRelArt().hashCode());
        result = prime * result + ((getVodRelVod() == null) ? 0 : getVodRelVod().hashCode());
        result = prime * result + ((getVodRemarks() == null) ? 0 : getVodRemarks().hashCode());
        result = prime * result + ((getVodReurl() == null) ? 0 : getVodReurl().hashCode());
        result = prime * result + ((getVodScore() == null) ? 0 : getVodScore().hashCode());
        result = prime * result + ((getVodScoreAll() == null) ? 0 : getVodScoreAll().hashCode());
        result = prime * result + ((getVodScoreNum() == null) ? 0 : getVodScoreNum().hashCode());
        result = prime * result + ((getVodSerial() == null) ? 0 : getVodSerial().hashCode());
        result = prime * result + ((getVodState() == null) ? 0 : getVodState().hashCode());
        result = prime * result + ((getVodStatus() == null) ? 0 : getVodStatus().hashCode());
        result = prime * result + ((getVodSub() == null) ? 0 : getVodSub().hashCode());
        result = prime * result + ((getVodTag() == null) ? 0 : getVodTag().hashCode());
        result = prime * result + ((getVodTime() == null) ? 0 : getVodTime().hashCode());
        result = prime * result + ((getVodTimeAdd() == null) ? 0 : getVodTimeAdd().hashCode());
        result = prime * result + ((getVodTimeHits() == null) ? 0 : getVodTimeHits().hashCode());
        result = prime * result + ((getVodTimeMake() == null) ? 0 : getVodTimeMake().hashCode());
        result = prime * result + ((getVodTotal() == null) ? 0 : getVodTotal().hashCode());
        result = prime * result + ((getVodTpl() == null) ? 0 : getVodTpl().hashCode());
        result = prime * result + ((getVodTplDown() == null) ? 0 : getVodTplDown().hashCode());
        result = prime * result + ((getVodTplPlay() == null) ? 0 : getVodTplPlay().hashCode());
        result = prime * result + ((getVodTrysee() == null) ? 0 : getVodTrysee().hashCode());
        result = prime * result + ((getVodTv() == null) ? 0 : getVodTv().hashCode());
        result = prime * result + ((getVodUp() == null) ? 0 : getVodUp().hashCode());
        result = prime * result + ((getVodVersion() == null) ? 0 : getVodVersion().hashCode());
        result = prime * result + ((getVodWeekday() == null) ? 0 : getVodWeekday().hashCode());
        result = prime * result + ((getVodWriter() == null) ? 0 : getVodWriter().hashCode());
        result = prime * result + ((getVodYear() == null) ? 0 : getVodYear().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", groupId=").append(groupId);
        sb.append(", typeId=").append(typeId);
        sb.append(", typeId1=").append(typeId1);
        sb.append(", typeName=").append(typeName);
        sb.append(", vodActor=").append(vodActor);
        sb.append(", vodArea=").append(vodArea);
        sb.append(", vodAuthor=").append(vodAuthor);
        sb.append(", vodBehind=").append(vodBehind);
        sb.append(", vodBlurb=").append(vodBlurb);
        sb.append(", vodClass=").append(vodClass);
        sb.append(", vodColor=").append(vodColor);
        sb.append(", vodContent=").append(vodContent);
        sb.append(", vodCopyright=").append(vodCopyright);
        sb.append(", vodDirector=").append(vodDirector);
        sb.append(", vodDoubanId=").append(vodDoubanId);
        sb.append(", vodDoubanScore=").append(vodDoubanScore);
        sb.append(", vodDown=").append(vodDown);
        sb.append(", vodDownFrom=").append(vodDownFrom);
        sb.append(", vodDownNote=").append(vodDownNote);
        sb.append(", vodDownServer=").append(vodDownServer);
        sb.append(", vodDownUrl=").append(vodDownUrl);
        sb.append(", vodDuration=").append(vodDuration);
        sb.append(", vodEn=").append(vodEn);
        sb.append(", vodHits=").append(vodHits);
        sb.append(", vodHitsDay=").append(vodHitsDay);
        sb.append(", vodHitsMonth=").append(vodHitsMonth);
        sb.append(", vodHitsWeek=").append(vodHitsWeek);
        sb.append(", vodId=").append(vodId);
        sb.append(", vodIsend=").append(vodIsend);
        sb.append(", vodJumpurl=").append(vodJumpurl);
        sb.append(", vodLang=").append(vodLang);
        sb.append(", vodLetter=").append(vodLetter);
        sb.append(", vodLevel=").append(vodLevel);
        sb.append(", vodLock=").append(vodLock);
        sb.append(", vodName=").append(vodName);
        sb.append(", vodPic=").append(vodPic);
        sb.append(", vodPicScreenshot=").append(vodPicScreenshot);
        sb.append(", vodPicSlide=").append(vodPicSlide);
        sb.append(", vodPicThumb=").append(vodPicThumb);
        sb.append(", vodPlayFrom=").append(vodPlayFrom);
        sb.append(", vodPlayNote=").append(vodPlayNote);
        sb.append(", vodPlayServer=").append(vodPlayServer);
        sb.append(", vodPlot=").append(vodPlot);
        sb.append(", vodPlotDetail=").append(vodPlotDetail);
        sb.append(", vodPlotName=").append(vodPlotName);
        sb.append(", vodPoints=").append(vodPoints);
        sb.append(", vodPointsDown=").append(vodPointsDown);
        sb.append(", vodPointsPlay=").append(vodPointsPlay);
        sb.append(", vodPubdate=").append(vodPubdate);
        sb.append(", vodPwd=").append(vodPwd);
        sb.append(", vodPwdDown=").append(vodPwdDown);
        sb.append(", vodPwdDownUrl=").append(vodPwdDownUrl);
        sb.append(", vodPwdPlay=").append(vodPwdPlay);
        sb.append(", vodPwdPlayUrl=").append(vodPwdPlayUrl);
        sb.append(", vodPwdUrl=").append(vodPwdUrl);
        sb.append(", vodRelArt=").append(vodRelArt);
        sb.append(", vodRelVod=").append(vodRelVod);
        sb.append(", vodRemarks=").append(vodRemarks);
        sb.append(", vodReurl=").append(vodReurl);
        sb.append(", vodScore=").append(vodScore);
        sb.append(", vodScoreAll=").append(vodScoreAll);
        sb.append(", vodScoreNum=").append(vodScoreNum);
        sb.append(", vodSerial=").append(vodSerial);
        sb.append(", vodState=").append(vodState);
        sb.append(", vodStatus=").append(vodStatus);
        sb.append(", vodSub=").append(vodSub);
        sb.append(", vodTag=").append(vodTag);
        sb.append(", vodTime=").append(vodTime);
        sb.append(", vodTimeAdd=").append(vodTimeAdd);
        sb.append(", vodTimeHits=").append(vodTimeHits);
        sb.append(", vodTimeMake=").append(vodTimeMake);
        sb.append(", vodTotal=").append(vodTotal);
        sb.append(", vodTpl=").append(vodTpl);
        sb.append(", vodTplDown=").append(vodTplDown);
        sb.append(", vodTplPlay=").append(vodTplPlay);
        sb.append(", vodTrysee=").append(vodTrysee);
        sb.append(", vodTv=").append(vodTv);
        sb.append(", vodUp=").append(vodUp);
        sb.append(", vodVersion=").append(vodVersion);
        sb.append(", vodWeekday=").append(vodWeekday);
        sb.append(", vodWriter=").append(vodWriter);
        sb.append(", vodYear=").append(vodYear);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}