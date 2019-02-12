package com.tianfj.springboot_test.service.impl;

import com.tianfj.springboot_test.dao.domain.MusicInfo;
import com.tianfj.springboot_test.dao.mapper.MusicInfoMapper;
import com.tianfj.springboot_test.service.MusicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicInfoServiceImpl implements MusicInfoService {

    @Autowired
    private MusicInfoMapper musicInfoMapper;

    @Override
    public List<MusicInfo> getMusicInfo() {
        List<MusicInfo> musicInfos = musicInfoMapper.selectAll();
        return musicInfos;
    }
}