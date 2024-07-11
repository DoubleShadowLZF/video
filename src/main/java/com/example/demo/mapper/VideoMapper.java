package com.example.demo.mapper;

import com.example.demo.domain.Video;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.view.VodListView;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author Double
* @description 针对表【VIDEO】的数据库操作Mapper
* @createDate 2024-07-09 02:03:05
* @Entity com.example.demo.domain.Video
*/
public interface VideoMapper extends BaseMapper<Video> {

    @Select("select id vodId,VOD_NAME voName,VOD_PIC vodPic,VOD_REMARKS vodRemarks from SEX_WEB.video where TYPE_ID_1 = #{movtype};")
    public List<VodListView> getVideoByTypeId(@Param("movtype") Integer movtype);

}




