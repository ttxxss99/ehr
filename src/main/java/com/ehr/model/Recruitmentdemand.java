package com.ehr.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 招聘需求
 * ehr_recruitmentdemand表对应的POJO类
 * @author WW
 *
 */
public class Recruitmentdemand {
    private Integer id;//编号
    private String skillsrequired;//技能要求
    private Integer hiring;//招聘人数
    private Integer wagebudget;//薪资预算
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date initiatetime;//发起时间
    private Integer state;//状态
    private String mark;//备注
    private Integer empId;//发布人
    private Integer logictodelete;//逻辑删除
    //emp_id 查询对应的用户名字empName;
    private String empName;
    //状态码转换为名字
    private String stateStr;
    
    
    public String getStateStr() {
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Recruitmentdemand [id=" + id + ", skillsrequired=" + skillsrequired + ", hiring=" + hiring
				+ ", wagebudget=" + wagebudget + ", initiatetime=" + initiatetime + ", state=" + state + ", mark="
				+ mark + ", empId=" + empId + ", logictodelete=" + logictodelete + "]";
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_recruitmentdemand.id
     *
     * @return the value of ehr_recruitmentdemand.id
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_recruitmentdemand.id
     *
     * @param id the value for ehr_recruitmentdemand.id
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_recruitmentdemand.skillsRequired
     *
     * @return the value of ehr_recruitmentdemand.skillsRequired
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public String getSkillsrequired() {
        return skillsrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_recruitmentdemand.skillsRequired
     *
     * @param skillsrequired the value for ehr_recruitmentdemand.skillsRequired
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setSkillsrequired(String skillsrequired) {
        this.skillsrequired = skillsrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_recruitmentdemand.hiring
     *
     * @return the value of ehr_recruitmentdemand.hiring
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getHiring() {
        return hiring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_recruitmentdemand.hiring
     *
     * @param hiring the value for ehr_recruitmentdemand.hiring
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setHiring(Integer hiring) {
        this.hiring = hiring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_recruitmentdemand.wageBudget
     *
     * @return the value of ehr_recruitmentdemand.wageBudget
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getWagebudget() {
        return wagebudget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_recruitmentdemand.wageBudget
     *
     * @param wagebudget the value for ehr_recruitmentdemand.wageBudget
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setWagebudget(Integer wagebudget) {
        this.wagebudget = wagebudget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_recruitmentdemand.initiateTime
     *
     * @return the value of ehr_recruitmentdemand.initiateTime
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Date getInitiatetime() {
        return initiatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_recruitmentdemand.initiateTime
     *
     * @param initiatetime the value for ehr_recruitmentdemand.initiateTime
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setInitiatetime(Date initiatetime) {
        this.initiatetime = initiatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_recruitmentdemand.state
     *
     * @return the value of ehr_recruitmentdemand.state
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_recruitmentdemand.state
     *
     * @param state the value for ehr_recruitmentdemand.state
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_recruitmentdemand.mark
     *
     * @return the value of ehr_recruitmentdemand.mark
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_recruitmentdemand.mark
     *
     * @param mark the value for ehr_recruitmentdemand.mark
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_recruitmentdemand.emp_id
     *
     * @return the value of ehr_recruitmentdemand.emp_id
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_recruitmentdemand.emp_id
     *
     * @param empId the value for ehr_recruitmentdemand.emp_id
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_recruitmentdemand.logicToDelete
     *
     * @return the value of ehr_recruitmentdemand.logicToDelete
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getLogictodelete() {
        return logictodelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_recruitmentdemand.logicToDelete
     *
     * @param logictodelete the value for ehr_recruitmentdemand.logicToDelete
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setLogictodelete(Integer logictodelete) {
        this.logictodelete = logictodelete;
    }
}