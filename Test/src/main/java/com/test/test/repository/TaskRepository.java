package com.test.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.test.bean.Tasks;

@Repository
public interface TaskRepository extends MongoRepository<Tasks,String>{
    
}
