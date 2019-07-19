package com.gs.hibernate.models;
// Generated 19 Jul, 2019 8:29:04 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TeacherStandardId generated by hbm2java
 */
@Embeddable
public class TeacherStandardId implements java.io.Serializable {

	private long teachersSeq;
	private long standardsSeq;

	public TeacherStandardId() {
	}

	public TeacherStandardId(long teachersSeq, long standardsSeq) {
		this.teachersSeq = teachersSeq;
		this.standardsSeq = standardsSeq;
	}

	@Column(name = "teachers_seq", nullable = false)
	public long getTeachersSeq() {
		return this.teachersSeq;
	}

	public void setTeachersSeq(long teachersSeq) {
		this.teachersSeq = teachersSeq;
	}

	@Column(name = "standards_seq", nullable = false)
	public long getStandardsSeq() {
		return this.standardsSeq;
	}

	public void setStandardsSeq(long standardsSeq) {
		this.standardsSeq = standardsSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TeacherStandardId))
			return false;
		TeacherStandardId castOther = (TeacherStandardId) other;

		return (this.getTeachersSeq() == castOther.getTeachersSeq())
				&& (this.getStandardsSeq() == castOther.getStandardsSeq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getTeachersSeq();
		result = 37 * result + (int) this.getStandardsSeq();
		return result;
	}

}
