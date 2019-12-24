package cn.crystal.dashboard.controller.role;

import cn.crystal.dashboard.base.model.Role;
import cn.crystal.dashboard.controller.webmodel.PermissionMidRole;
import cn.crystal.dashboard.service.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Arrays;
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

    /**
     * 角色列表页面
     * @return
     */
    @RequestMapping("index")
    public String index(){
        return "role/index";
    }

    /**
     * 角色列表查询
     * @return
     */
    @ResponseBody
    @RequestMapping("getRolees")
    public List<Role> getRolees(){
        return roleService.getRolees();
    }

    /**
     * 角色添加页面
     * @return
     */
    @RequestMapping("createRoleForm")
    public String createRoleForm(){
        return "role/createRoleForm";
    }

    /**
     * @Description: 角色添加
     */
    @RequestMapping("createRole")
    @ResponseBody
    public void createRole(Role role){
        roleService.createRole(role);
    }

    /**
     * @Description: 角色修改页面
     */
    @RequestMapping("updateRoleForm/{id}")
    public String updateRoleForm(Model model, @PathVariable(name = "id") String id){
        Role role = roleService.getRoleById(id);
        model.addAttribute("role",role);
        return "role/updateRoleForm";
    }

    /**
     * @Description: 角色修改
     */
    @ResponseBody
    @RequestMapping("updateRole")
    public void updateRole(Role role){
        roleService.updateRoleById(role);
    }

    /**
     * @Description: 角色删除
     */
    @ResponseBody
    @RequestMapping("removeRoleById/{id}")
    public void removeRoleById(@PathVariable(name = "id") String id){
        roleService.removeRoleById(Arrays.asList(id));
    }

    /**
     * @Description: 根据ID查询角色权限
     */
    @ResponseBody
    @RequestMapping("getRolePermissionById/{id}")
    public List<PermissionMidRole> getRolePermissionById(@PathVariable(name = "id") String id){
        return roleService.getRolePermissionById(id);
    }

    /**
     * @Description: 根据ID查询角色权限
     */
    @ResponseBody
    @RequestMapping("updateRolePermission/{id}")
    public void updateRolePermission(@PathVariable(name = "id") String roleId, String ids){
        roleService.updateRolePermission(roleId, Arrays.asList(ids.split(",")));
    }
}
