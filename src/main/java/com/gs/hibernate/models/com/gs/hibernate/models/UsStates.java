package com.gs.hibernate.models;
// Generated 19 Jul, 2019 8:29:04 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UsStates generated by hbm2java
 */
@Entity
@Table(name = "us_states", schema = "public")
public class UsStates implements java.io.Serializable {

	private short stateId;
	private String stateName;
	private String stateAbbr;
	private String stateRegion;

	public UsStates() {
	}

	public UsStates(short stateId) {
		this.stateId = stateId;
	}

	public UsStates(short stateId, String stateName, String stateAbbr, String stateRegion) {
		this.stateId = stateId;
		this.stateName = stateName;
		this.stateAbbr = stateAbbr;
		this.stateRegion = stateRegion;
	}

	@Id

	@Column(name = "state_id", unique = true, nullable = false)
	public short getStateId() {
		return this.stateId;
	}

	public void setStateId(short stateId) {
		this.stateId = stateId;
	}

	@Column(name = "state_name", length = 100)
	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Column(name = "state_abbr", length = 2)
	public String getStateAbbr() {
		return this.stateAbbr;
	}

	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}

	@Column(name = "state_region", length = 50)
	public String getStateRegion() {
		return this.stateRegion;
	}

	public void setStateRegion(String stateRegion) {
		this.stateRegion = stateRegion;
	}

}
