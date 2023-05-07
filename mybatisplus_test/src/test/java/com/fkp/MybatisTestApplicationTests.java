package com.fkp;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fkp.domain.LogConfiguration;
import com.fkp.domain.LogConfigurationExample;
import com.fkp.mapper.LogConfigurationMapper;
import com.fkp.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.List;

@SpringBootTest
class MybatisTestApplicationTests {


	@Autowired
	private TestMapper testMapper;

	@Autowired
	private LogConfigurationMapper logConfigurationMapper;

	@Autowired
	private ThreadPoolTaskExecutor executor;


//	@Test
//	public void test(){
//		Page<LogConfiguration> page = new Page<>();
//		page.setCurrent(2);
//		page.setSize(2);
//		LogConfigurationExample example = new LogConfigurationExample();
//		example.createCriteria().andIdBetween("1","3");
//		Page<LogConfiguration> logConfigurations = logConfigurationMapper.findPage(example,page);
//		List<LogConfiguration> records = logConfigurations.getRecords();
//		System.out.println(records);
//	}

//	@Test
//	public void test4(){
//		SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.sqlSessionFactory;
//		try (SqlSession sqlSession = sqlSessionFactory.openSession()){
//			TestMapper mapper = sqlSession.getMapper(TestMapper.class);
//			List<KmsServer> kmsServers = mapper.selectList(null);
//			System.out.println(kmsServers);
//		}catch (Exception e){
//			e.printStackTrace();
//		}
//	}
//
//	@Test
//	public void test5(){
//		MapperUtils mapperUtils = new MapperUtils();
//		String s = mapperUtils.selectAll();
//		String s2 = mapperUtils.selectAll();
//		mapperUtils.closeSqlSession();
//		System.out.println(s);
//		System.out.println(s2);
//		List<KmsServer> kmsServers = testMapper.selectList(null);
//		System.out.println(kmsServers);
//	}

//	@Test
//	public void test6(){
//		KmsServer kmsServer = testMapper.findById("001");
//
//		System.out.println(kmsServer);
//	}

//	@Test
//	void contextLoads() {
//		PageHelper.startPage(2,2);
//		List<KmsServer> kmsServers = testMapper.selectList(null);
//		PageInfo<KmsServer> pageInfo = new PageInfo<>(kmsServers);
//		List<KmsServer> list = pageInfo.getList();
//		int pageSize = pageInfo.getPageSize();
//		int pageNum = pageInfo.getPageNum();
//		long total = pageInfo.getTotal();
//		System.out.println(pageNum);
//		System.out.println(pageSize);
//		System.out.println(total);
//		System.out.println(JSON.toJSONString(list,SerializerFeature.WriteNullStringAsEmpty));
//	}
//
//	@Test
//	public void test(){
//		KmsServer kmsServer = new KmsServer();
//		kmsServer.setId("001");
//		int insert = testMapper.insert(kmsServer);
//		System.out.println(insert);
//	}
//
//	@Test
//	public void test2(){
//		Page<KmsServer> page = new Page<>();
//		page.setCurrent(1);
//		page.setSize(2);
//		Page<KmsServer> page1 = testMapper.selectPage(page, null);
//		System.out.println(page1.getCurrent());
//		System.out.println(page1.getSize());
//		System.out.println(page1.getTotal());
//		System.out.println(page1.getRecords().size());
//	}
//
//	@Test
//	public void test3(){
//		Page<KmsServer> page = new Page<>();
//		page.setCurrent(1);
//		page.setSize(2);
//		KmsServer obj = new KmsServer();
//		obj.setId("1");
//		Page<KmsServer> page1 = testMapper.findPage22(page, obj);
//		System.out.println(page1.getCurrent());
//		System.out.println(page1.getSize());
//		System.out.println(page1.getTotal());
//		System.out.println(page1.getRecords().size());
//	}

}
