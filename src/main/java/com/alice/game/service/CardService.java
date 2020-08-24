package com.alice.game.service;

import com.alice.game.entity.GCard;
import com.alice.game.entity.GCardExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alice
 * @version 1.0
 * @date 2020/8/22 9:01
 */
@Service
public interface CardService {
    int countByExample(GCardExample example);

    int deleteByExample(GCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GCard record);

    int insertSelective(GCard record);

    List<GCard> selectByExample(GCardExample example);

    GCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GCard record, @Param("example") GCardExample example);

    int updateByExample(@Param("record") GCard record, @Param("example") GCardExample example);

    int updateByPrimaryKeySelective(GCard record);

    int updateByPrimaryKey(GCard record);
}
