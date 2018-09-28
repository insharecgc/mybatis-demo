package com.inshare.mybatis.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author Guichao
 * @since 2018/9/28
 */
@Configuration
@MapperScan("com.inshare.mybatis.mapper")
@ComponentScan("com.inshare.mybatis")
public class MybatisConfig {

    @Bean
    @Autowired
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        return sqlSessionFactory;
    }

    /**
     * DataSource常见的有：c3p0，alibaba
     * 此处使用spring自带的数据源 DriverManagerDataSource
     * @return
     */
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root1234");
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return driverManagerDataSource;
    }
}
