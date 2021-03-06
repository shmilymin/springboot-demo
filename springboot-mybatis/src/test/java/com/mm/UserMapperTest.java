package com.mm;

import com.mm.entity.User;
import com.mm.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * xml
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void save() {
        User user = new User();
        user.setUsername("hehehe");
        user.setPassword("6666666");
        user.setNickName("哈哈");
        user.setGender(User.Gender.MALE);
        user.setGmtCreate(new Date());
        user.setGmtModified(new Date());
        userMapper.insert(user);
    }

    @Test
    public void update() {
        User user = new User();
        user.setId(1L);
        user.setUsername("haha");
        user.setPassword("888888");
        user.setNickName("呵呵");
        user.setGender(User.Gender.FEMALE);
        user.setGmtModified(new Date());
        userMapper.update(user);
    }

    @Test
    public void delete() {
        userMapper.delete(2L);
    }

    @Test
    public void get() {
        User user = userMapper.get(2L);
        System.out.println(user);
    }

    @Test
    public void getAll() {
        List<User> users = userMapper.getAll();
        System.out.println(users.toString());
    }
}
