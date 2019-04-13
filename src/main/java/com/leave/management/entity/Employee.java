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
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author t_pnjeru
 *
 */
@Entity
@JsonIgnoreProperties(value = {"last_update", "created_on"}, 
allowGetters = true)
public class Employee {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	
	private String name;
	private String email;
	private String mobile;
	private String address;
	private String dob;
	
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date last_update;
	
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	private Date created_on;
	
	public Employee() {
		
	}

	public Employee(String name, String email, String mobile, String address, String dob, Date last_update,
			Date created_on) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.dob = dob;
		this.last_update = last_update;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * @return the last_update
	 */
	public Date getLast_update() {
		return last_update;
	}

	/**
	 * @param last_update the last_update to set
	 */
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
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
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", address="
				+ address + ", dob=" + dob + ", last_update=" + last_update + ", created_on=" + created_on
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
