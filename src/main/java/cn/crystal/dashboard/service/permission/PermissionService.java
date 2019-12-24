package cn.crystal.dashboard.service.permission;

import cn.crystal.dashboard.base.mapper.PermissionMapper;
import cn.crystal.dashboard.base.model.Permission;
import cn.crystal.dashboard.common.PermissionSearchType;
import cn.crystal.dashboard.controller.webmodel.EasyUiPermission;
import cn.crystal.dashboard.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: PermissionService
 * @Package cn.crystal.dashboard.service
 * @Description: 权限操作业务类
 * @date 2019/12/9 23:23
 */
@Service
public class PermissionService {

    @Autowired
    PermissionMapper permissionMapper;

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
     * @Title: updatePermissionById
     * @Description: 根据ID修改权限
     */
    public int updatePermissionById(Permission permission){
        String currentTime = DateUtils.getCurrentDateString();
        permission.setUpdateTime(currentTime);
        return permissionMapper.updatePermissionById(permission);
    }

    /**
     * @Title: getPermissionTreeDrid
     * @Description: 获取权限管理页面数据表格数据
     */
    public List<EasyUiPermission> getPermissiones(PermissionSearchType searchType){
        List<Permission> permissions = permissionMapper.getPermissiones();
        List<EasyUiPermission> result = PermissionCommon.parsePermissionTreeGrid(permissions);

        if(StringUtils.equals(searchType.getVal(),PermissionSearchType.PPERATE.getVal())){//权限添加、修改时展示ROOT节点
            result = PermissionCommon.getPermissionWithRoot(result);
        }
        return result;
    }

    /**
     * @Title: getPermissionById
     * @Description: 根据ID查询权限
     */
    public Permission getPermissionById(String id){
        Permission permission = permissionMapper.getPermissionById(id);
        return permission;
    }

    /**
     * @Title: removePermissionById
     * @Description: 根据ID删除权限
     */
    public int removePermissionById(List ids){
        return permissionMapper.removePermissionById(ids);
    }

}
