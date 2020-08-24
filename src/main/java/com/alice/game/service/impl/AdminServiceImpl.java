package com.alice.game.service.impl;

import com.alice.game.dao.GAdminMapper;
import com.alice.game.entity.GAdmin;
import com.alice.game.entity.GAdminExample;
import com.alice.game.service.AdminService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Alice
 * @version 1.0
 * @date 2020/8/22 9:03
 */
public class AdminServiceImpl implements AdminService {

    @Resource
    GAdminMapper gAdminMapper;

    @Override
    public int countByExample(GAdminExample example) {
        return gAdminMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GAdminExample example) {
        return gAdminMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gAdminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GAdmin record) {
        return gAdminMapper.insert(record);
    }

    @Override
    public int insertSelective(GAdmin record) {
        return gAdminMapper.insertSelective(record);
    }

    @Override
    public List<GAdmin> selectByExample(GAdminExample example) {
        return gAdminMapper.selectByExample(example);
    }

    @Override
    public GAdmin selectByPrimaryKey(Integer id) {
        return gAdminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(GAdmin record, GAdminExample example) {
        return gAdminMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(GAdmin record, GAdminExample example) {
        return gAdminMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(GAdmin record) {
        return gAdminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GAdmin record) {
        return gAdminMapper.updateByPrimaryKey(record);
    }
}
