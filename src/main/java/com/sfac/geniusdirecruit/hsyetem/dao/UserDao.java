package com.sfac.geniusdirecruit.hsyetem.dao;

import com.sfac.geniusdirecruit.hsyetem.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {
    @Insert("insert into user (user_name) values (#{userName})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insertCategory(User user);
}


