
-- ----------------------------
-- Records of kms_server
-- ----------------------------
INSERT INTO `kms_server` VALUES ('1', 'STANDARD', '/opt/sansec/kms/service/Standard/linux/bin/startup.sh', '/opt/sansec/kms/service/Standard/linux/bin/stop.sh', '/opt/sansec/kms/service/Standard/linux/bin/signal.sh', 'c', 'visa', '2023-04-23 14:17:56', NULL, NULL);
INSERT INTO `kms_server` VALUES ('2', 'KMIP_TCP', '/opt/sansec/kms/service/KMIP/startup.sh', '/opt/sansec/kms/service/KMIP/stop.sh', '/opt/sansec/kms/service/KMIP/log4j2.xml', 'java', 'visa,ccsp', '2023-04-23 14:17:56', NULL, NULL);
INSERT INTO `kms_server` VALUES ('3', 'REST', '/opt/sansec/kms/service/Rest/startup.sh', '/opt/sansec/kms/service/Rest/stop.sh', '/opt/sansec/kms/service/Rest/log4j2.xml', 'java', 'visa,ccsp', '2023-04-23 14:17:56', NULL, NULL);
INSERT INTO `kms_server` VALUES ('4', 'REST_MANAGE', '/opt/sansec/kms/service/RestManage/startup.sh', '/opt/sansec/kms/service/RestManage/stop.sh', '/opt/sansec/kms/service/RestManage/log4j2.xml', 'java', 'daimler', '2023-04-23 14:17:56', NULL, NULL);
INSERT INTO `kms_server` VALUES ('5', 'AWS_REST', '/opt/sansec/kms/service/AWSRest/startup.sh', '/opt/sansec/kms/service/AWSRest/stop.sh', '/opt/sansec/kms/service/AWSRest/log4j2.xml', 'java', 'daimler', '2023-04-23 14:17:56', NULL, NULL);
INSERT INTO `kms_server` VALUES ('6', 'AWS_REST_ALL', '/opt/sansec/kms/service/AWSRest-ALL/startup.sh', '/opt/sansec/kms/service/AWSRest-ALL/stop.sh', '/opt/sansec/kms/service/AWSRest-ALL/log4j2.xml', 'java', 'daimler', '2023-04-23 14:17:56', NULL, NULL);
INSERT INTO `kms_server` VALUES ('7', 'KMIP_VKEK', '/opt/sansec/kms/service/KMIP_VKEK/startup.sh', '/opt/sansec/kms/service/KMIP_VKEK/stop.sh', '/opt/sansec/kms/service/KMIP_VKEK/webapp/WEB-INF/classes/log4j2.xml', 'java', 'hw', '2023-04-23 14:17:56', NULL, NULL);

-- ----------------------------
-- Records of log_configuration
-- ----------------------------
INSERT INTO `log_configuration` VALUES ('1', 'STANDARD', 'Daily', 4, 10, 50, 7, NULL, '2023-04-24 18:44:36', NULL, NULL, NULL);
INSERT INTO `log_configuration` VALUES ('2', 'KMIP_TCP', 'Daily', 4, 10, 50, 7, NULL, '2023-04-24 18:44:36', NULL, NULL, NULL);
INSERT INTO `log_configuration` VALUES ('3', 'REST', 'Daily', 4, 10, 50, 7, NULL, '2023-04-24 18:44:36', NULL, NULL, NULL);
INSERT INTO `log_configuration` VALUES ('4', 'REST_MANAGE', 'Daily', 4, 10, 50, 7, NULL, '2023-04-24 18:44:36', NULL, NULL, NULL);
INSERT INTO `log_configuration` VALUES ('5', 'AWS_REST', 'Daily', 4, 10, 50, 7, NULL, '2023-04-24 18:44:36', NULL, NULL, NULL);
INSERT INTO `log_configuration` VALUES ('6', 'AWS_REST_ALL', 'Daily', 4, 10, 50, 7, NULL, '2023-04-24 18:44:36', NULL, NULL, NULL);
INSERT INTO `log_configuration` VALUES ('7', 'KMIP_VKEK', 'Daily', 4, 10, 50, 7, NULL, '2023-04-24 18:44:36', NULL, NULL, NULL);
INSERT INTO `log_configuration` VALUES ('8', 'Kms', 'Daily', 4, 10, 50, 7, NULL, '2023-04-24 18:44:36', NULL, NULL, NULL);
