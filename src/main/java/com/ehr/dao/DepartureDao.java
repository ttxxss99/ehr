package com.ehr.dao;

import com.ehr.model.Departure;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartureDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_departure
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_departure
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    int insert(Departure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_departure
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    Departure selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_departure
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    List<Departure> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ehr_departure
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    int updateByPrimaryKey(Departure record);

	List<Departure> selectLike(@Param("instructions") String instructions);
}