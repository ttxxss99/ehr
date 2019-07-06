package com.ehr.dao;

import com.ehr.model.Holiday;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HolidayDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_holiday
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_holiday
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    int insert(Holiday record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_holiday
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    Holiday selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_holiday
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    List<Holiday> selectAll();
    List<Holiday> selectAll(@Param("name")String name);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_holiday
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    int updateByPrimaryKey(Holiday record);
}