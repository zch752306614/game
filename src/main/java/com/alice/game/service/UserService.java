package com.alice.game.service;

import com.alice.game.entity.GUser;
import com.alice.game.entity.GUserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alice
 * @version 1.0
 * @date 2020/8/22 9:01
 */
@Service
public interface UserService {
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
