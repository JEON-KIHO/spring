package com.example.mapper_oracle;

import java.util.Date;
import java.util.List;

import com.example.domain.DayVO;

public interface CalendarMapper {
	public void insert(Date date);
	
	public List<DayVO> list(String keyword);
	
	public int total(String keyword);
}
