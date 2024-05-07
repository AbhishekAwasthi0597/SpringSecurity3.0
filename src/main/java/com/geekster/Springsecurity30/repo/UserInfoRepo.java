package com.geekster.Springsecurity30.repo;

import com.geekster.Springsecurity30.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepo extends JpaRepository<UserInfo,Integer> {

    UserInfo findByName(String username);
}
