package com.fkp.conf;

import com.fkp.constant.DatabaseIdEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

@Component
public class MyVendorDatabaseIdProvider extends VendorDatabaseIdProvider {
    public MyVendorDatabaseIdProvider() {
        Properties prop = new Properties();
        prop.setProperty(DatabaseIdEnum.MYSQL.getProductName(), DatabaseIdEnum.MYSQL.getFlagName());
        prop.setProperty(DatabaseIdEnum.SQLITE.getProductName(), DatabaseIdEnum.SQLITE.getFlagName());
        this.setProperties(prop);
    }

    @Value("${mybatis.databaseType}")
    private String databaseType;

    @Override
    public String getDatabaseId(DataSource dataSource) {
        if(StringUtils.isBlank(databaseType)){
            return super.getDatabaseId(dataSource);
        }
        return databaseType;
    }

}
