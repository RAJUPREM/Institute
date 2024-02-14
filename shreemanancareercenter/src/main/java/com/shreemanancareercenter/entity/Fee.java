package com.shreemanancareercenter.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Fee {
	
	
	


	


	public Fee(int feeId, int totalNumberInstallment, int discountPercent, int netFee, int discountAmount,
			int numberInstallmentCompleted, int numberInstallmentDue, String installmentDatesDecided,
			String installmentDepositingDate, Student student) {
		super();
		this.feeId = feeId;
		this.totalNumberInstallment = totalNumberInstallment;
		this.discountPercent = discountPercent;
		this.netFee = netFee;
		this.discountAmount = discountAmount;
		this.numberInstallmentCompleted = numberInstallmentCompleted;
		this.numberInstallmentDue = numberInstallmentDue;
		this.installmentDatesDecided = installmentDatesDecided;
		this.installmentDepositingDate = installmentDepositingDate;
		this.student = student;
	}


	public Fee() {
		super();
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int feeId;
	private int totalNumberInstallment;
	private int discountPercent;
	private int netFee;
	private int discountAmount;
	private int numberInstallmentCompleted;
	private int numberInstallmentDue;
	private String installmentDatesDecided;
	private String installmentDepositingDate;
	
	
	@JsonBackReference
	@OneToOne(cascade=CascadeType.ALL,mappedBy="fee")
	private Student student;


	public int getFeeId() {
		return feeId;
	}


	public void setFeeId(int feeId) {
		this.feeId = feeId;
	}


	public int getTotalNumberInstallment() {
		return totalNumberInstallment;
	}


	public void setTotalNumberInstallment(int totalNumberInstallment) {
		this.totalNumberInstallment = totalNumberInstallment;
	}


	public int getDiscountPercent() {
		return discountPercent;
	}


	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}


	public int getNetFee() {
		return netFee;
	}


	public void setNetFee(int netFee) {
		this.netFee = netFee;
	}


	public int getNumberInstallmentCompleted() {
		return numberInstallmentCompleted;
	}


	public void setNumberInstallmentCompleted(int numberInstallmentCompleted) {
		this.numberInstallmentCompleted = numberInstallmentCompleted;
	}


	public int getNumberInstallmentDue() {
		return numberInstallmentDue;
	}


	public void setNumberInstallmentDue(int numberInstallmentDue) {
		this.numberInstallmentDue = numberInstallmentDue;
	}


	

	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public String getInstallmentDatesDecided() {
		return installmentDatesDecided;
	}


	public void setInstallmentDatesDecided(String installmentDatesDecided) {
		this.installmentDatesDecided = installmentDatesDecided;
	}


	public String getInstallmentDepositingDate() {
		return installmentDepositingDate;
	}


	public void setInstallmentDepositingDate(String installmentDepositingDate) {
		this.installmentDepositingDate = installmentDepositingDate;
	}


	public int getDiscountAmount() {
		return discountAmount;
	}


	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}


	@Override
	public String toString() {
		return "Fee [feeId=" + feeId + ", totalNumberInstallment=" + totalNumberInstallment + ", discountPercent="
				+ discountPercent + ", netFee=" + netFee + ", discountAmount=" + discountAmount
				+ ", numberInstallmentCompleted=" + numberInstallmentCompleted + ", numberInstallmentDue="
				+ numberInstallmentDue + ", installmentDatesDecided=" + installmentDatesDecided
				+ ", installmentDepositingDate=" + installmentDepositingDate + ", student=" + student + "]";
	}



	




}
