package cn.crystal.dashboard.base.model;

import javax.persistence.Table;
import java.util.StringJoiner;

/**
 * @author Crystal-Chen
 * @Title: Permission
 * @Package cn.crystal.dashboard.dao.model
 * @Description: 权限实体类
 * @date 2019/12/9 0:25
 */
@Table(name = "c_tbl_permission")
public class Permission {

    /**
    * @Description: ID
    */
    private String id;

    /**
     * @Description: 父ID
     */
    private String pid="0";

    /**
     * @Description: 节点名
     */
    private String name;

    /**
     * @Description: 资源地址
     */
    private String actionUrl;

    /**
    * @Description: 图标样式
    */
    private String icon;

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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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
        return new StringJoiner(", ", Permission.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("pid='" + pid + "'")
                .add("name='" + name + "'")
                .add("actionUrl='" + actionUrl + "'")
                .add("icon='" + icon + "'")
                .add("status='" + status + "'")
                .add("createTime='" + createTime + "'")
                .add("updateTime='" + updateTime + "'")
                .toString();
    }
}
