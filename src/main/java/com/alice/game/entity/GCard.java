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
public class GCard {
    private Integer id;

    private String cardname;

    private String cardsource;

    private Integer cardquality;

    private String carddescription;

    private Integer cardstar;

    private String cardurl;

}