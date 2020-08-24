package com.alice.game.controller;

import com.alibaba.fastjson.JSONObject;
import com.alice.game.common.util.BizException;
import com.alice.game.common.util.ResultBody;
import com.alice.game.entity.GUser;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alice
 * @version 1.0
 * @date 2020/8/22 9:50
 */
@RestController
@RequestMapping(value = "/game")
public class GameController {

    @RequestMapping("/index")
    public ResultBody index() {

        return ResultBody.success();
    }

    @PostMapping("/user")
    public ResultBody insert(@RequestBody GUser user) {
        System.out.println("开始新增...");
        //如果姓名为空就手动抛出一个自定义的异常！
        if (user.getUserrealname() == null) {
            throw new BizException("-1", "用户姓名不能为空！");
        }
        return ResultBody.success();
    }

    @PutMapping("/user")
    public ResultBody update(@RequestBody GUser user) {
        System.out.println("开始更新...");
        //这里故意造成一个空指针的异常，并且不进行处理
        String str = null;
        str.equals("111");
        return ResultBody.success();
    }

    @DeleteMapping("/user")
    public ResultBody delete(@RequestBody GUser user) {
        System.out.println("开始删除...");
        //这里故意造成一个异常，并且不进行处理
        Integer.parseInt("abc123");
        return ResultBody.success();
    }

    @GetMapping("/user")
    public ResultBody findByUser(GUser user) {
        System.out.println("开始查询...");
        List<GUser> userList = new ArrayList<>();
        GUser user2 = new GUser();
        user2.setId(1);
        user2.setUserrealname("xuwujing");
        user2.setUserlevel(18);
        userList.add(user2);
        return ResultBody.success(userList);
    }

}
