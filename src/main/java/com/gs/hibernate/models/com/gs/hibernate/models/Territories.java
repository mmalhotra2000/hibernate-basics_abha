package com.gs.hibernate.models;
// Generated 19 Jul, 2019 8:29:04 PM by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Territories generated by hbm2java
 */
@Entity
@Table(name = "territories", schema = "public")
public class Territories implements java.io.Serializable {

	private String territoryId;
	private Region region;
	private String territoryDescription;
	private Set<Employees> employeeses = new HashSet<Employees>(0);

	public Territories() {
	}

	public Territories(String territoryId, Region region, String territoryDescription) {
		this.territoryId = territoryId;
		this.region = region;
		this.territoryDescription = territoryDescription;
	}

	public Territories(String territoryId, Region region, String territoryDescription, Set<Employees> employeeses) {
		this.territoryId = territoryId;
		this.region = region;
		this.territoryDescription = territoryDescription;
		this.employeeses = employeeses;
	}

	@Id

	@Column(name = "territory_id", unique = true, nullable = false, length = 20)
	public String getTerritoryId() {
		return this.territoryId;
	}

	public void setTerritoryId(String territoryId) {
		this.territoryId = territoryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "region_id", nullable = false)
	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Column(name = "territory_description", nullable = false)
	public String getTerritoryDescription() {
		return this.territoryDescription;
	}

	public void setTerritoryDescription(String territoryDescription) {
		this.territoryDescription = territoryDescription;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "territorieses")
	public Set<Employees> getEmployeeses() {
		return this.employeeses;
	}

	public void setEmployeeses(Set<Employees> employeeses) {
		this.employeeses = employeeses;
	}

}
