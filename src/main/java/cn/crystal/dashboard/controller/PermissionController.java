package cn.crystal.dashboard.controller;

import cn.crystal.dashboard.dao.model.Permission;
import cn.crystal.dashboard.dto.EasyUiPermission;
import cn.crystal.dashboard.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: PermissionController
 * @Package cn.crystal.dashboard.controller
 * @Description:
 * @date 2019/12/9 23:26
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    PermissionService permissionService;

    /**
     * 权限列表页面
     * @return
     */
    @RequestMapping("index")
    public String index(){
        return "permission/index";
    }

    /**
     * 权限列表查询
     * @return
     */
    @ResponseBody
    @RequestMapping("getPermissionTreeGrid")
    public List<EasyUiPermission> getPermissionTreeGrid(){
        List<EasyUiPermission> easyUiPermissions = permissionService.getPermissionTreeGrid();
        return easyUiPermissions;
    }

    /**
     * 权限添加页面
     * @return
     */
    @RequestMapping("createPermissionForm")
    public String createPermissionForm(){
        return "permission/createPermissionForm";
    }

    @RequestMapping("createPermission")
    @ResponseBody
    public void createPermission(Permission permission){
        permissionService.createPermission(permission);
    }

    /**
     * 权限修改页面
     * @return
     */
    @RequestMapping("updatePermissionForm")
    public String updatePermissionForm(Model model, String id){
        Permission permission = permissionService.getPermissionById(id);
        model.addAttribute("permission",permission);
        return "permission/updatePermissionForm";
    }

    /**
     * 权限修改
     * @return
     */
    @ResponseBody
    @RequestMapping("updatePermission")
    public void updatePermission(Permission permission){
        permissionService.updatePermissionById(permission);
    }



    @ResponseBody
    @RequestMapping("removePermissionById")
    public void removePermissionById(String id){
        permissionService.removePermissionById(Arrays.asList(id));
    }
}
