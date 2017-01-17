package model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the tuition_fee database table.
 * 
 */
@Entity
@Table (name = "tuition_fee")
public class TuitionFee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column (name = "expire_date")
	private Timestamp expireDate;

	private Timestamp period;

	private int total;

	//bi-directional many-to-one association to StudentTuition
	@OneToMany (mappedBy = "tuitionFee")
	private List<StudentTuition> studentTuitions;

	public TuitionFee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Timestamp expireDate) {
		this.expireDate = expireDate;
	}

	public Timestamp getPeriod() {
		return this.period;
	}

	public void setPeriod(Timestamp period) {
		this.period = period;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<StudentTuition> getStudentTuitions() {
		return this.studentTuitions;
	}

	public void setStudentTuitions(List<StudentTuition> studentTuitions) {
		this.studentTuitions = studentTuitions;
	}

}