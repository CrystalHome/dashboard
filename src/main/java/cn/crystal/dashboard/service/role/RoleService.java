package cn.crystal.dashboard.service.role;

import cn.crystal.dashboard.base.mapper.RoleMapper;
import cn.crystal.dashboard.base.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Crystal-Chen
 * @Title: RoleService
 * @Package cn.crystal.dashboard.service.role
 * @Description: 角色操作业务
 * @date 2019/12/23 20:48
 */
@Service
public class RoleService {

    @Autowired
    RoleMapper roleMapper;

    public List<Role> getRolees(){
        return roleMapper.getRolees();
    }
}
