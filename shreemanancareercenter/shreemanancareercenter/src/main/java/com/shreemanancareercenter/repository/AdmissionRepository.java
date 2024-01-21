package com.shreemanancareercenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreemanancareercenter.entity.Admission;

@Repository
public interface AdmissionRepository extends JpaRepository<Admission,Integer>{

}
