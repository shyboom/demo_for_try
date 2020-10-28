package com.example.demo.dao;

import com.example.demo.pojo.score;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface scoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(score record);

    score selectByPrimaryKey(Integer id);

    List<score> selectAll();

    int updateByPrimaryKey(score record);
}