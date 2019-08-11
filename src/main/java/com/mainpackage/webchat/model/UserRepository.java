package com.mainpackage.webchat.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//接口 提供外部调用，方法自动生成
public interface UserRepository extends CrudRepository<User,Integer> {
    List<User> findByEmail(String email);
    void deleteByEmail(String email);
}
