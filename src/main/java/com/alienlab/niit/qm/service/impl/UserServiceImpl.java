package com.alienlab.niit.qm.service.impl;

import com.alienlab.niit.qm.entity.TbUserEntity;
import com.alienlab.niit.qm.repository.UserRepository;
import com.alienlab.niit.qm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by 橘 on 2017/3/14.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public Page<TbUserEntity> listUser(String keyword, Pageable page) throws Exception {
        return userRepository.findUserByUserNameLike(keyword,page);
    }
}
