package com.wladyslaw.shop.accessingdatamysql;

import com.wladyslaw.shop.model.First;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<First, Integer> {

}