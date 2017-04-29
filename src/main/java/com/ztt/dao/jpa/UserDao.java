package com.ztt.dao.jpa;

import com.ztt.entity.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ztt on 2017/3/19.
 */
@Repository
public interface UserDao extends CrudRepository<User, Integer>{
    User findByNameAndPasswordAndType(String name, String password, Short type);

    User findById(int id);
}
