package com.shreemanancareercenter.servicesImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shreemanancareercenter.Dto.AdmissionDto;
import com.shreemanancareercenter.Dto.StudentDto;
import com.shreemanancareercenter.entity.Admission;
import com.shreemanancareercenter.entity.Batch;
import com.shreemanancareercenter.entity.Course;
import com.shreemanancareercenter.entity.Fee;
import com.shreemanancareercenter.entity.Student;
import com.shreemanancareercenter.repository.AdmissionRepository;
import com.shreemanancareercenter.repository.BatchRepository;
import com.shreemanancareercenter.repository.CourseRepository;
import com.shreemanancareercenter.services.AdmissionService;

@Service
public class AdmissionServiceImpl implements AdmissionService{
	
	@Autowired
	BatchRepository batchRepository;
	
	@Autowired
	AdmissionRepository admissionRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
	public void addAdmission(AdmissionDto admissionDto)
	{
		Admission admission=new Admission();
		
		admission.setAdmissionDate(admissionDto.getAdmissionDate());
		
		StudentDto studentDto=admissionDto.getStudentDto();
		
	//	------------------------
		
		Student student=new Student();
		Fee fee=new Fee();
		
		student.setStudentName(studentDto.getStudentName());
		student.setStudentFathersName(studentDto.getStudentFathersName());
		student.setStudentsDOB(studentDto.getStudentsDOB());
		student.setStudentGender(studentDto.getStudentGender());
		student.setStudentAcademicQualification(studentDto.getStudentAcademicQualification());
		student.setStudentProfessionalQualification(studentDto.getStudentProfessionalQualification());
		student.setStudentCategory(studentDto.getStudentCategory());
		student.setStudentMobile(studentDto.getStudentMobile());
		
		student.setAddress(studentDto.getAddress());
		
		List<Course> lcourse=new ArrayList<Course>();
		
		int principalFee=0;
		
		for(int i=0;i<studentDto.getCourseId().size();i++)
		{
			Optional<Course> tempCourse=courseRepository.findById(studentDto.getCourseId().get(i));
			Course course=tempCourse.get();
			principalFee+=course.getCourseCharge();
			lcourse.add(course);
		}
		
		student.setCourse(lcourse);
		
		
		
		
		fee.setTotalNumberInstallment(studentDto.getTotalNumberInstallment());
		fee.setDiscountPercent(studentDto.getDiscountPercent());
		
		int totalNet=principalFee;
		
		principalFee-=(studentDto.getDiscountPercent()*principalFee)/100;
		
		fee.setNetFee(principalFee);
		
		fee.setDiscountAmount(totalNet-principalFee);
		
		LocalDate currentDate = LocalDate.now(); 
		
		//List<String> lInstallmentDatesDecided=new ArrayList<String>();
		
		String lInstallmentDatesDecided="";
		
		//lInstallmentDatesDecided+=currentDate.toString();
		
		//lInstallmentDatesDecided.add(currentDate.toString());
		//lInstallmentDatesDecided+=",";
		for(int i=0;i<studentDto.getTotalNumberInstallment();i++)
		{
			//lInstallmentDatesDecided.add(currentDate.plusMonths(i).toString());
			lInstallmentDatesDecided+=currentDate.plusMonths(i).toString();
			lInstallmentDatesDecided+=",";
		}
		
		fee.setInstallmentDatesDecided(lInstallmentDatesDecided);
		fee.setNumberInstallmentDue(studentDto.getTotalNumberInstallment());
		
		student.setFee(fee);
		
		
	
		
		
		
//		-------------------------
		
		
		admission.setStudent(student);
		
		Optional<Batch> tempBatch=batchRepository.findById(admissionDto.getBatchId());
		Batch batch=tempBatch.get();
		
		List<Student> lstudent=batch.getStudentList();
		lstudent.add(student);
		
		batch.setStudentList(lstudent);
		
		
		
		admission.setBatch(batch);
		admission.setAdmissionRemarksComments(admissionDto.getAdmissionRemarksComments());
		
		admissionRepository.save(admission);
		
	}

	@Override
	public List<Admission> getAdmission() {
		List<Admission>  ladmission=admissionRepository.findAll();
		
		return ladmission;
	}

}
