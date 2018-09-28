package com.inshare.mybatis.service;

import com.inshare.mybatis.mapper.PersonDao;
import com.inshare.mybatis.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Guichao
 * @since 2018/9/28
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> getAll() {
        return personDao.getAll();
    }
}
