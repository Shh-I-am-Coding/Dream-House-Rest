package com.ssafy.happy.deal.model.service;

import java.util.List;

import com.ssafy.happy.deal.model.repo.DealInfoRepo;
import com.ssafy.happy.deal.dto.DealInfo;

import org.springframework.stereotype.Service;

@Service
public class DealInfoServiceImpl implements DealInfoService {
	private final DealInfoRepo dealInfoRepo;

	public DealInfoServiceImpl(DealInfoRepo dealInfoRepo) {
		this.dealInfoRepo = dealInfoRepo;
	}

	@Override
	public List<DealInfo> getByDongCode(String dongCode, String sortBy, String sortOrder) {
		return dealInfoRepo.selectAllByDongCode(dongCode, sortBy, sortOrder);
	}

	@Override
	public List<DealInfo> getApt(String aptName, String dongCode) {
		return dealInfoRepo.selectApt(aptName, dongCode);
	}

}