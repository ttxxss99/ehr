package com.ehr.model;

import java.util.Date;
/**
 * 利润统计
 * @author WW
 *
 */
public class Profit {
    private Integer id;//编号 主键
    private Date date;//日期
    private Double rental;//公司收入总额 税前的
    private Double grossmargin;//毛利润
    private Double tax;//税收
    private Double spending;//总支出
    private String companyId;//对应公司的id

    @Override
	public String toString() {
		return "Profit [id=" + id + ", date=" + date + ", rental=" + rental + ", grossmargin=" + grossmargin + ", tax="
				+ tax + ", spending=" + spending + ", companyId=" + companyId + "]";
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbi_profit.id
     *
     * @return the value of dbi_profit.id
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbi_profit.id
     *
     * @param id the value for dbi_profit.id
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbi_profit.date
     *
     * @return the value of dbi_profit.date
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbi_profit.date
     *
     * @param date the value for dbi_profit.date
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbi_profit.rental
     *
     * @return the value of dbi_profit.rental
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public Double getRental() {
        return rental;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbi_profit.rental
     *
     * @param rental the value for dbi_profit.rental
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public void setRental(Double rental) {
        this.rental = rental;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbi_profit.grossMargin
     *
     * @return the value of dbi_profit.grossMargin
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public Double getGrossmargin() {
        return grossmargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbi_profit.grossMargin
     *
     * @param grossmargin the value for dbi_profit.grossMargin
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public void setGrossmargin(Double grossmargin) {
        this.grossmargin = grossmargin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbi_profit.tax
     *
     * @return the value of dbi_profit.tax
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public Double getTax() {
        return tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbi_profit.tax
     *
     * @param tax the value for dbi_profit.tax
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public void setTax(Double tax) {
        this.tax = tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbi_profit.spending
     *
     * @return the value of dbi_profit.spending
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public Double getSpending() {
        return spending;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbi_profit.spending
     *
     * @param spending the value for dbi_profit.spending
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public void setSpending(Double spending) {
        this.spending = spending;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbi_profit.company_id
     *
     * @return the value of dbi_profit.company_id
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbi_profit.company_id
     *
     * @param companyId the value for dbi_profit.company_id
     *
     * @mbg.generated Thu Jun 27 21:44:57 CST 2019
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}