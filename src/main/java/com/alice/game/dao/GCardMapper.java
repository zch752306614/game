package com.alice.game.dao;

import com.alice.game.entity.GCard;
import com.alice.game.entity.GCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GCardMapper {
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