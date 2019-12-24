package cn.crystal.dashboard.service.role;

import cn.crystal.dashboard.base.model.PermissionRole;
import cn.crystal.dashboard.controller.webmodel.PermissionMidRole;
import cn.crystal.dashboard.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @author Crystal-Chen
 * @Title: RoleCommon
 * @Package cn.crystal.dashboard.common
 * @Description:
 * @date 2019/12/14 23:01
 */
public class RoleCommon {

    public static List<PermissionMidRole> parsePermissionTree(List<PermissionRole> permissions){
        List<PermissionMidRole> easyUiPermissions = new ArrayList<>(permissions.size());
        for (PermissionRole permission : permissions) {
            PermissionMidRole easyUiPermission = convetPermissionTreeGrid(permission);
            easyUiPermissions.add(easyUiPermission);
        }
        List<PermissionMidRole> rootPermissions = getRootPermissions(easyUiPermissions);

        for (PermissionMidRole rootPermission : rootPermissions) {
            getChildrenPermissions(rootPermission,easyUiPermissions);
        }
        return rootPermissions;
    }

    private  static List<PermissionMidRole> getRootPermissions(List<PermissionMidRole> easyUiPermissions){
        List<PermissionMidRole> rootPermissions = new ArrayList<>();
        for (PermissionMidRole easyUiPermission : easyUiPermissions) {
            PermissionMidRole rootPermission = getRootPermission(easyUiPermission,easyUiPermissions);
            if(!rootPermissions.contains(rootPermission)){
                rootPermissions.add(rootPermission);
            }
        }
        return rootPermissions;
    }

    private static PermissionMidRole getRootPermission(PermissionMidRole easyUiPermission, List<PermissionMidRole> easyUiPermissions) {
        for (PermissionMidRole rootPermission : easyUiPermissions) {
            if(StringUtils.equals(easyUiPermission.getPermissionPid(),rootPermission.getId())){
                easyUiPermission = getRootPermission(rootPermission,easyUiPermissions);
                break;
            }
        }
        return  easyUiPermission;
    }

    private static void getChildrenPermissions(PermissionMidRole rootPermission, List<PermissionMidRole> easyUiPermissions) {
        List<PermissionMidRole> childrenPermissions = new ArrayList<>();
        for (PermissionMidRole easyUiPermission : easyUiPermissions) {
            if(StringUtils.equals(rootPermission.getId(),easyUiPermission.getPermissionPid())){
                getChildrenPermissions(easyUiPermission,easyUiPermissions);
                childrenPermissions.add(easyUiPermission);
            }
        }
        rootPermission.setChildren(childrenPermissions);
    }

    private static PermissionMidRole convetPermissionTreeGrid(PermissionRole permission){
        PermissionMidRole easyUiPermission = new PermissionMidRole();
        easyUiPermission.setId(permission.getPermissionId());
        easyUiPermission.setPermissionPid(permission.getPermissionPid());
        easyUiPermission.setText(permission.getPermissionName());
        easyUiPermission.setPermissionActionUrl(permission.getPermissionActionUrl());
        easyUiPermission.setPermissionIcon(permission.getPermissionIcon());
        easyUiPermission.setRoleId(permission.getRoleId());
        easyUiPermission.setRoleName(permission.getRoleName());
        easyUiPermission.setRoleComments(permission.getRoleComments());
        easyUiPermission.setChecked(Boolean.parseBoolean(permission.getChecked()));
        return easyUiPermission;
    }

}
