/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amt.petclinic.domain;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author AMT
 */
@Entity
/*
 * @NamedQueries({
 * 
 * @NamedQuery(name = "Owner.findAll", query = "SELECT o FROM Owner o"),
 * 
 * @NamedQuery(name = "Owner.findById", query =
 * "SELECT o FROM Owner o WHERE o.id = :id"),
 * 
 * @NamedQuery(name = "Owner.findByFirstname", query =
 * "SELECT o FROM Owner o WHERE o.firstname = :firstname"),
 * 
 * @NamedQuery(name = "Owner.findByLastname", query =
 * "SELECT o FROM Owner o WHERE o.lastname = :lastname"),
 * 
 * @NamedQuery(name = "Owner.findByPhone", query =
 * "SELECT o FROM Owner o WHERE o.phone = :phone")})
 */
public class Owner implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstname;
	private String lastname;
	private String phone;
	
	@JoinColumn(name = "Address_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Address addressid;
	
	@JoinColumn(name = "User_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private User userid;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ownerid")
	private Collection<Appointment> appointmentCollection;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ownerid")
	private Collection<Payment> paymentCollection;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ownerid")
	private Collection<Pet> petCollection;

	public Owner() {
	}

	public Owner(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddressid() {
		return addressid;
	}

	public void setAddressid(Address addressid) {
		this.addressid = addressid;
	}

	public User getUserid() {
		return userid;
	}

	public void setUserid(User userid) {
		this.userid = userid;
	}

	@XmlTransient
	public Collection<Appointment> getAppointmentCollection() {
		return appointmentCollection;
	}

	public void setAppointmentCollection(Collection<Appointment> appointmentCollection) {
		this.appointmentCollection = appointmentCollection;
	}

	@XmlTransient
	public Collection<Payment> getPaymentCollection() {
		return paymentCollection;
	}

	public void setPaymentCollection(Collection<Payment> paymentCollection) {
		this.paymentCollection = paymentCollection;
	}

	@XmlTransient
	public Collection<Pet> getPetCollection() {
		return petCollection;
	}

	public void setPetCollection(Collection<Pet> petCollection) {
		this.petCollection = petCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Owner)) {
			return false;
		}
		Owner other = (Owner) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.app.domain.Owner[ id=" + id + " ]";
	}

}
