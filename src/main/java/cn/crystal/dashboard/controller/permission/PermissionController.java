package cn.crystal.dashboard.controller.permission;

import cn.crystal.dashboard.base.model.Permission;
import cn.crystal.dashboard.common.PermissionSearchType;
import cn.crystal.dashboard.controller.webmodel.EasyUiPermission;
import cn.crystal.dashboard.service.permission.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping({"getPermissiones","getPermissiones/{searchType}"})
    public List<EasyUiPermission> getPermissiones(@PathVariable(name = "searchType",required = false) String searchType){
        PermissionSearchType searchTypeEnu = PermissionSearchType.parse(searchType);
        List<EasyUiPermission> easyUiPermissions = permissionService.getPermissiones(searchTypeEnu);
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

    /**
    * @Description: 权限添加
    */
    @RequestMapping("createPermission")
    @ResponseBody
    public void createPermission(Permission permission){
        permissionService.createPermission(permission);
    }

    /**
    * @Description: 权限修改页面
    */
    @RequestMapping("updatePermissionForm/{id}")
    public String updatePermissionForm(Model model, @PathVariable(name = "id") String id){
        Permission permission = permissionService.getPermissionById(id);
        model.addAttribute("permission",permission);
        return "permission/updatePermissionForm";
    }

   /**
   * @Description: 权限修改
   */
    @ResponseBody
    @RequestMapping("updatePermission")
    public void updatePermission(Permission permission){
        permissionService.updatePermissionById(permission);
    }

    /**
    * @Description: 权限删除
    */
    @ResponseBody
    @RequestMapping("removePermissionById/{id}")
    public void removePermissionById(@PathVariable(name = "id") String id){
        permissionService.removePermissionById(Arrays.asList(id));
    }
}
