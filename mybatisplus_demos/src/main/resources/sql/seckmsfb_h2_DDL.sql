DROP TABLE IF EXISTS `key_server_whitelist`;
CREATE TABLE `key_server_whitelist`  (
  `id` VARCHAR(32) NOT NULL,
  `serverId` VARCHAR(32) DEFAULT NULL,
  `serverType` VARCHAR(200) DEFAULT NULL,
  `port` VARCHAR(100) DEFAULT NULL,
  `configRule` INT DEFAULT 0,
  `whiteListIp` VARCHAR(64) DEFAULT NULL,
  `maskBit` VARCHAR(32) DEFAULT NULL,
  `createby` VARCHAR(64) DEFAULT NULL,
  `createdate` DATETIME DEFAULT NULL,
  `updateby` VARCHAR(64) DEFAULT NULL,
  `updatedate` DATETIME DEFAULT NULL,
  `remark` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for kms_server
-- ----------------------------
DROP TABLE IF EXISTS `kms_server`;
CREATE TABLE `kms_server`  (
  `id` VARCHAR(32) NOT NULL COMMENT '主键id',
  `type_name` VARCHAR(16) NOT NULL COMMENT '服务类型名称',
  `start_path` VARCHAR(128) NOT NULL COMMENT '服务启动脚本路径',
  `stop_path` VARCHAR(128) NOT NULL COMMENT '服务停止脚本路径',
  `log_config_path` VARCHAR(128) NOT NULL COMMENT '服务日志配置文件log4j2.xml路径',
  `devel_language` VARCHAR(16) NOT NULL COMMENT '服务开发语言 c/java',
  `kms_user` VARCHAR(255) DEFAULT NULL COMMENT '使用该服务的客户名',
  `create_date` DATETIME DEFAULT NULL COMMENT '创建时间',
  `update_date` DATETIME DEFAULT NULL COMMENT '更新时间',
  `remark` VARCHAR(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for log_configuration
-- ----------------------------
DROP TABLE IF EXISTS `log_configuration`;
CREATE TABLE `log_configuration`  (
  `id` VARCHAR(32) NOT NULL,
  `logName` VARCHAR(20) DEFAULT NULL COMMENT '服务编码，例如后台服务（operation-kms,cluster-kms），密钥服务：rest、KMIP、standard',
  `logRotation` VARCHAR(20) DEFAULT NULL COMMENT '轮换间隔',
  `logLevel` INT DEFAULT NULL COMMENT '日志级别，0-trace 1-debug 2-info 3-warn 4-error',
  `filesNum` INT DEFAULT NULL COMMENT '日志文件最大数',
  `maxLogSize` INT DEFAULT 100 COMMENT '单个日志文件大小限制（MB）',
  `maxHistory` INT DEFAULT NULL COMMENT '日志文件保存最大天数',
  `createby` VARCHAR(64) DEFAULT NULL,
  `createdate` DATETIME DEFAULT NULL,
  `updateby` VARCHAR(64) DEFAULT NULL,
  `updatedate` DATETIME DEFAULT NULL,
  `remark` VARCHAR(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `key_server`;
CREATE TABLE `key_server`  (
  `id` VARCHAR(32) NOT NULL COMMENT '主键id',
  `server_type` VARCHAR(16) NOT NULL COMMENT '服务类型名称',
  `port` VARCHAR(16) NOT NULL COMMENT '端口号',
  `status` VARCHAR(16) DEFAULT NULL COMMENT '状态 1/0',
  `auto_start` VARCHAR(16) DEFAULT NULL COMMENT '是否开机自启  0/1',
  `use_ssl` VARCHAR(16) NOT NULL COMMENT '是否使用ssl 0/1',
  `cert_alg` VARCHAR(16) DEFAULT NULL COMMENT '证书类型  rsa/sm2',
  `ssl_cert_id` VARCHAR(255) DEFAULT NULL COMMENT 'ssl证书id',
  `ssl_cert_desc` VARCHAR(255) DEFAULT NULL COMMENT 'ssl证书展示名称',
  `use_ca` VARCHAR(16) DEFAULT '0' COMMENT '是否开启双向认证  0/1',
  `ca_cert_ids` VARCHAR(255) DEFAULT NULL COMMENT 'ca证书ids  使用分号分隔',
  `ca_cert_desc` VARCHAR(255) DEFAULT NULL COMMENT 'ca证书展示名称',
  `ca_match_item` VARCHAR(16) DEFAULT NULL COMMENT 'ca证书内匹配项  none/cn/ou',
  `verify_username` VARCHAR(16) DEFAULT '0' COMMENT '是否验证用户名  0/1',
  `ip_address` VARCHAR(64) DEFAULT NULL COMMENT 'ip地址',
  `connection_type` VARCHAR(16) DEFAULT NULL COMMENT '连接类型   long/short',
  `auth_type` VARCHAR(16) DEFAULT NULL COMMENT '认证类型  cert/pwd',
  `create_date` DATETIME DEFAULT NULL COMMENT '创建时间',
  `update_date` DATETIME DEFAULT NULL COMMENT '更新时间',
  `remark` VARCHAR(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
);
