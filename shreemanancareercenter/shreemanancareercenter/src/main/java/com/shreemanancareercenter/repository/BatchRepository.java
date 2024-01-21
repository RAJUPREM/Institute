package com.shreemanancareercenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreemanancareercenter.entity.Batch;

@Repository
public interface BatchRepository extends JpaRepository<Batch,Integer>{

}
