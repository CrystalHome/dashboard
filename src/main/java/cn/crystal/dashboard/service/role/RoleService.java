package cn.crystal.dashboard.service.role;

import cn.crystal.dashboard.base.mapper.RoleMapper;
import cn.crystal.dashboard.base.model.PermissionRole;
import cn.crystal.dashboard.base.model.Role;
import cn.crystal.dashboard.base.model.RoleMidPermission;
import cn.crystal.dashboard.controller.webmodel.PermissionMidRole;
import cn.crystal.dashboard.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: RoleService
 * @Package cn.crystal.dashboard.service.role
 * @Description: 角色操作业务
 * @date 2019/12/23 20:48
 */
@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;

    public List<Role> getRolees(){
        return roleMapper.getRolees();
    }

    /**
     * @Title: createRole
     * @Description: 添加角色
     */
    public int createRole(Role role){
        String currentTime = DateUtils.getCurrentDateString();
        role.setCreateTime(currentTime);
        role.setUpdateTime(currentTime);
        return roleMapper.createRole(role);
    }

    /**
     * @Title: getRoleById
     * @Description: 根据ID查询角色
     */
    public Role getRoleById(String id){
        Role role = roleMapper.getRoleById(id);
        return role;
    }

    /**
     * @Title: updateRoleById
     * @Description: 根据ID修改角色
     */
    public int updateRoleById(Role role){
        String currentTime = DateUtils.getCurrentDateString();
        role.setUpdateTime(currentTime);
        return roleMapper.updateRoleById(role);
    }

    /**
     * @Title: removeRoleById
     * @Description: 根据ID删除角色
     */
    public int removeRoleById(List ids){
        return roleMapper.removeRoleById(ids);
    }

    /**
     * @Title: getRolePermissionById
     * @Description: 根据ID查询角色权限
     */
    public List<PermissionMidRole> getRolePermissionById(String id){
        List<PermissionRole> permissionRoles = roleMapper.getRolePermissionById(id);
        List<PermissionMidRole> permissionMidRoles = RoleCommon.parsePermissionTree(permissionRoles);
        return permissionMidRoles;
    }

    /**
     * @Description: 根据ID查询角色权限
     */
    public int updateRolePermission(String roleId, List<String> ids){
        int removeRows = roleMapper.removeRolePermissionByRoleId(roleId);
        List<RoleMidPermission> roleMidPermissions = new ArrayList<>(ids.size());
        String currentTime = DateUtils.getCurrentDateString();
        for (String permissionId : ids) {
            RoleMidPermission roleMidPermission = new RoleMidPermission();
            roleMidPermission.setRoleId(roleId);
            roleMidPermission.setPermissionId(permissionId);
            roleMidPermission.setUpdateTime(currentTime);
            roleMidPermission.setCreateTime(currentTime);
            roleMidPermissions.add(roleMidPermission);
        }
        int createRows = roleMapper.createRolePermissionByRoleId(roleMidPermissions);
        return removeRows+createRows;
    }
}
