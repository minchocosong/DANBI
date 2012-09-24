package com.swm.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swm.domain.Counsel;
import com.swm.repository.CounselRepository;

@Service
public class CounselService {
	
	@Autowired
	private CounselRepository counselRepository;
	
	public Counsel create(Counsel counsel){
		System.out.println(counsel.getDate());
		counsel.setId(UUID.randomUUID().toString());
		return counselRepository.save(counsel);
	}
	
	public Counsel read(Counsel counsel){
		return counsel;
	}
	
	public List<Counsel> readAll(){
		return counselRepository.findAll();
	}

}
