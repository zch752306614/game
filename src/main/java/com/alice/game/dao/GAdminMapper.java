package com.alice.game.dao;

import com.alice.game.entity.GAdmin;
import com.alice.game.entity.GAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Alice
 * @version 1.0
 * @date 2020/8/22 9:01
 */
public interface GAdminMapper {
    int countByExample(GAdminExample example);

    int deleteByExample(GAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GAdmin record);

    int insertSelective(GAdmin record);

    List<GAdmin> selectByExample(GAdminExample example);

    GAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GAdmin record, @Param("example") GAdminExample example);

    int updateByExample(@Param("record") GAdmin record, @Param("example") GAdminExample example);

    int updateByPrimaryKeySelective(GAdmin record);

    int updateByPrimaryKey(GAdmin record);
}