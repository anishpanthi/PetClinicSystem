/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amt.petclinic.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 *
 * @author AMT
 */
@Entity
/*
 * @NamedQueries({
 * 
 * @NamedQuery(name = "Feedback.findAll", query = "SELECT f FROM Feedback f"),
 * 
 * @NamedQuery(name = "Feedback.findById", query =
 * "SELECT f FROM Feedback f WHERE f.id = :id"),
 * 
 * @NamedQuery(name = "Feedback.findByFirstname", query =
 * "SELECT f FROM Feedback f WHERE f.firstname = :firstname"),
 * 
 * @NamedQuery(name = "Feedback.findByLastname", query =
 * "SELECT f FROM Feedback f WHERE f.lastname = :lastname"),
 * 
 * @NamedQuery(name = "Feedback.findByEmail", query =
 * "SELECT f FROM Feedback f WHERE f.email = :email")})
 */
public class Feedback implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstname;
	private String lastname;
	private String email;
	@Lob
	@Column(name = "comments")
	private String comments;
	@JoinColumn(name = "Owner_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Owner ownerid;

	public Feedback() {
	}

	public Feedback(String firstname, String lastname, String email, String comments, Owner ownerid) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.comments = comments;
		this.ownerid = ownerid;
	}

	public Feedback(Integer id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Owner getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(Owner ownerid) {
		this.ownerid = ownerid;
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
		if (!(object instanceof Feedback)) {
			return false;
		}
		Feedback other = (Feedback) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.app.domain.Feedback[ id=" + id + " ]";
	}

}
