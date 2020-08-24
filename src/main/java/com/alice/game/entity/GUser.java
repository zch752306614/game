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
public class GUser {
    private Integer id;

    private String username;

    private String userpassword;

    private String usernickname;

    private String userrealname;

    private String useremail;

    private String usertel;

    private String useraddress;

    private String useridnumber;

    private Integer userlevel;

}