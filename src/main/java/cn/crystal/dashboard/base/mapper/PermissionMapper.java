package cn.crystal.dashboard.base.mapper;

import cn.crystal.dashboard.base.model.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: PermissionMapper
 * @Package cn.crystal.dashboard.dao.mapper
 * @Description: 权限操作接口
 * @date 2019/12/9 0:32
 */
@Mapper
public interface PermissionMapper {

    /**
     * @Description: 添加权限
     */
    int createPermission(Permission permission);

    /**
     * @Description: 根据ID修改权限
     */
    int updatePermissionById(Permission permission);

    /**
     * @Description: 根据ID删除权限
     */
    int removePermissionById(List ids);

   /**
    * @Description: 查询所有权限
    */
    List<Permission> getPermissiones();

    /**
     * @Description: 根据ID查询权限
     */
    Permission getPermissionById(String id);

}
