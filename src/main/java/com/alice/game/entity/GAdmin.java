package com.alice.game.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author Alice
 * @version 1.0
 * @date 2020/8/22 9:01
 */
@Data
@ToString
public class GAdmin {
    private Integer id;

    private String adminaccount;

    private String adminpassword;

    private String adminnickname;

    private Integer adminlevel;
}