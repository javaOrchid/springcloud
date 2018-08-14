package com.eureka.client.clientone.dao;

import com.eureka.client.clientone.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
public interface UserDao {

    public List<User> getUserList();

}
