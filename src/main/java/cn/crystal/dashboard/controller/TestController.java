package cn.crystal.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Crystal-Chen
 * @Title: TestController
 * @Package cn.crystal.dashboard.controller
 * @Description:
 * @date 2019/12/16 23:19
 */
@Controller("/test")
public class TestController {

    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
