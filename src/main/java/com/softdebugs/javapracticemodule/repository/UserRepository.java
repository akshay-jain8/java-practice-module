package com.softdebugs.javapracticemodule.repository;

import com.softdebugs.javapracticemodule.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer> {

}
