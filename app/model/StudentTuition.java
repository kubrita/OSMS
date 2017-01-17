package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the student_tuition database table.
 * 
 */
@Entity
@Table(name="student_tuition")
public class StudentTuition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="student_id")
	private int studentId;

	//bi-directional many-to-one association to TuitionFee
	@ManyToOne
	@JoinColumn(name="tuition_fee_id")
	private TuitionFee tuitionFee;

	public StudentTuition() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public TuitionFee getTuitionFee() {
		return this.tuitionFee;
	}

	public void setTuitionFee(TuitionFee tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

}