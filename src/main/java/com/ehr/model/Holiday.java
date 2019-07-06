package com.ehr.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Holiday {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_holiday.id
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_holiday.name
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_holiday.time
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_holiday.logicToDelete
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    private Integer logictodelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_holiday.content
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_holiday.id
     *
     * @return the value of ehr_holiday.id
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_holiday.id
     *
     * @param id the value for ehr_holiday.id
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_holiday.name
     *
     * @return the value of ehr_holiday.name
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_holiday.name
     *
     * @param name the value for ehr_holiday.name
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_holiday.time
     *
     * @return the value of ehr_holiday.time
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_holiday.time
     *
     * @param time the value for ehr_holiday.time
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_holiday.logicToDelete
     *
     * @return the value of ehr_holiday.logicToDelete
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    public Integer getLogictodelete() {
        return logictodelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_holiday.logicToDelete
     *
     * @param logictodelete the value for ehr_holiday.logicToDelete
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    public void setLogictodelete(Integer logictodelete) {
        this.logictodelete = logictodelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_holiday.content
     *
     * @return the value of ehr_holiday.content
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_holiday.content
     *
     * @param content the value for ehr_holiday.content
     *
     * @mbg.generated Sun Jun 23 19:50:14 CST 2019
     */
    public void setContent(String content) {
        this.content = content;
    }

	public Holiday(Integer id, String name, Date time, Integer logictodelete, String content) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.logictodelete = logictodelete;
		this.content = content;
	}

	public Holiday() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}