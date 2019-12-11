package cn.crystal.dashboard.service;

import cn.crystal.dashboard.dao.AccessMapper;
import cn.crystal.dashboard.model.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: AccessService
 * @Package cn.crystal.dashboard.service
 * @Description:
 * @date 2019/12/9 23:23
 */
@Service
public class AccessService {

    @Autowired
    AccessMapper accessMapper;

    /**
     * @Title: createAccess
     * @Description: 添加权限
     */
    public int createAccess(Access access){
        return accessMapper.createAccess(access);
    }

    /**
     * @Title: updateAccessById
     * @Description: 根据ID修改权限
     */
    public int updateAccessById(Access access){
        return accessMapper.updateAccessById(access);
    }

    /**
     * @Title: removeAccessById
     * @Description: 根据ID删除权限
     */
    public int removeAccessById(String id){
        return accessMapper.removeAccessById(id);
    }

    /**
     * @Title: getAllAccess
     * @Description: 根据条件查询权限
     */
    public List<Access> selectAllAccess(){
        return accessMapper.selectAllAccess();
    }
}
