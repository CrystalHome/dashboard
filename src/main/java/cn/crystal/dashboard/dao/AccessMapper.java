package cn.crystal.dashboard.dao;

import cn.crystal.dashboard.model.Access;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: AccessMapper
 * @Package cn.crystal.dashboard.dao.mapper
 * @Description:
 * @date 2019/12/9 0:32
 */
@Mapper
public interface AccessMapper {

    /**
     * @Title: createAccess
     * @Description: 添加权限
     */
    int createAccess(Access access);

    /**
     * @Title: updateAccessById
     * @Description: 根据ID修改权限
     */
    int updateAccessById(Access access);

    /**
     * @Title: removeAccessById
     * @Description: 根据ID删除权限
     */
    int removeAccessById(String id);

   /**
    * @Title: getAllAccess
    * @Description: 根据条件查询权限
    */
    List<Access> selectAllAccess();

}
