package cn.crystal.dashboard.controller;

import cn.crystal.dashboard.dao.model.Permission;
import cn.crystal.dashboard.dto.EasyUiPermission;
import cn.crystal.dashboard.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("index")
    public String index(){
        return "permission/index";
    }

    @RequestMapping("createPermissionForm")
    public String createPermissionPage(){
        return "permission/createPermissionForm";
    }

    @ResponseBody
    @RequestMapping("createPermission")
    public void createPermission(Permission permission){
        System.out.println(permission);
    //    permissionService.createPermission(permission);
    }

    @ResponseBody
    @RequestMapping("getPermissionTreeGrid")
    public List<EasyUiPermission> getPermissionTreeGrid(){
        List<EasyUiPermission> easyUiPermissions = permissionService.getPermissionTreeGrid();
        return easyUiPermissions;
    }

}