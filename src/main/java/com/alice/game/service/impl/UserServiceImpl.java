package com.alice.game.service.impl;

import com.alice.game.dao.GUserMapper;
import com.alice.game.entity.GUser;
import com.alice.game.entity.GUserExample;
import com.alice.game.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Alice
 * @version 1.0
 * @date 2020/8/22 9:04
 */
public class UserServiceImpl implements UserService {

    @Resource
    GUserMapper gUserMapper;

    @Override
    public int countByExample(GUserExample example) {
        return gUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GUserExample example) {
        return gUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GUser record) {
        return gUserMapper.insert(record);
    }

    @Override
    public int insertSelective(GUser record) {
        return gUserMapper.insertSelective(record);
    }

    @Override
    public List<GUser> selectByExample(GUserExample example) {
        return gUserMapper.selectByExample(example);
    }

    @Override
    public GUser selectByPrimaryKey(Integer id) {
        return gUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(GUser record, GUserExample example) {
        return gUserMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(GUser record, GUserExample example) {
        return gUserMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(GUser record) {
        return gUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GUser record) {
        return gUserMapper.updateByPrimaryKey(record);
    }
}
