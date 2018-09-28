package com.inshare.mybatis.mapper;

import com.inshare.mybatis.pojo.Person;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Guichao
 * @since 2018/9/28
 */
public interface PersonDao {

    @Select("select * from person")
    List<Person> getAll();
}
