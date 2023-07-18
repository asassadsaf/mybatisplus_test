package com.fkp.gaussdb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EncDirEntity {

	private String id;

	private String status;

	private String dirName;

	private String key_id;

	private String key_uniqueId;

	private String key_user;

	private String key_password;

	private String server_ip;

	private String visitUser;

	private String accessUser;

	private String key_alg;

	private String type;

	private String auto_encryption;

	private String file_extension;
}
