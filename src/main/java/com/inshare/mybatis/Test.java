package com.inshare.mybatis;


import com.inshare.mybatis.config.MybatisConfig;
import com.inshare.mybatis.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Guichao
 * @since 2018/9/28
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MybatisConfig.class);
        PersonService personService = applicationContext.getBean(PersonService.class);
        System.out.println(personService.getAll());
    }
}
