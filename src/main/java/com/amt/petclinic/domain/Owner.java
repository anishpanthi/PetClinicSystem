/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amt.petclinic.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Anish Panthi
 */
@Entity
public class Owner implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	
//	@NotEmpty(message = "First Name cannot be empty.")
	private String firstname;
	
//	@NotEmpty(message = "Last Name cannot be empty.")
	private String lastname;
	
//	@NotEmpty(message = "Username cannot be empty.")
	private String userName;
	private String phone;
	
//	@NotEmpty(message = "City cannot be empty.")
	private String city;
	
//	@NotEmpty(message = "House Number cannot be empty.")
	private String housenumber;
	
	private String statename;
	
//	@NotEmpty(message = "Street Number cannot be empty.")
	private String streetnumber;
	
//	@NotEmpty(message = "Zip Code cannot be empty.")
	private String zipcode;
	
	@JoinColumn(name = "user_id")
	@OneToOne(cascade = CascadeType.ALL)
	private User user;

	@OneToMany(mappedBy = "ownerid")
	private List<Appointment> appointmentList;

	@OneToMany(mappedBy = "ownerid")
	private List<Payment> paymentList;

	@OneToMany(mappedBy = "ownerid")
	private List<Pet> petList;

	public Owner() {
	}

	public Owner(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getUserName(){
    	return userName;
    }

    public void setUserName(String userName){
    	this.userName = userName;
    }

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getStreetnumber() {
		return streetnumber;
	}

	public void setStreetnumber(String streetnumber) {
		this.streetnumber = streetnumber;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	public List<Payment> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(List<Payment> paymentList) {
		this.paymentList = paymentList;
	}

	public List<Pet> getPetList() {
		return petList;
	}

	public void setPetList(List<Pet> petList) {
		this.petList = petList;
	}

	// @Override
	// public int hashCode() {
	// int hash = 0;
	// hash += (id != null ? id.hashCode() : 0);
	// return hash;
	// }
	//
	// @Override
	// public boolean equals(Object object) {
	// // TODO: Warning - this method won't work in the case the id fields are
	// not set
	// if (!(object instanceof Owner)) {
	// return false;
	// }
	// Owner other = (Owner) object;
	// if ((this.id == null && other.id != null) || (this.id != null &&
	// !this.id.equals(other.id))) {
	// return false;
	// }
	// return true;
	// }

	@Override
	public String toString() {
		return "com.amt.petclinic.domain.Owner[ id=" + id + " ]";
	}

}
