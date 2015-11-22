package com.hackgirlszju.dao;

import com.hackgirlszju.model.Nominee;
import com.hackgirlszju.model.NomineeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NomineeMapper {

    List<Nominee> listByTaskId(@Param("taskId")Integer taskId);

    int deleteByTaskId(@Param("taskId")Integer taskId);

    int insert(Nominee record);


}