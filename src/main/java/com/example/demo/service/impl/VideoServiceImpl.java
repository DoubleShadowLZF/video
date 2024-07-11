package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.Video;
import com.example.demo.service.VideoService;
import com.example.demo.mapper.VideoMapper;
import org.springframework.stereotype.Service;

/**
* @author Double
* @description 针对表【VIDEO】的数据库操作Service实现
* @createDate 2024-07-09 02:03:05
*/
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video>
    implements VideoService{

}




