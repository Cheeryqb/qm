package com.alienlab.niit.qm.service;

import com.alienlab.niit.qm.entity.TbUserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by 橘 on 2017/3/14.
 */
public interface UserService {
    Page<TbUserEntity> listUser(String keyword, Pageable page) throws Exception;
}
