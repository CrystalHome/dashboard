package cn.crystal.dashboard.common;

import cn.crystal.dashboard.dao.model.Access;
import cn.crystal.dashboard.dto.AccessTreeGrid;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: Common
 * @Package cn.crystal.dashboard.common
 * @Description:
 * @date 2019/12/14 23:01
 */
public class Common {

    public static List<AccessTreeGrid> parseAccessTreeGrid(List<Access> accesses){
        List<AccessTreeGrid> accessTreeGrids = new ArrayList<>();
        for (Access access : accesses) {
            if(StringUtils.equals(access.getPid(),"0")){
                AccessTreeGrid accessTreeGrid = convetAccessTreeGrid(access);
                List<AccessTreeGrid> children = getChildrenByPid(accesses,access.getId());
                accessTreeGrid.setChildren(children);
                accessTreeGrids.add(accessTreeGrid);
            }
        }
        return accessTreeGrids;
    }

    private static List<AccessTreeGrid> getChildrenByPid(List<Access> accesses, String pid){
        List<AccessTreeGrid> accessTreeGrids = new ArrayList<>();
        for (Access access : accesses) {
            if(StringUtils.equals(access.getPid(),pid)){
                AccessTreeGrid accessTreeGrid = convetAccessTreeGrid(access);
                accessTreeGrids.add(accessTreeGrid);
            }
        }
        return accessTreeGrids;
    }

    private static AccessTreeGrid convetAccessTreeGrid(Access access){
        AccessTreeGrid accessTreeGrid = new AccessTreeGrid();
        accessTreeGrid.setId(access.getId());
        accessTreeGrid.setPid(access.getPid());
        accessTreeGrid.setName(access.getName());
        accessTreeGrid.setStatus(access.getStatus());
        accessTreeGrid.setActionUrl(access.getActionUrl());
        accessTreeGrid.setIconCls(access.getIcon());
        accessTreeGrid.setCreateTime(access.getCreateTime());
        accessTreeGrid.setUpdateTime(access.getUpdateTime());
        return accessTreeGrid;
    }
}
