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
 * @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a"),
 * 
 * @NamedQuery(name = "Address.findById", query =
 * "SELECT a FROM Address a WHERE a.id = :id"),
 * 
 * @NamedQuery(name = "Address.findByHouseNumber", query =
 * "SELECT a FROM Address a WHERE a.houseNumber = :houseNumber"),
 * 
 * @NamedQuery(name = "Address.findByStreetNumber", query =
 * "SELECT a FROM Address a WHERE a.streetNumber = :streetNumber"),
 * 
 * @NamedQuery(name = "Address.findByCity", query =
 * "SELECT a FROM Address a WHERE a.city = :city"),
 * 
 * @NamedQuery(name = "Address.findByState", query =
 * "SELECT a FROM Address a WHERE a.state = :state"),
 * 
 * @NamedQuery(name = "Address.findByZipCode", query =
 * "SELECT a FROM Address a WHERE a.zipCode = :zipCode")})
 */
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String houseNumber;
	private String streetNumber;
	private String city;
	private String state;
	private String zipCode;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressid")
	private Collection<Doctor> doctorCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressid")
	private Collection<Owner> ownerCollection;

	public Address() {
	}

	public Address(String houseNumber, String streetNumber, String city, String state, String zipCode,
			Collection<Doctor> doctorCollection, Collection<Owner> ownerCollection) {
		super();
		this.houseNumber = houseNumber;
		this.streetNumber = streetNumber;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.doctorCollection = doctorCollection;
		this.ownerCollection = ownerCollection;
	}

	public Address(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@XmlTransient
	public Collection<Doctor> getDoctorCollection() {
		return doctorCollection;
	}

	public void setDoctorCollection(Collection<Doctor> doctorCollection) {
		this.doctorCollection = doctorCollection;
	}

	@XmlTransient
	public Collection<Owner> getOwnerCollection() {
		return ownerCollection;
	}

	public void setOwnerCollection(Collection<Owner> ownerCollection) {
		this.ownerCollection = ownerCollection;
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
		if (!(object instanceof Address)) {
			return false;
		}
		Address other = (Address) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.app.domain.Address[ id=" + id + " ]";
	}

}
