package com.pfl.usercenter.mapper;
import java.util.Date;


import com.pfl.usercenter.model.domain.User;
import com.pfl.usercenter.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 用户服务测试
 *
 * @author pfl
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;


    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("uzi");
        user.setUserAccount("123");
        user.setAvatarUrl("https://baike.baidu.com/pic/%E7%AE%80%E8%87%AA%E8%B1%AA/14190783/1/5bafa40f4bfbfbedab6417e1bea1e036afc37931b156?fr=lemma&ct=single#aid=1&pic=5bafa40f4bfbfbedab6417e1bea1e036afc37931b156");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("yyds@god.com");


        boolean result = userService.save(user);
        System.out.println("user.getId() = " + user.getId());
        Assertions.assertEquals(true, result);
    }

    @Test
    void userRegister() {
        String userAccount = "uzidog";
        String userPassword = "";
        String checkPassword = "123";
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "uzi";
        userPassword = "123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "uzid og";
        userPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        checkPassword = "123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
        userAccount = "uzidog";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        userAccount = "yupi";
        userPassword = "12345678";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount, userPassword, checkPassword);
        Assertions.assertEquals(-1, result);
    }
}