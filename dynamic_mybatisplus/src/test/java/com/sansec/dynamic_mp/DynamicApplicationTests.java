package com.sansec.dynamic_mp;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sansec.dynamic_mp.controller.BusinessUserController;
import com.sansec.dynamic_mp.entity.BusinessUser;
import com.sansec.dynamic_mp.mapper.BusinessUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class DynamicApplicationTests {

	@Autowired
	private BusinessUserController controller;

	@Autowired
	private BusinessUserMapper businessUserMapper;

	//切面生效
	@Test
	void contextLoads() {
		System.out.println(controller.save(BusinessUser.builder().id("001").build()));
	}

	@Test
	void testInsert() {
		System.out.println(businessUserMapper.insert(BusinessUser.builder().id("001").build()));
	}

	@Test
	void testUpdate() {
		System.out.println(businessUserMapper.update(null, Wrappers.lambdaUpdate(BusinessUser.class)
				.set(BusinessUser::getId, "002").eq(BusinessUser::getId, "001")));
	}

	@Test
//	@Transactional，切面不生效
	void testQuery() {
		System.out.println(businessUserMapper.selectList(Wrappers.emptyWrapper()));
	}

	@Test
	void testDelete() {
		System.out.println(businessUserMapper.deleteById("002"));
	}

}
