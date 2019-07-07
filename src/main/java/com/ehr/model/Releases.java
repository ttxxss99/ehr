package com.ehr.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 招聘信息发布表
 * ehr_releases表对应的POJO类
 * @author WW
 *
 */
public class Releases {
    private Integer id;//编号
    private String skillsrequired;//技能要求
    private Integer hiring;//招聘人数
    private Integer wagebudget;//薪资预算
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date initiatetime;//发起时间
    private Integer state;//状态
    private String mark;//备注
    private Integer empId;//发布人
    private Integer channelId;//渠道
    private Integer logictodelete;//逻辑删除

    //empName字段为id为empId的名字
    private String empName;
    //channelName字段为id为channelId的名字
    private String channelName;
    //状态码转换为名字
    private String stateStr;
    //逻辑删除码转换为字符串
    private String logName;
    
    public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

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

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	@Override
	public String toString() {
		return "Releases [id=" + id + ", skillsrequired=" + skillsrequired + ", hiring=" + hiring + ", wagebudget="
				+ wagebudget + ", initiatetime=" + initiatetime + ", state=" + state + ", mark=" + mark + ", empId="
				+ empId + ", channelId=" + channelId + ", logictodelete=" + logictodelete + "]";
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_releases.id
     *
     * @return the value of ehr_releases.id
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_releases.id
     *
     * @param id the value for ehr_releases.id
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_releases.skillsRequired
     *
     * @return the value of ehr_releases.skillsRequired
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public String getSkillsrequired() {
        return skillsrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_releases.skillsRequired
     *
     * @param skillsrequired the value for ehr_releases.skillsRequired
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setSkillsrequired(String skillsrequired) {
        this.skillsrequired = skillsrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_releases.hiring
     *
     * @return the value of ehr_releases.hiring
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getHiring() {
        return hiring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_releases.hiring
     *
     * @param hiring the value for ehr_releases.hiring
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setHiring(Integer hiring) {
        this.hiring = hiring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_releases.wageBudget
     *
     * @return the value of ehr_releases.wageBudget
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getWagebudget() {
        return wagebudget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_releases.wageBudget
     *
     * @param wagebudget the value for ehr_releases.wageBudget
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setWagebudget(Integer wagebudget) {
        this.wagebudget = wagebudget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_releases.initiateTime
     *
     * @return the value of ehr_releases.initiateTime
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Date getInitiatetime() {
        return initiatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_releases.initiateTime
     *
     * @param initiatetime the value for ehr_releases.initiateTime
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setInitiatetime(Date initiatetime) {
        this.initiatetime = initiatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_releases.state
     *
     * @return the value of ehr_releases.state
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_releases.state
     *
     * @param state the value for ehr_releases.state
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_releases.mark
     *
     * @return the value of ehr_releases.mark
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public String getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_releases.mark
     *
     * @param mark the value for ehr_releases.mark
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_releases.emp_id
     *
     * @return the value of ehr_releases.emp_id
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_releases.emp_id
     *
     * @param empId the value for ehr_releases.emp_id
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_releases.channel_id
     *
     * @return the value of ehr_releases.channel_id
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_releases.channel_id
     *
     * @param channelId the value for ehr_releases.channel_id
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ehr_releases.logicToDelete
     *
     * @return the value of ehr_releases.logicToDelete
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public Integer getLogictodelete() {
        return logictodelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ehr_releases.logicToDelete
     *
     * @param logictodelete the value for ehr_releases.logicToDelete
     *
     * @mbg.generated Mon Jun 24 10:46:18 CST 2019
     */
    public void setLogictodelete(Integer logictodelete) {
        this.logictodelete = logictodelete;
    }
}