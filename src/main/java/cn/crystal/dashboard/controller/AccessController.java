package cn.crystal.dashboard.controller;

import cn.crystal.dashboard.model.Access;
import cn.crystal.dashboard.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("accessIndex")
    public String selectAllAccess(Model model){
        List<Access> accesses = accessService.selectAllAccess();
        model.addAttribute("accesses",accesses);
        return "accessIndex";
    }

    @ResponseBody
    @RequestMapping("selectAllAccess")
    public List<Access> selectAllAccess(){
        List<Access> accesses = accessService.selectAllAccess();
        return accesses;
    }

    @ResponseBody
    @RequestMapping("get/{id}")
    public String selectAllAccess(@PathVariable("id") String age){
        return age;
    }
}
