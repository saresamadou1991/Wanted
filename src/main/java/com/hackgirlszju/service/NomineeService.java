package com.hackgirlszju.service;

import com.hackgirlszju.model.Nominee;

import java.util.List;

/**
 * Created by sibylla on 15/11/21.
 */
public interface NomineeService {

    public List<Nominee> listByTaskId(Integer taskId);

    public int deleteAllByTaskId(Integer taskId);

    public int insertByTaskId(Nominee record); //增加候选人

}
