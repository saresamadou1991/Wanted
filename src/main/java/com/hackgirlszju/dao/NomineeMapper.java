package com.hackgirlszju.dao;

import com.hackgirlszju.model.Nominee;
import com.hackgirlszju.model.NomineeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NomineeMapper {
    int countByExample(NomineeExample example);

    int deleteByExample(NomineeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Nominee record);

    int insertSelective(Nominee record);

    List<Nominee> selectByExample(NomineeExample example);

    Nominee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Nominee record, @Param("example") NomineeExample example);

    int updateByExample(@Param("record") Nominee record, @Param("example") NomineeExample example);

    int updateByPrimaryKeySelective(Nominee record);

    int updateByPrimaryKey(Nominee record);
}