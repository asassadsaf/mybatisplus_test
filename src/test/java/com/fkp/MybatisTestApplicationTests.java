package com.fkp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.incrementer.DefaultIdentifierGenerator;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fkp.domain.KmsServer;
import com.fkp.mapper.TestMapper;
import com.fkp.util.MapperUtils;
import com.fkp.util.SqlSessionFactoryUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.util.List;

@SpringBootTest
class MybatisTestApplicationTests {


	@Autowired
	private TestMapper testMapper;

	@Test
	void contextLoads() {
		PageHelper.startPage(2,2);
		List<KmsServer> kmsServers = testMapper.selectList(null);
		PageInfo<KmsServer> pageInfo = new PageInfo<>(kmsServers);
		List<KmsServer> list = pageInfo.getList();
		int pageSize = pageInfo.getPageSize();
		int pageNum = pageInfo.getPageNum();
		long total = pageInfo.getTotal();
		System.out.println(pageNum);
		System.out.println(pageSize);
		System.out.println(total);
		System.out.println(JSON.toJSONString(list,SerializerFeature.WriteNullStringAsEmpty));
	}

	@Test
	public void test(){
		KmsServer kmsServer = new KmsServer();
		kmsServer.setId("001");
		int insert = testMapper.insert(kmsServer);
		System.out.println(insert);
	}

	@Test
	public void test2(){
		Page<KmsServer> page = new Page<>();
		page.setCurrent(1);
		page.setSize(2);
		Page<KmsServer> page1 = testMapper.selectPage(page, null);
		System.out.println(page1.getCurrent());
		System.out.println(page1.getSize());
		System.out.println(page1.getTotal());
		System.out.println(page1.getRecords().size());
	}

	@Test
	public void test3(){
		Page<KmsServer> page = new Page<>();
		page.setCurrent(1);
		page.setSize(2);
		KmsServer obj = new KmsServer();
		obj.setId("1");
		Page<KmsServer> page1 = testMapper.findPage22(page, obj);
		System.out.println(page1.getCurrent());
		System.out.println(page1.getSize());
		System.out.println(page1.getTotal());
		System.out.println(page1.getRecords().size());
	}

	@Test
	public void test4(){
		SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.sqlSessionFactory;
		try (SqlSession sqlSession = sqlSessionFactory.openSession()){
			TestMapper mapper = sqlSession.getMapper(TestMapper.class);
			List<KmsServer> kmsServers = mapper.selectList(null);
			System.out.println(kmsServers);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	@Test
	public void test5(){
		MapperUtils mapperUtils = new MapperUtils();
		String s = mapperUtils.selectAll();
		String s2 = mapperUtils.selectAll();
		mapperUtils.closeSqlSession();
		System.out.println(s);
		System.out.println(s2);
	}

}
