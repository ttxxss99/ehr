package com.ehr.dao;

import com.ehr.model.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_company
     *
     * @mbg.generated Sun Jun 23 22:13:42 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_company
     *
     * @mbg.generated Sun Jun 23 22:13:42 CST 2019
     */
    int insert(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_company
     *
     * @mbg.generated Sun Jun 23 22:13:42 CST 2019
     */
    Company selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_company
     *
     * @mbg.generated Sun Jun 23 22:13:42 CST 2019
     */
    List<Company> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_company
     *
     * @mbg.generated Sun Jun 23 22:13:42 CST 2019
     */
    int updateByPrimaryKey(Company record);

    List<Company> likeSearch(@Param(value = "name")String name,@Param(value = "address")String address);


}