package com.basic.crudrestapimysql.repository;

import com.basic.crudrestapimysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>
{

}
