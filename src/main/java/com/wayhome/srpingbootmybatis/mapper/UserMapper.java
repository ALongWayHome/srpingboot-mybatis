package com.wayhome.srpingbootmybatis.mapper;

import com.wayhome.srpingbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User getUserById(Long id);


}
