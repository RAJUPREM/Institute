package com.shreemanancareercenter.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreemanancareercenter.Dto.BatchDto;
import com.shreemanancareercenter.entity.Batch;
import com.shreemanancareercenter.entity.Student;
import com.shreemanancareercenter.entity.Teacher;
import com.shreemanancareercenter.repository.BatchRepository;
import com.shreemanancareercenter.repository.StudentRepository;
import com.shreemanancareercenter.repository.TeacherRepository;
import com.shreemanancareercenter.services.BatchService;

@Service
public class BatchServiceImpl implements BatchService{

	@Autowired
	BatchRepository batchRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Override
	public void addBatch(BatchDto batchDto) {
		
		Batch batch=new Batch();
		
		batch.setBatchNumber(batchDto.getBatchNumber());
		batch.setBatchTiming(batchDto.getBatchTiming());
		batch.setBatchStatus(batchDto.getBatchAlert());
		batch.setBatchAlert(batchDto.getBatchAlert());
		
		String batchDays="";
		
		for(int i=0;i<batchDto.getBatchDays().size();i++)
		{
			batchDays+=batchDto.getBatchDays().get(i);
			batchDays+=",";
		}
		
		batch.setBatchDays(batchDays);
		
		List<Student> lstudent=new ArrayList<Student>();
		
		for(int i=0;i<batchDto.getStudentIdList().size();i++)
		{
			
			Optional<Student> tempStudent=studentRepository.findById(batchDto.getStudentIdList().get(i));
			Student student=tempStudent.get();
			lstudent.add(student);
		}
		
		batch.setStudentList(lstudent);
		
		
		List<Teacher> lteacher=new ArrayList<Teacher>();
		
		for(int i=0;i<batchDto.getTeacherIdList().size();i++)
		{
			
			Optional<Teacher> tempTeacher=teacherRepository.findById(batchDto.getTeacherIdList().get(i));
			Teacher teacher=tempTeacher.get();
			lteacher.add(teacher);
		}
		
		batch.setTeacherList(lteacher);
		
		batchRepository.save(batch);
		
	}

	@Override
	public List<Batch> getAllBatch() {
		List<Batch> lbatch=batchRepository.findAll();
		return lbatch;
	}

}
