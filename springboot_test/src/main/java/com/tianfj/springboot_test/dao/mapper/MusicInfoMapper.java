package com.tianfj.springboot_test.dao.mapper;
import com.tianfj.springboot_test.dao.domain.MusicInfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MusicInfoMapper {

    List<MusicInfo> selectAll();
}
