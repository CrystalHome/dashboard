package cn.crystal.dashboard.controller.role;

import cn.crystal.dashboard.base.model.Role;
import cn.crystal.dashboard.service.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: RoleController
 * @Package cn.crystal.dashboard.controller.role
 * @Description:
 * @date 2019/12/23 20:48
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;


    @RequestMapping("index")
    public String index(){
        return "role/index";
    }

    @ResponseBody
    @RequestMapping("getRolees")
    public List<Role> getRolees(){
        return roleService.getRolees();
    }
}
