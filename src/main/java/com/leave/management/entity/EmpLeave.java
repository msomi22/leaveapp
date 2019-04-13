/**
 * 
 */
package com.leave.management.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author t_pnjeru
 *
 */
@Entity // This tells Hibernate to make a table out of this class
@JsonIgnoreProperties(value = {"start_on", "end_on", "created_on"}, 
allowGetters = true)
public class EmpLeave {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name = "emp_id")
	private Integer empId;
	private String leave_reason;
	
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date start_on;
	
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date end_on;
	
	private Integer balance_days;

	@Column(nullable = false, updatable = false, name = "created_on")
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date created_on;

	public EmpLeave() {

	}

	public EmpLeave(Integer emp_id, String leave_reason, Date start_on, Date end_on, Integer balance_days,
			Date created_on) {
		super();
		this.empId = emp_id;
		this.leave_reason = leave_reason;
		this.start_on = start_on;
		this.end_on = end_on;
		this.balance_days = balance_days;
		this.created_on = created_on;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the emp_id
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param emp_id the emp_id to set
	 */
	public void setEmpId(Integer emp_id) {
		this.empId = emp_id;
	}

	/**
	 * @return the leave_reason
	 */
	public String getLeave_reason() {
		return leave_reason;
	}

	/**
	 * @param leave_reason the leave_reason to set
	 */
	public void setLeave_reason(String leave_reason) {
		this.leave_reason = leave_reason;
	}

	/**
	 * @return the start_on
	 */
	public Date getStart_on() {
		return start_on;
	}

	/**
	 * @param start_on the start_on to set
	 */
	public void setStart_on(Date start_on) {
		this.start_on = start_on;
	}

	/**
	 * @return the end_on
	 */
	public Date getEnd_on() {
		return end_on;
	}

	/**
	 * @param end_on the end_on to set
	 */
	public void setEnd_on(Date end_on) {
		this.end_on = end_on;
	}

	/**
	 * @return the balance_days
	 */
	public Integer getBalance_days() {
		return balance_days;
	}

	/**
	 * @param balance_days the balance_days to set
	 */
	public void setBalance_days(Integer balance_days) {
		this.balance_days = balance_days;
	}

	/**
	 * @return the created_on
	 */
	public Date getCreated_on() {
		return created_on;
	}

	/**
	 * @param created_on the created_on to set
	 */
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpLeave [id=" + id + ", emp_id=" + empId + ", leave_reason=" + leave_reason + ", start_on=" + start_on
				+ ", end_on=" + end_on + ", balance_days=" + balance_days + ", created_on=" + created_on + "]";
	}




}
