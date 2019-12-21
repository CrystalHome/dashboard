package cn.crystal.dashboard.common;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Crystal-Chen
 * @Title: PermissionSearchType
 * @Package cn.crystal.dashboard.common
 * @Description: 权限查询类型
 * @date 2019/12/21 22:54
 */
public enum PermissionSearchType {

    /**
     * @Description: 主菜单
     */
    MENU("MENU"),

    /**
     * @Description: 树型列表数据
     */
    TREE_GRADE_DATA("DATA"),

    /**
     * @Description: 权限添加\修改
     */
    PPERATE("DO");

    String val;

    PermissionSearchType(String val){
        this.val = val.toUpperCase();
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public static PermissionSearchType parse(String val){
        if(StringUtils.isBlank(val)){
            return PermissionSearchType.MENU;
        }
        for (PermissionSearchType value : PermissionSearchType.values()) {
            if(value.getVal().equals(val.toUpperCase())){
                return value;
            }
        }
        return PermissionSearchType.MENU;
    }
}
