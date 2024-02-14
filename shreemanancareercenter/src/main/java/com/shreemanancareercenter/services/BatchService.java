package com.shreemanancareercenter.services;

import java.util.List;

import com.shreemanancareercenter.Dto.BatchDto;
import com.shreemanancareercenter.entity.Batch;

public interface BatchService {
	
	public void addBatch(BatchDto batchDto);
	
	public List<Batch> getAllBatch();

}
