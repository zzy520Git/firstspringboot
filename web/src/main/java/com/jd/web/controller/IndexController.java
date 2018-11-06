package com.jd.web.controller;

import com.jd.service.UserService;
import com.jd.yiyao.common.result.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description：
 *
 * @author zhouzhongyi1
 * DATE： 2018/11/5 18:45
 */
@Controller
public class IndexController {
    @Value("${autoInject}")
    private String path;

    @Autowired
    private UserService userService;

    @RequestMapping("/testAjax")
    @ResponseBody
    public ResponseResult testAjax() {
        System.out.println(path);
        userService.insertUser();
        return ResponseResult.success(null);
    }

    @RequestMapping("/index")
    public String index() {
        return "freemarker/index";
    }
}
