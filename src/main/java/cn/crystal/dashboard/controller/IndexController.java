package cn.crystal.dashboard.controller;

import cn.crystal.dashboard.dto.EasyuiTree;
import cn.crystal.dashboard.dao.model.Access;
import cn.crystal.dashboard.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Crystal-Chen
 * @Title: IndexController
 * @Package cn.crystal.dashboard.controller
 * @Description:
 * @date 2019/12/10 22:19
 */
@Controller
public class IndexController {

    @Autowired
    AccessService accessService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * @Title: initEasyUiTree
     * @Description: 加载EasyUi树型菜单
     */
    @ResponseBody
    @RequestMapping("initEasyUiTree")
    public List<EasyuiTree> initEasyUiTree(){
        List<Access> accesses = accessService.getAccesses();

        List<EasyuiTree> easyuiTrees = new ArrayList<>();
        for (Access access : accesses) {
            EasyuiTree easyuiTree = new EasyuiTree();
            easyuiTree.setId(access.getId());
            easyuiTree.setPid(access.getPid());
            easyuiTree.setText(access.getName());
            easyuiTree.setState(access.getOpenStatus());
            easyuiTree.setIconCls(access.getIcon());
            Map<String,String> attributes = new HashMap<>();
            attributes.put("url",access.getActionUrl());
            easyuiTree.setAttributes(attributes);
            easyuiTrees.add(easyuiTree);
        }
        return easyuiTrees;
    }
}
