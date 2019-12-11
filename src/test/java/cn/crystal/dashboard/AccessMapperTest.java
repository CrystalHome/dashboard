package cn.crystal.dashboard;

import cn.crystal.dashboard.model.Access;
import cn.crystal.dashboard.dao.AccessMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AccessMapperTest {

    @Autowired
    AccessMapper mapper;

    Access before(){
        Access access = new Access();
        access.setPid("1");
        access.setName("添加");
        access.setOpenStatus("1");
        access.setActionUrl("www.create.com");
        access.setIcon("icon");
        access.setCreateTime("9999-99-99 99:99:99");
        access.setUpdateTime("9999-99-99 99:99:99");
        return access;
    }
    /**
     * @Title: createAccess
     * @Description: 添加权限
     */
    @Test
    void createAccess(){
        Access access = before();
        int i = mapper.createAccess(access);
        System.out.println(i);
        System.out.println(access);
    }

    /**
     * @Title: updateAccessById
     * @Description: 根据ID修改权限
     */
    @Test
    void updateAccessById(){
        Access access = before();
        access.setId("8");
        access.setPid("0");
        access.setName("修改");
        access.setOpenStatus("0");
        access.setActionUrl("www.update.com");
        access.setIcon("update");
        access.setCreateTime("8888-99-99 99:99:99");
        access.setUpdateTime("8888-99-99 99:99:99");
        int i = mapper.updateAccessById(access);
        System.out.println(i);
    }

    /**
     * @Title: removeAccessById
     * @Description: 根据ID删除权限
     */
    @Test
    void removeAccessById(){
        int i = mapper.removeAccessById("8");
        System.out.println(i);
    }

    /**
     * @Title: getAllAccess
     * @Description: 根据条件查询权限
     */
    @Test
    void selectAllAccess(){
        List<Access> allAccess = mapper.selectAllAccess();
        System.out.println(allAccess);
    }

}
