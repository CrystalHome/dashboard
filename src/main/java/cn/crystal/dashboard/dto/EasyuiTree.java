package cn.crystal.dashboard.dto;

import java.util.List;
import java.util.Map;

/**
 * @author Crystal-Chen
 * @Title: EasyuiTree
 * @Package cn.crystal.dashboard.dto
 * @Description:
 * @date 2019/12/10 23:11
 */
public class EasyuiTree {

    private String id;

    private String pid;

    private String text;

    private String state;

    private String iconCls;

    private Map<String,String> attributes;

    private List<EasyuiTree> children;

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

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public List<EasyuiTree> getChildren() {
        return children;
    }

    public void setChildren(List<EasyuiTree> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EasyuiTree{");
        sb.append("id='").append(id).append('\'');
        sb.append(", pid='").append(pid).append('\'');
        sb.append(", text='").append(text).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", iconCls='").append(iconCls).append('\'');
        sb.append(", attributes=").append(attributes);
        sb.append(", children=").append(children);
        sb.append('}');
        return sb.toString();
    }
}
