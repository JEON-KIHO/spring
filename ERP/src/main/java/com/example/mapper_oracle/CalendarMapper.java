package com.example.mapper_oracle;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.domain.DayVO;

public interface CalendarMapper {
	public void insert(@Param("date") Date date, @Param("wom") int wom);
	
	public List<DayVO> list(String keyword);
	
	public int total(String keyword);
}