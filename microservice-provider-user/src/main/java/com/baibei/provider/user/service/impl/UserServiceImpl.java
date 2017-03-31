package com.baibei.provider.user.service.impl;

import com.baibei.common.core.utils.MapUtils;
import com.baibei.provider.user.dao.UserMapper;
import com.baibei.provider.user.entity.User;
import com.baibei.provider.user.entity.UserCriteria;
import com.baibei.provider.user.entity.UserCriteria.Criteria;
import com.baibei.provider.user.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public User addUser(User record) {
        if (this.userMapper.insert(record) == 1)
            return record;
        return null;
    }

    public boolean deleteUser(Integer id) {
        return this.userMapper.deleteByPrimaryKey(id) == 1;
    }

    public User modifyUser(User record) {
        if (this.userMapper.updateByPrimaryKeySelective(record) == 1)
            return record;
        return null;
    }

    public User getUser(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    private void setCriteria(Criteria criteria, Map<String, Object> params) {
        if (StringUtils.isNotEmpty(MapUtils.getOrDefault(params, "userName", "").toString()))
            criteria.andUserNameEqualTo(MapUtils.getOrDefault(params, "userName", "").toString());
        if (StringUtils.isNotEmpty(MapUtils.getOrDefault(params, "realName", "").toString()))
            criteria.andRealNameEqualTo(MapUtils.getOrDefault(params, "realName", "").toString());
        if (StringUtils.isNotEmpty(MapUtils.getOrDefault(params, "password", "").toString()))
            criteria.andPasswordEqualTo(MapUtils.getOrDefault(params, "password", "").toString());
        if (StringUtils.isNotEmpty(MapUtils.getOrDefault(params, "flag", "").toString()))
            criteria.andFlagEqualTo(MapUtils.getOrDefault(params, "flag", "").toString());
        if (StringUtils.isNotEmpty(MapUtils.getOrDefault(params, "mobile", "").toString()))
            criteria.andMobileEqualTo(MapUtils.getOrDefault(params, "mobile", "").toString());
        if (StringUtils.isNotEmpty(MapUtils.getOrDefault(params, "isRootUser", "").toString()))
            criteria.andIsRootUserEqualTo(MapUtils.getOrDefault(params, "isRootUser", "").toString());
    }

    public List<User> getUsers(Map<String, Object> params) {
        UserCriteria criteria = new UserCriteria();
        Criteria cri = criteria.createCriteria();
        setCriteria(cri, params);
        return this.userMapper.selectByCondition(criteria);
    }

}