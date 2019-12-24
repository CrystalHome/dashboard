package cn.crystal.dashboard.controller.webmodel;

import java.util.List;
import java.util.StringJoiner;

/**
 * @author Crystal-Chen
 * @Title: RolePermission
 * @Package cn.crystal.dashboard.controller.webmodel
 * @Description:
 * @date 2019/12/14 21:16
 */
public class PermissionMidRole {
    /**
     * @Description: 权限ID
     */
    private String id;

    /**
     * @Description: 权限父ID
     */
    private String permissionPid="0";

    /**
     * @Description: 权限名称
     */
    private String text;

    /**
     * @Description: 资源地址
     */
    private String permissionActionUrl;

    /**
     * @Description: 图标样式
     */
    private String iconCls;

    /**
     * @Description: 角色ID
     */
    private String roleId;

    /**
     * @Description: 角色名称
     */
    private String roleName;

    /**
     * @Description: 角色说明
     */
    private String roleComments;

    /**
     * @Description: 是否被选中
     */
    private boolean checked;

    private List<PermissionMidRole> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionPid() {
        return permissionPid;
    }

    public void setPermissionPid(String permissionPid) {
        this.permissionPid = permissionPid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPermissionActionUrl() {
        return permissionActionUrl;
    }

    public void setPermissionActionUrl(String permissionActionUrl) {
        this.permissionActionUrl = permissionActionUrl;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleComments() {
        return roleComments;
    }

    public void setRoleComments(String roleComments) {
        this.roleComments = roleComments;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public List<PermissionMidRole> getChildren() {
        return children;
    }

    public void setChildren(List<PermissionMidRole> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PermissionMidRole.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("permissionPid='" + permissionPid + "'")
                .add("text='" + text + "'")
                .add("permissionActionUrl='" + permissionActionUrl + "'")
                .add("iconCls='" + iconCls + "'")
                .add("roleId='" + roleId + "'")
                .add("roleName='" + roleName + "'")
                .add("roleComments='" + roleComments + "'")
                .add("checked=" + checked)
                .add("children=" + children)
                .toString();
    }
}
