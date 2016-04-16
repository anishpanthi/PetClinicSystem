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
 * @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d"),
 * 
 * @NamedQuery(name = "Doctor.findById", query =
 * "SELECT d FROM Doctor d WHERE d.id = :id"),
 * 
 * @NamedQuery(name = "Doctor.findByFirstname", query =
 * "SELECT d FROM Doctor d WHERE d.firstname = :firstname"),
 * 
 * @NamedQuery(name = "Doctor.findByLastname", query =
 * "SELECT d FROM Doctor d WHERE d.lastname = :lastname"),
 * 
 * @NamedQuery(name = "Doctor.findByPhone", query =
 * "SELECT d FROM Doctor d WHERE d.phone = :phone"),
 * 
 * @NamedQuery(name = "Doctor.findByEmail", query =
 * "SELECT d FROM Doctor d WHERE d.email = :email")})
 */
public class Doctor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;
	@JoinColumn(name = "Address_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Address addressid;
	@JoinColumn(name = "User_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private User userid;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctorid")
	private Collection<Pet> petCollection;

	public Doctor() {
	}

	public Doctor(String firstname, String lastname, String phone, String email, Address addressid, User userid,
			Collection<Pet> petCollection) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.addressid = addressid;
		this.userid = userid;
		this.petCollection = petCollection;
	}

	public Doctor(Integer id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		if (!(object instanceof Doctor)) {
			return false;
		}
		Doctor other = (Doctor) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.app.domain.Doctor[ id=" + id + " ]";
	}

}
