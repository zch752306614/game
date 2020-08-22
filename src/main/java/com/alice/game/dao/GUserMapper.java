package com.alice.game.dao;

import com.alice.game.entity.GUser;
import com.alice.game.entity.GUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GUserMapper {
    int countByExample(GUserExample example);

    int deleteByExample(GUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GUser record);

    int insertSelective(GUser record);

    List<GUser> selectByExample(GUserExample example);

    GUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GUser record, @Param("example") GUserExample example);

    int updateByExample(@Param("record") GUser record, @Param("example") GUserExample example);

    int updateByPrimaryKeySelective(GUser record);

    int updateByPrimaryKey(GUser record);
}