package com.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.domain.TEmp;

public interface TEmpDao {
    int deleteByPrimaryKey(Integer empno);

    int insert(TEmp record);

    int insertSelective(TEmp record);

    TEmp selectByPrimaryKey(Integer empno);

    int updateByPrimaryKeySelective(TEmp record);

    int updateByPrimaryKey(TEmp record);
    
    List<TEmp> findAll();
}