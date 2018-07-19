package com.example.springcloud.springcloudprovideruser.dao;

import com.example.springcloud.springcloudprovideruser.domain.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDO,Long> {
}
