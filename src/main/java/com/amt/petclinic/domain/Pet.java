/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amt.petclinic.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author AMT
 */
@Entity
/*@NamedQueries({
    @NamedQuery(name = "Pet.findAll", query = "SELECT p FROM Pet p"),
    @NamedQuery(name = "Pet.findById", query = "SELECT p FROM Pet p WHERE p.id = :id"),
    @NamedQuery(name = "Pet.findByGender", query = "SELECT p FROM Pet p WHERE p.gender = :gender"),
    @NamedQuery(name = "Pet.findByType", query = "SELECT p FROM Pet p WHERE p.type = :type"),
    @NamedQuery(name = "Pet.findByAge", query = "SELECT p FROM Pet p WHERE p.age = :age"),
    @NamedQuery(name = "Pet.findByName", query = "SELECT p FROM Pet p WHERE p.name = :name")})*/
public class Pet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String gender;
    private String type;
    private String age;
    private String name;
    @JoinColumn(name = "Doctor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Doctor doctorid;
    @JoinColumn(name = "Owner_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Owner ownerid;

    public Pet() {
    }
    
    public Pet(String gender, String type, String age, String name, Doctor doctorid, Owner ownerid) {
		super();
		this.gender = gender;
		this.type = type;
		this.age = age;
		this.name = name;
		this.doctorid = doctorid;
		this.ownerid = ownerid;
	}

	public Pet(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doctor getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Doctor doctorid) {
        this.doctorid = doctorid;
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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pet)) {
            return false;
        }
        Pet other = (Pet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.app.domain.Pet[ id=" + id + " ]";
    }
    
}
