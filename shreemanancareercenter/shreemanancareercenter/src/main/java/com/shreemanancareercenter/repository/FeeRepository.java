package com.shreemanancareercenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreemanancareercenter.entity.Fee;

@Repository
public interface FeeRepository extends JpaRepository<Fee,Integer>{

}
