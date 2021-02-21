package com.luarasi.employeeAPIv1.Utils;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@Profile("oracle-ucp")
public class OracleUCPConfiguration {

    @Bean
    public DataSource dataSource() throws SQLException {
        PoolDataSource dataSource = PoolDataSourceFactory.getPoolDataSource();
        dataSource.setUser("ADMIN");
        dataSource.setPassword("MW20!apptgb#1234");
        dataSource.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
        dataSource.setURL("jdbc:oracle:thin:@//adb.eu-frankfurt-1.oraclecloud.com:1522/fk8kzl2iqqlhwb9_luarasidev_high.adb.oraclecloud.com");
        dataSource.setFastConnectionFailoverEnabled(true);
        dataSource.setInitialPoolSize(5);
        dataSource.setMinPoolSize(5);
        dataSource.setMaxPoolSize(10);
        return dataSource;
    }
}
