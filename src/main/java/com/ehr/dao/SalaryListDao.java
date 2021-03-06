package com.ehr.dao;

import com.ehr.model.SalaryList;
import java.util.List;

public interface SalaryListDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_articlewages
     *
     * @mbg.generated Fri Jun 28 21:04:19 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_articlewages
     *
     * @mbg.generated Fri Jun 28 21:04:19 CST 2019
     */
    int insert(SalaryList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_articlewages
     *
     * @mbg.generated Fri Jun 28 21:04:19 CST 2019
     */
    SalaryList selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_articlewages
     *
     * @mbg.generated Fri Jun 28 21:04:19 CST 2019
     */
    List<SalaryList> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_articlewages
     *
     * @mbg.generated Fri Jun 28 21:04:19 CST 2019
     */
    int updateByPrimaryKey(SalaryList record);
}