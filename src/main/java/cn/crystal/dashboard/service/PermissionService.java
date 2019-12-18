package cn.crystal.dashboard.service;

import cn.crystal.dashboard.common.Common;
import cn.crystal.dashboard.config.Config;
import cn.crystal.dashboard.dao.mapper.PermissionMapper;
import cn.crystal.dashboard.dao.model.Permission;
import cn.crystal.dashboard.dto.EasyUiPermission;
import cn.crystal.dashboard.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: PermissionService
 * @Package cn.crystal.dashboard.service
 * @Description:
 * @date 2019/12/9 23:23
 */
@Service
public class PermissionService {

    @Autowired
    PermissionMapper permissionMapper;

    /**
     * @Title: getPermissionTreeDrid
     * @Description: 获取权限管理页面数据表格数据
     */
    public List<EasyUiPermission> getPermissionTreeGrid(){
        List<Permission> permissions = permissionMapper.getPermissiones();
        List<EasyUiPermission> result = Common.parsePermissionTreeGrid(permissions);
        return result;
    }

    /**
     * @Title: createPermission
     * @Description: 添加权限
     */
    public int createPermission(Permission permission){
        String currentTime = DateUtils.getCurrentDateString();
        permission.setCreateTime(currentTime);
        permission.setUpdateTime(currentTime);
        return permissionMapper.createPermission(permission);
    }

    /**
     * @Title: getPermissionById
     * @Description: 根据ID查询所有权限
     */
    public Permission getPermissionById(String id){
        Permission permission = permissionMapper.getPermissionById(id);
        return permission;
    }









    /**
     * @Title: updatePermissionById
     * @Description: 根据ID修改权限
     */
    public int updatePermissionById(Permission permission){
        String currentTime = DateUtils.getCurrentDateString();
        permission.setUpdateTime(currentTime);
        return permissionMapper.updatePermissionById(permission);
    }

    /**
     * @Title: removePermissionById
     * @Description: 根据ID删除权限
     */
    public int removePermissionById(List ids){
        return permissionMapper.removePermissionById(ids);
    }

    /**
     * @Title: getPermissionByCondition
     * @Description: 查询所有权限
     */
    public List<Permission> getPermissiones(){
        return permissionMapper.getPermissiones();
    }

    /**
     * @Title: getPermissionesByPid
     * @Description: 根据父节点ID查询所有权限
     */
    List<Permission> getPermissionesByPid(String pid){
        return permissionMapper.getPermissionesByPid(pid);
    }
}
