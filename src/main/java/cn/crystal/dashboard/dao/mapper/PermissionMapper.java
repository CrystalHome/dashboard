package cn.crystal.dashboard.dao.mapper;

import cn.crystal.dashboard.dao.model.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: PermissionMapper
 * @Package cn.crystal.dashboard.dao.mapper
 * @Description:
 * @date 2019/12/9 0:32
 */
@Mapper
public interface PermissionMapper {

    /**
     * @Title: createPermission
     * @Description: 添加权限
     */
    int createPermission(Permission permission);

    /**
     * @Title: updatePermissionById
     * @Description: 根据ID修改权限
     */
    int updatePermissionById(Permission permission);

    int beforeRemovePermissionById(List ids);

    /**
     * @Title: removePermissionById
     * @Description: 根据ID删除权限
     */
    int removePermissionById(List ids);

   /**
    * @Title: getPermissionByCondition
    * @Description: 查询所有权限
    */
    List<Permission> getPermissiones();

   /**
    * @Title: getRootPermissiones
    * @Description: 查询所有权限
    */
    List<Permission> getRootPermissiones();

    /**
     * @Title: getPermissionById
     * @Description: 根据ID查询所有权限
     */
    Permission getPermissionById(String pid);

    /**
     * @Title: getPermissionesByPid
     * @Description: 根据父节点ID查询所有权限
     */
    List<Permission> getPermissionesByPid(String pid);

}
