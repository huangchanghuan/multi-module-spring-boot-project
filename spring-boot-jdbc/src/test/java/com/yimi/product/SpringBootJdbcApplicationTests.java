package com.yimi.product;

import com.yimi.product.module.user.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJdbcApplicationTests {

	@Autowired
	private UserDao userDao;
	@Test
	public void contextLoads() {
		//插入两个用户
		userDao.addUser("奥巴马",1);
		userDao.addUser("Jack",1);
		//数据库应该有2个用户,所以这里不通过
		Assert.assertEquals(3,userDao.getAllUsers().intValue());
	}

}
