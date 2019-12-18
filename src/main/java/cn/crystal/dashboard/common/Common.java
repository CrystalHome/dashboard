package cn.crystal.dashboard.common;

import cn.crystal.dashboard.dao.model.Permission;
import cn.crystal.dashboard.dto.EasyUiPermission;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Crystal-Chen
 * @Title: Common
 * @Package cn.crystal.dashboard.common
 * @Description:
 * @date 2019/12/14 23:01
 */
public class Common {

    public static List<EasyUiPermission> parsePermissionTreeGrid(List<Permission> permissions){
        List<EasyUiPermission> easyUiPermissions = new ArrayList<>();
        for (Permission permission : permissions) {
            if(StringUtils.equals(permission.getPid(),"0")){
                convetAndGetChild(permissions, easyUiPermissions, permission);
            }
        }
        return easyUiPermissions;
    }

    private static void convetAndGetChild(List<Permission> permissions, List<EasyUiPermission> easyUiPermissions, Permission permission) {
        EasyUiPermission easyUiPermission = convetPermissionTreeGrid(permission);
        List<EasyUiPermission> children = getChildrenByPid(permissions, permission.getId());
        easyUiPermission.setChildren(children);
        if(children.size() == 0){
            easyUiPermission.setState("1");
        }
        easyUiPermissions.add(easyUiPermission);
    }

    private static List<EasyUiPermission> getChildrenByPid(List<Permission> permissions, String pid){
        List<EasyUiPermission> easyUiPermissions = new ArrayList<>();
        for (Permission permission : permissions) {
            if(StringUtils.equals(permission.getPid(),pid)){
                convetAndGetChild(permissions, easyUiPermissions, permission);
            }
        }
        return easyUiPermissions;
    }

    public static EasyUiPermission convetPermissionTreeGrid(Permission permission){
        EasyUiPermission easyUiPermission = new EasyUiPermission();
        easyUiPermission.setId(permission.getId());
        easyUiPermission.setPid(permission.getPid());
        easyUiPermission.setName(permission.getName());
        easyUiPermission.setStatus(permission.getStatus());
        easyUiPermission.setActionUrl(permission.getActionUrl());
        easyUiPermission.setIconCls(permission.getIcon());
        easyUiPermission.setCreateTime(permission.getCreateTime());
        easyUiPermission.setUpdateTime(permission.getUpdateTime());
        easyUiPermission.setText(permission.getName());
        easyUiPermission.setState(permission.getOpenStatus());
        Map<String,String> attributes = new HashMap<>();
        attributes.put("url", permission.getActionUrl());
        easyUiPermission.setAttributes(attributes);
        return easyUiPermission;
    }
}
