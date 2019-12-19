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
 * @Title: PermissionCommon
 * @Package cn.crystal.dashboard.common
 * @Description:
 * @date 2019/12/14 23:01
 */
public class PermissionCommon {

    public static List<EasyUiPermission> parsePermissionTreeGrid(List<Permission> permissions){
        List<EasyUiPermission> easyUiPermissions = new ArrayList<>(permissions.size());
        for (Permission permission : permissions) {
            EasyUiPermission easyUiPermission = convetPermissionTreeGrid(permission);
            easyUiPermissions.add(easyUiPermission);
        }
        List<EasyUiPermission> rootPermissions = getRootPermissions(easyUiPermissions);

        for (EasyUiPermission rootPermission : rootPermissions) {
            getChildrenPermissions(rootPermission,easyUiPermissions);
        }
        setOpenStatus(rootPermissions);
        return rootPermissions;
    }

    public  static List<EasyUiPermission> getRootPermissions(List<EasyUiPermission> easyUiPermissions){
        List<EasyUiPermission> rootPermissions = new ArrayList<>();
        for (EasyUiPermission easyUiPermission : easyUiPermissions) {
            EasyUiPermission rootPermission = getRootPermission(easyUiPermission,easyUiPermissions);
            if(!rootPermissions.contains(rootPermission)){
                rootPermissions.add(rootPermission);
            }
        }
        return rootPermissions;
    }

    public static EasyUiPermission getRootPermission(EasyUiPermission easyUiPermission, List<EasyUiPermission> easyUiPermissions) {
        for (EasyUiPermission rootPermission : easyUiPermissions) {
            if(StringUtils.equals(easyUiPermission.getPid(),rootPermission.getId())){
                easyUiPermission = getRootPermission(rootPermission,easyUiPermissions);
                break;
            }
        }
        return  easyUiPermission;
    }

    public static void getChildrenPermissions(EasyUiPermission rootPermission, List<EasyUiPermission> easyUiPermissions) {
        List<EasyUiPermission> childrenPermissions = new ArrayList<>();
        for (EasyUiPermission easyUiPermission : easyUiPermissions) {
            if(StringUtils.equals(rootPermission.getId(),easyUiPermission.getPid())){
                childrenPermissions.add(easyUiPermission);
            }
        }
        rootPermission.setChildren(childrenPermissions);
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
        easyUiPermission.setState("open");
        Map<String,String> attributes = new HashMap<>();
        attributes.put("url", permission.getActionUrl());
        easyUiPermission.setAttributes(attributes);
        return easyUiPermission;
    }

    private static void setOpenStatus(List<EasyUiPermission> rootPermissions) {
        if(rootPermissions.size()>1){
            for(int i=1; i< rootPermissions.size(); i++){
                if(rootPermissions.get(i).getChildren().size()>0){
                    rootPermissions.get(i).setState("closed");
                }
            }
        }
    }
}
