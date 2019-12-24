package cn.crystal.dashboard.base.model;

import javax.persistence.Table;
import java.util.StringJoiner;

/**
 * @author Crystal-Chen
 * @Title: RoleMidPermission
 * @Package cn.crystal.dashboard.base.model
 * @Description: 权限角色关系表
 * @date 2019/12/24 22:07
 */
@Table(name = "c_tbl_role_permission")
public class RoleMidPermission {

    /**
    * @Description: ID
    */
    private String id;

    /**
    * @Description: 角色ID
    */
    private String roleId;

    /**
    * @Description: 权限ID
    */
    private String permissionId;

    /**
     * @Description: 创建时间,格式:yyyy-MM-dd HH:mm:ss
     */
    private String createTime;

    /**
     * @Description: 更新时间,格式:yyyy-MM-dd HH:mm:ss
     */
    private String updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
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
        return new StringJoiner(", ", RoleMidPermission.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("roleId='" + roleId + "'")
                .add("permissionId='" + permissionId + "'")
                .add("createTime='" + createTime + "'")
                .add("updateTime='" + updateTime + "'")
                .toString();
    }
}
