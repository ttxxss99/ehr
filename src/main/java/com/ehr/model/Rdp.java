package com.ehr.model;

import java.util.Date;

public class Rdp {
	private String empName;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_rewardpunish.id
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_rewardpunish.situation
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    private String situation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_rewardpunish.money
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    private Integer money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_rewardpunish.judge
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    private Integer judge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_rewardpunish.time
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_rewardpunish.emp_id
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    private Integer empId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ehr_rewardpunish.logicToDelete
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    private Integer logictodelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_rewardpunish.id
     *
     * @return the value of ehr_rewardpunish.id
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_rewardpunish.id
     *
     * @param id the value for ehr_rewardpunish.id
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_rewardpunish.situation
     *
     * @return the value of ehr_rewardpunish.situation
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public String getSituation() {
        return situation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_rewardpunish.situation
     *
     * @param situation the value for ehr_rewardpunish.situation
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public void setSituation(String situation) {
        this.situation = situation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_rewardpunish.money
     *
     * @return the value of ehr_rewardpunish.money
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_rewardpunish.money
     *
     * @param money the value for ehr_rewardpunish.money
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_rewardpunish.judge
     *
     * @return the value of ehr_rewardpunish.judge
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public Integer getJudge() {
        return judge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_rewardpunish.judge
     *
     * @param judge the value for ehr_rewardpunish.judge
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public void setJudge(Integer judge) {
        this.judge = judge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_rewardpunish.time
     *
     * @return the value of ehr_rewardpunish.time
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_rewardpunish.time
     *
     * @param time the value for ehr_rewardpunish.time
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_rewardpunish.emp_id
     *
     * @return the value of ehr_rewardpunish.emp_id
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_rewardpunish.emp_id
     *
     * @param empId the value for ehr_rewardpunish.emp_id
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_rewardpunish.logicToDelete
     *
     * @return the value of ehr_rewardpunish.logicToDelete
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public Integer getLogictodelete() {
        return logictodelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_rewardpunish.logicToDelete
     *
     * @param logictodelete the value for ehr_rewardpunish.logicToDelete
     *
     * @mbg.generated Fri Jun 28 22:48:24 CST 2019
     */
    public void setLogictodelete(Integer logictodelete) {
        this.logictodelete = logictodelete;
    }
}