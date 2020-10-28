package com.example.demo.dao;

import com.example.demo.pojo.student;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface studentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(student record);

    student selectByPrimaryKey(Integer id);

    List<student> selectAll();

    int updateByPrimaryKey(student record);
}