package com.alice.game.service.impl;

import com.alice.game.dao.GCardMapper;
import com.alice.game.entity.GCard;
import com.alice.game.entity.GCardExample;
import com.alice.game.service.CardService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Alice
 * @version 1.0
 * @date 2020/8/22 9:04
 */
public class CardServiceImpl implements CardService {

    @Resource
    GCardMapper gCardMapper;

    @Override
    public int countByExample(GCardExample example) {
        return gCardMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GCardExample example) {
        return gCardMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gCardMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GCard record) {
        return gCardMapper.insert(record);
    }

    @Override
    public int insertSelective(GCard record) {
        return gCardMapper.insertSelective(record);
    }

    @Override
    public List<GCard> selectByExample(GCardExample example) {
        return gCardMapper.selectByExample(example);
    }

    @Override
    public GCard selectByPrimaryKey(Integer id) {
        return gCardMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(GCard record, GCardExample example) {
        return gCardMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(GCard record, GCardExample example) {
        return gCardMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(GCard record) {
        return gCardMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GCard record) {
        return gCardMapper.updateByPrimaryKey(record);
    }
}
