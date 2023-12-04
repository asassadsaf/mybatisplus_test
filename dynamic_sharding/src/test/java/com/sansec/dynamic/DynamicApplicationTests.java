package com.sansec.dynamic;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sansec.dynamic.entity.BusinessUser;
import com.sansec.dynamic.mapper.BusinessUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DynamicApplicationTests {

	@Autowired
	private BusinessUserMapper businessUserMapper;

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
