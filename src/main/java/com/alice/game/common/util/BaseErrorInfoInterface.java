package com.alice.game.common.util;

/**
 * @author Alice
 * @version 1.0
 * @date 2020/8/24 9:57
 * @Description
 */
public interface BaseErrorInfoInterface {
    /**
     * 错误码
     * @return
     */
    String getResultCode();

    /**
     * 错误描述
     * @return
     */
    String getResultMsg();
}
