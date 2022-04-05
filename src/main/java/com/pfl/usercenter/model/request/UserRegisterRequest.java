package com.pfl.usercenter.model.request;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author pfl
 */

@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -1479097615975112624L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
