package com.hackgirlszju.service.impl;

import com.hackgirlszju.dao.NomineeMapper;
import com.hackgirlszju.model.Nominee;
import com.hackgirlszju.service.NomineeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by sibylla on 15/11/21.
 */

@Service("NomineeService")
public class NomineeServiceImpl implements NomineeService {

    @Resource
    private NomineeMapper nomineeMapper;

    public int deleteAllByTaskId(Integer taskId) {

        return nomineeMapper.deleteByTaskId(taskId);
    }

    public List<Nominee> listByTaskId(Integer taskId) {

        return nomineeMapper.listByTaskId(taskId);

    }

    public int insertByTaskId(Nominee record) {

        return nomineeMapper.insert(record);

    }
}
