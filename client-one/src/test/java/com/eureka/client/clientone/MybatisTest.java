package com.eureka.client.clientone;

import com.eureka.client.clientone.dao.UserDao;
import com.eureka.client.clientone.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testConnect(){
        List<User> userList = userDao.getUserList();
        userList.forEach(user ->{
            System.out.println(user);
        });
    }

}
