package cn.crystal.dashboard.controller;

import cn.crystal.dashboard.dto.EasyUiAccess;
import cn.crystal.dashboard.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: AccessController
 * @Package cn.crystal.dashboard.controller
 * @Description:
 * @date 2019/12/9 23:26
 */
@Controller
@RequestMapping("/access")
public class AccessController {

    @Autowired
    AccessService accessService;

    @RequestMapping("index")
    public String index(){
        return "access/index";
    }

    @ResponseBody
    @RequestMapping("getAccessTreeGrid")
    public List<EasyUiAccess> getAccessTreeDrid(){
        List<EasyUiAccess> easyUiAccesses = accessService.getAccessTreeGrid();
        return easyUiAccesses;
    }


    @RequestMapping("getAccessTreeGridTest")
    public String getAccessTreeGridTest(){
        return "access/index";
    }
}
