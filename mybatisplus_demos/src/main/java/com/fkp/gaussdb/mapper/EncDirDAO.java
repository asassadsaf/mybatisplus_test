package com.fkp.gaussdb.mapper;



import com.fkp.gaussdb.entity.EncDirEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EncDirDAO {

//	List<EncDirEntity> findPage(@Param("req") EncDirPageReq req);

//	int insertSelective(EncDirEntity encryptedDir);

	EncDirEntity selectByMsg(EncDirEntity encryptedDir);

	List<String> selectKeyByDirAndServer(String dir_name, String server_ip);

	int updateDir(EncDirEntity ed1);

	Integer selectcount(EncDirEntity encryptedDir);

	int deleteSelective(EncDirEntity ed1);

	List<EncDirEntity> selectbyserver(String ip);

	int selectCountByKeyName(String keyName);

	int updateServerIp(String ip_new, String ip_old);

	int deleteByServerIp(String ip);

	int selectEncCountByServer(String ip);

	int selectOperatingCountByServer(String ip);

	Integer countByStatusAndIp(@Param("serverIp") String serverIp, @Param("status") String status);

	/**
	 * 获取目录状态
	 * @param ip 客户端IP
	 * @param path 目录绝对路径
	 * @return 目录状态
	 */
	List<String> getStateByIpAndPath(@Param("ip") String ip, @Param("path") String path);

	/**
	 * 查询该IP下目录是否存在
	 * @param ip 客户端IP
	 * @return
	 */
	Integer existDirByIp(@Param("ip") String ip);
}
