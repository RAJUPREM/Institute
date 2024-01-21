package com.shreemanancareercenter.controller;

import java.sql.Date;
import java.util.List;

public class Fee {
	
	private int feeId;
	private int totalNumberInstallment;
	private int discountPercent;
	private int netFee;
	private int numberInstallmentCompleted;
	private int numberInstallmentDue;
	private List<Date> installmentDatesDecided;
	private List<Date> installmentDepositingDate;
	
	private Student student;

}
