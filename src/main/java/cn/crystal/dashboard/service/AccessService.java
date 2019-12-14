package cn.crystal.dashboard.service;

import cn.crystal.dashboard.common.Common;
import cn.crystal.dashboard.config.Config;
import cn.crystal.dashboard.dao.mapper.AccessMapper;
import cn.crystal.dashboard.dao.model.Access;
import cn.crystal.dashboard.dto.AccessTreeGrid;
import cn.crystal.dashboard.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
     * @Title: getAccessTreeDrid
     * @Description: 获取权限管理页面数据表格数据
     */
    public List<AccessTreeGrid> getAccessTreeGrid(){
        List<Access> accesses = accessMapper.getAccesses();
        List<AccessTreeGrid> result = Common.parseAccessTreeGrid(accesses);
        return result;
    }

    /**
     * @Title: createAccess
     * @Description: 添加权限
     */
    public int createAccess(Access access){
        String currentTime = DateUtils.getCurrentDateString();
        access.setActionUrl(Config.DEFAULT_ACTION_URL);
        access.setIcon(Config.DEFAULT_ICON_CLS);
        access.setCreateTime(currentTime);
        access.setUpdateTime(currentTime);
        return accessMapper.createAccess(access);
    }

    /**
     * @Title: updateAccessById
     * @Description: 根据ID修改权限
     */
    public int updateAccessById(Access access){
        String currentTime = DateUtils.getCurrentDateString();
        access.setUpdateTime(currentTime);
        return accessMapper.updateAccessById(access);
    }

    /**
     * @Title: removeAccessById
     * @Description: 根据ID删除权限
     */
    public int removeAccessById(List ids){
        return accessMapper.removeAccessById(ids);
    }

    /**
     * @Title: getAccessByCondition
     * @Description: 查询所有权限
     */
    public List<Access> getAccesses(){
        return accessMapper.getAccesses();
    }

    /**
     * @Title: getAccessesByPid
     * @Description: 根据父节点ID查询所有权限
     */
    List<Access> getAccessesByPid(String pid){
        return accessMapper.getAccessesByPid(pid);
    }
}
