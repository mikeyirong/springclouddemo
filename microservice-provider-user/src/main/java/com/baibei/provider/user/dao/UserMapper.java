package com.baibei.provider.user.dao;

import com.baibei.provider.user.entity.User;
import com.baibei.provider.user.entity.UserCriteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface UserMapper {
    int countByCondition(UserCriteria condition);

    int deleteByCondition(UserCriteria condition);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByCondition(UserCriteria condition);

    User selectByPrimaryKey(Integer id);

    int updateByConditionSelective(@Param("record") User record, @Param("condition") UserCriteria condition);

    int updateByCondition(@Param("record") User record, @Param("condition") UserCriteria condition);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}