package cn.crystal.dashboard.base.model;

import javax.persistence.Table;
import java.util.StringJoiner;

/**
 * @author Crystal-Chen
 * @Title: PermissionRole
 * @Package cn.crystal.dashboard.dao.model
 * @Description: 权限角色关系实体类
 * @date 2019/12/9 0:25
 */
@Table(name = "c_tbl_role_permission")
public class PermissionRole {
    /**
     * @Description: 权限ID
     */
    private String permissionId;

    /**
     * @Description: 权限父ID
     */
    private String permissionPid="0";

    /**
     * @Description: 权限名称
     */
        private String permissionName;

    /**
     * @Description: 资源地址
     */
    private String permissionActionUrl;

    /**
     * @Description: 图标样式
     */
    private String permissionIcon;

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
    private String checked;

    /**
     * @Description: 创建时间,格式:yyyy-MM-dd HH:mm:ss
     */
    private String createTime;

    /**
     * @Description: 更新时间,格式:yyyy-MM-dd HH:mm:ss
     */
    private String updateTime;

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionPid() {
        return permissionPid;
    }

    public void setPermissionPid(String permissionPid) {
        this.permissionPid = permissionPid;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionActionUrl() {
        return permissionActionUrl;
    }

    public void setPermissionActionUrl(String permissionActionUrl) {
        this.permissionActionUrl = permissionActionUrl;
    }

    public String getPermissionIcon() {
        return permissionIcon;
    }

    public void setPermissionIcon(String permissionIcon) {
        this.permissionIcon = permissionIcon;
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

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PermissionRole.class.getSimpleName() + "[", "]")
                .add("permissionId='" + permissionId + "'")
                .add("permissionPid='" + permissionPid + "'")
                .add("permissionName='" + permissionName + "'")
                .add("permissionActionUrl='" + permissionActionUrl + "'")
                .add("permissionIcon='" + permissionIcon + "'")
                .add("roleId='" + roleId + "'")
                .add("roleName='" + roleName + "'")
                .add("roleComments='" + roleComments + "'")
                .add("checked='" + checked + "'")
                .add("createTime='" + createTime + "'")
                .add("updateTime='" + updateTime + "'")
                .toString();
    }
}
