package cn.crystal.dashboard.dao.model;

/**
 * @author Crystal-Chen
 * @Title: Permission
 * @Package cn.crystal.dashboard.dao.model
 * @Description:
 * @date 2019/12/9 0:25
 */
public class Permission {

    private String id;

    private String pid="0";

    private String name;

    private String openStatus="0";

    private String actionUrl;

    private String icon;

    private String status="1";

    private String createTime;

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

    public String getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
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
        final StringBuffer sb = new StringBuffer("Permission{");
        sb.append("id='").append(id).append('\'');
        sb.append(", pid='").append(pid).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", openStatus='").append(openStatus).append('\'');
        sb.append(", actionUrl='").append(actionUrl).append('\'');
        sb.append(", icon='").append(icon).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", createTime='").append(createTime).append('\'');
        sb.append(", updateTime='").append(updateTime).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
