package cn.crystal.dashboard.base.mapper;

import cn.crystal.dashboard.base.model.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: RoleMapper
 * @Package cn.crystal.dashboard.base.mapper
 * @Description: 角色操作接口
 * @date 2019/12/23 20:39
 */
@Mapper
public interface RoleMapper {

    /**
     * @Description: 添加角色
     */
    int createRole(Role role);

    /**
     * @Description: 根据ID修改角色
     */
    int updateRoleById(Role role);

    /**
     * @Description: 根据ID删除角色
     */
    int removeRoleById(List ids);

    /**
     * @Description: 查询所有角色
     */
    List<Role> getRolees();

    /**
     * @Description: 根据ID查询角色
     */
    Role getRoleById(String id);

}
