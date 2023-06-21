package com.softdebugs.javapracticemodule.service.impl;

import com.softdebugs.javapracticemodule.entity.UserInfo;
import com.softdebugs.javapracticemodule.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    UserRepository userRepository;

    public int getById(int id) {
        if(userRepository.findById(id).isPresent()) {
            return userRepository.findById(id).get().getId();
        }
        return 0;
    }

    public UserInfo saveUser(UserInfo user) {
        return userRepository.save(user);
    }
}
