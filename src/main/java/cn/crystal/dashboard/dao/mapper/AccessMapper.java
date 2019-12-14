package cn.crystal.dashboard.dao.mapper;

import cn.crystal.dashboard.dao.model.Access;
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
    int removeAccessById(List ids);

   /**
    * @Title: getAccessByCondition
    * @Description: 查询所有权限
    */
    List<Access> getAccesses();

    /**
     * @Title: getAccessesByPid
     * @Description: 根据父节点ID查询所有权限
     */
    List<Access> getAccessesByPid(String pid);

}
