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
 * @TableName VIDEO_PATH
 */
@TableName(value ="VIDEO_PATH")
@Data
public class VideoPath implements Serializable {
    /**
     * 
     */
    @TableField(value = "ID")
    private Integer id;

    /**
     * 
     */
    @TableField(value = "PATH")
    private String path;

    /**
     * 
     */
    @TableField(value = "REMARK")
    private String remark;

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

    /**
     * source_path
     */
    @TableField(value = "SOURCE_PATH")
    private String sourcePath;

    /**
     * 
     */
    @TableField(value = "VOD_ID")
    private Integer vodId;

    /**
     * 
     */
    @TableField(value = "SOURCE_FILE")
    private String sourceFile;

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
        VideoPath other = (VideoPath) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getSourcePath() == null ? other.getSourcePath() == null : this.getSourcePath().equals(other.getSourcePath()))
            && (this.getVodId() == null ? other.getVodId() == null : this.getVodId().equals(other.getVodId()))
            && (this.getSourceFile() == null ? other.getSourceFile() == null : this.getSourceFile().equals(other.getSourceFile()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getSourcePath() == null) ? 0 : getSourcePath().hashCode());
        result = prime * result + ((getVodId() == null) ? 0 : getVodId().hashCode());
        result = prime * result + ((getSourceFile() == null) ? 0 : getSourceFile().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", path=").append(path);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", sourcePath=").append(sourcePath);
        sb.append(", vodId=").append(vodId);
        sb.append(", sourceFile=").append(sourceFile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}