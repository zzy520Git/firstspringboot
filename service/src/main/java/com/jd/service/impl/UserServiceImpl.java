package com.jd.service.impl;

import com.jd.dao.UserMapper;
import com.jd.domain.User;
import com.jd.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：
 *
 * @author zhouzhongyi1
 * DATE： 2018/11/5 20:51
 */
@Service("userService")
@Slf4j
public class UserServiceImpl implements UserService {
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Value("${autoInject}")
    private String path;

    @Override
    public void insertUser() {
        System.out.println(path);
        logger.error("zzzzzzzzzzzzzzzzzzzzzzz");
        User u = new User() ;
        //u.setId(1L);
        u.setUsername("zzyzzy");
        u.setPassword("中华人民111");
        List<User> li = new ArrayList<>();
        li.add(u);
        li.add(u);
        userMapper.batchInsert(li);
        logger.error("zzzzzzzzzzzzzzzzzzzzzzz");
    }
}
