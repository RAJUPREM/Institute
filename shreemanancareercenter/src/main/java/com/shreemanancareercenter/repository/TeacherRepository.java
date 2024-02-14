package com.shreemanancareercenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreemanancareercenter.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer>{

}
