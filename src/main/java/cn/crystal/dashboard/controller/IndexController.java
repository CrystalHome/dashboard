package cn.crystal.dashboard.controller;

import cn.crystal.dashboard.common.PermissionSearchType;
import cn.crystal.dashboard.controller.webmodel.EasyUiPermission;
import cn.crystal.dashboard.service.permission.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: IndexController
 * @Package cn.crystal.dashboard.controller
 * @Description:
 * @date 2019/12/10 22:19
 */
@Controller
public class IndexController {

    @Autowired
    PermissionService permissionService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * @Title: initEasyUiTree
     * @Description: 加载EasyUi树型菜单
     */
    @ResponseBody
    @RequestMapping("initEasyUiTree")
    public List<EasyUiPermission> initEasyUiTree(){
        List<EasyUiPermission> easyUiPermissions = permissionService.getPermissiones(PermissionSearchType.MENU);
        return easyUiPermissions;
    }
}
