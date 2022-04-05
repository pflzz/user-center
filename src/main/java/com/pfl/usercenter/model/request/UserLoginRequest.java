package com.pfl.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author pfl
 */

@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -1479097615975112624L;

    private String userAccount;
    private String userPassword;
}
