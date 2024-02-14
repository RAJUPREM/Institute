package com.shreemanancareercenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shreemanancareercenter.entity.CourseSyllabus;

@Repository
public interface CourseSyllabusRepository extends JpaRepository<CourseSyllabus,Integer>{

}
