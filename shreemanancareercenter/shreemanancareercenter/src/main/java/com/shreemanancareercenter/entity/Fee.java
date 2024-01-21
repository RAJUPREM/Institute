package com.shreemanancareercenter.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Fee {
	
	
	public Fee() {
		super();
	}


	public Fee(int feeId, int totalNumberInstallment, int discountPercent, int netFee, int numberInstallmentCompleted,
			int numberInstallmentDue, List<Date> installmentDatesDecided, List<Date> installmentDepositingDate,
			Student student) {
		super();
		this.feeId = feeId;
		this.totalNumberInstallment = totalNumberInstallment;
		this.discountPercent = discountPercent;
		this.netFee = netFee;
		this.numberInstallmentCompleted = numberInstallmentCompleted;
		this.numberInstallmentDue = numberInstallmentDue;
		this.installmentDatesDecided = installmentDatesDecided;
		this.installmentDepositingDate = installmentDepositingDate;
		this.student = student;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int feeId;
	private int totalNumberInstallment;
	private int discountPercent;
	private int netFee;
	private int numberInstallmentCompleted;
	private int numberInstallmentDue;
	private List<Date> installmentDatesDecided;
	private List<Date> installmentDepositingDate;
	
	
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


	public List<Date> getInstallmentDatesDecided() {
		return installmentDatesDecided;
	}


	public void setInstallmentDatesDecided(List<Date> installmentDatesDecided) {
		this.installmentDatesDecided = installmentDatesDecided;
	}


	public List<Date> getInstallmentDepositingDate() {
		return installmentDepositingDate;
	}


	public void setInstallmentDepositingDate(List<Date> installmentDepositingDate) {
		this.installmentDepositingDate = installmentDepositingDate;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Fee [feeId=" + feeId + ", totalNumberInstallment=" + totalNumberInstallment + ", discountPercent="
				+ discountPercent + ", netFee=" + netFee + ", numberInstallmentCompleted=" + numberInstallmentCompleted
				+ ", numberInstallmentDue=" + numberInstallmentDue + ", installmentDatesDecided="
				+ installmentDatesDecided + ", installmentDepositingDate=" + installmentDepositingDate + ", student="
				+ student + "]";
	}

}
