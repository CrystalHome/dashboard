package cn.crystal.dashboard.dto;

import java.util.List;
import java.util.Map;

/**
 * @author Crystal-Chen
 * @Title: EasyUiAccess
 * @Package cn.crystal.dashboard.dto
 * @Description:
 * @date 2019/12/14 21:16
 */
public class EasyUiAccess {
    private String id;

    private String pid;

    private String name;

    private String status;

    private String actionUrl;

    private String iconCls;

    private String createTime;

    private String updateTime;

    private List<EasyUiAccess> children;

    private Map<String,String> attributes;

    private String text;

    private String state;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActionUrl() {
        return actionUrl;
    }

    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
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

    public List<EasyUiAccess> getChildren() {
        return children;
    }

    public void setChildren(List<EasyUiAccess> children) {
        this.children = children;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EasyUiAccess{");
        sb.append("id='").append(id).append('\'');
        sb.append(", pid='").append(pid).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", actionUrl='").append(actionUrl).append('\'');
        sb.append(", iconCls='").append(iconCls).append('\'');
        sb.append(", createTime='").append(createTime).append('\'');
        sb.append(", updateTime='").append(updateTime).append('\'');
        sb.append(", children=").append(children);
        sb.append(", attributes=").append(attributes);
        sb.append(", text='").append(text).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
}