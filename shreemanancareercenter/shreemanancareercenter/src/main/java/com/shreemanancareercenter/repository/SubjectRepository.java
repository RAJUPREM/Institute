package com.shreemanancareercenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreemanancareercenter.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Integer>{

}
