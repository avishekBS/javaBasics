package com.learn.hibernate.entity.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue ("COVANCE")
public class CovanceEmployee extends Employee {
	
	@Column (name = "emp_organisation")
	private String organisation;

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	
}
