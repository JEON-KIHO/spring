package com.example.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.DayVO;
import com.example.mapper_oracle.CalendarMapper;

@Controller
public class LoginController {
	@Autowired
	CalendarMapper mapper;
	
	@RequestMapping("login")
	public void login() {
		
	}
	
	@RequestMapping("company")
	public void company() {
		
	}
	
	@RequestMapping("interval")
	public void interval() {
		
	}
	
	@RequestMapping("day.json")
	@ResponseBody
	public void day() {
		GregorianCalendar cal = new GregorianCalendar();
		int thisYear = cal.get(GregorianCalendar.YEAR);
		int thisMonth = cal.get(GregorianCalendar.MONTH)+1;
		int thisDay = cal.get(GregorianCalendar.DAY_OF_MONTH);
		
		for(int y = thisYear; y <= thisYear+2; y++) {
			cal.set(GregorianCalendar.YEAR, y);
			String year = y+"";
			
			for(int m = 1; m <= 12; m++) {
				
				if(y==thisYear) {
					if(m >= thisMonth) {
						cal.set(GregorianCalendar.MONTH, m-1);
						String month = m+"";
						if(month.length() == 1) {
							month = "0" + month;
						}
						cal.set(GregorianCalendar.DAY_OF_MONTH, 1);
						int maxDay = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
						for(int d = 1; d <= maxDay; d++) {
							cal.set(GregorianCalendar.DAY_OF_MONTH, d);
							String day = d+"";
							if(day.length() == 1) {
								day = "0" + day;
							}
							Date strDate = cal.getTime();
							System.out.println(strDate);
							mapper.insert(strDate);
						}
					}
				} else {
					cal.set(GregorianCalendar.MONTH, m-1);
					String month = m+"";
					if(month.length() == 1) {
						month = "0" + month;
					}
					cal.set(GregorianCalendar.DAY_OF_MONTH, 1);
					int maxDay = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
					
					for(int d = 1; d <= maxDay; d++) {
						cal.set(GregorianCalendar.DAY_OF_MONTH, d);
						String day = d+"";
						if(day.length() == 1) {
							day = "0" + day;
						}
						Date strDate = cal.getTime();
						System.out.println(strDate);
						mapper.insert(strDate);
					}
				}
				
			}
		}
	}
	
//	@RequestMapping("day.json")
//	@ResponseBody
//	public List<DayVO> listJson(String keyword) {
//		List<DayVO> list = mapper.list(keyword);
//		return list;
//	}
//	
//	@RequestMapping("day")
//	public void day() {
//	}
}
