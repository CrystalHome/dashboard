package cn.crystal.dashboard.common;

import cn.crystal.dashboard.dao.model.Access;
import cn.crystal.dashboard.dto.EasyUiAccess;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Crystal-Chen
 * @Title: Common
 * @Package cn.crystal.dashboard.common
 * @Description:
 * @date 2019/12/14 23:01
 */
public class Common {

    public static List<EasyUiAccess> parseAccessTreeGrid(List<Access> accesses){
        List<EasyUiAccess> easyUiAccesses = new ArrayList<>();
        for (Access access : accesses) {
            if(StringUtils.equals(access.getPid(),"0")){
                EasyUiAccess easyUiAccess = convetAccessTreeGrid(access);
                List<EasyUiAccess> children = getChildrenByPid(accesses,access.getId());
                easyUiAccess.setChildren(children);
                easyUiAccesses.add(easyUiAccess);
            }
        }
        return easyUiAccesses;
    }

    private static List<EasyUiAccess> getChildrenByPid(List<Access> accesses, String pid){
        List<EasyUiAccess> easyUiAccesses = new ArrayList<>();
        for (Access access : accesses) {
            if(StringUtils.equals(access.getPid(),pid)){
                EasyUiAccess easyUiAccess = convetAccessTreeGrid(access);
                easyUiAccesses.add(easyUiAccess);
            }
        }
        return easyUiAccesses;
    }

    private static EasyUiAccess convetAccessTreeGrid(Access access){
        EasyUiAccess easyUiAccess = new EasyUiAccess();
        easyUiAccess.setId(access.getId());
        easyUiAccess.setPid(access.getPid());
        easyUiAccess.setName(access.getName());
        easyUiAccess.setStatus(access.getStatus());
        easyUiAccess.setActionUrl(access.getActionUrl());
        easyUiAccess.setIconCls(access.getIcon());
        easyUiAccess.setCreateTime(access.getCreateTime());
        easyUiAccess.setUpdateTime(access.getUpdateTime());
        easyUiAccess.setText(access.getName());
        easyUiAccess.setState(access.getOpenStatus());
        Map<String,String> attributes = new HashMap<>();
        attributes.put("url",access.getActionUrl());
        easyUiAccess.setAttributes(attributes);
        return easyUiAccess;
    }
}
