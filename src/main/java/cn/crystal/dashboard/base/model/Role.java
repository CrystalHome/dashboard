package cn.crystal.dashboard.base.model;

import javax.persistence.Table;
import java.util.StringJoiner;

/**
 * @author Crystal-Chen
 * @Title: Role
 * @Package cn.crystal.dashboard.base.model
 * @Description: 角色实体类
 * @date 2019/12/23 20:39
 */
@Table(name = "c_tbl_role")
public class Role {
    /**
     * @Description: ID
     */
    private String id;

    /**
     * @Description: 角色名称
     */
    private String name;

    /**
     * @Description: 角色说明
     */
    private String comments;

    /**
     * @Description: 记录状态
     */
    private String status="1";

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return new StringJoiner(", ", Role.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("comments='" + comments + "'")
                .add("status='" + status + "'")
                .add("createTime='" + createTime + "'")
                .add("updateTime='" + updateTime + "'")
                .toString();
    }
}
