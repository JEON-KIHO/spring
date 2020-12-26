package com.example.mapper_oracle;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.domain.DayVO;
import com.example.domain.DepositVO;

public interface DepositMapper {
   public List<DepositVO> Dlist(String compnayCode);
   
   public List<DepositVO> depositassetsread(@Param("depositAccountCode")String depositAccountCode, @Param("date")String date);

   public List<HashMap<String, Object>> depositpercent(String companyCode);
   
   public List<HashMap<String, Object>> depositTotal(String companyCode);
   
   public List<Integer> DEYearList(@Param("depositAccountCode")String depositAccountCode, @Param("companyCode")String companyCode);
   
   public List<Integer> DEMonthList(@Param("year") String year, @Param("companyCode") String companyCode, @Param("depositAccountCode")String depositAccountCode);
   
   public DepositVO depositassets(String depositAccountCode);
   
   public List<HashMap<String, Object>> DEdailyYearList(@Param("depositAccountCode")String depositAccountCode, @Param("companyCode")String companyCode);
    
   public List<HashMap<String, Object>> DEdailyMonthList(@Param("year") String year, @Param("companyCode") String companyCode, @Param("depositAccountCode")String depositAccountCode);
}