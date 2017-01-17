package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the play_evolutions database table.
 * 
 */
@Entity
@Table(name="play_evolutions")
public class PlayEvolution implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="applied_at")
	private Timestamp appliedAt;

	@Lob
	@Column(name="apply_script")
	private String applyScript;

	private String hash;

	@Lob
	@Column(name="last_problem")
	private String lastProblem;

	@Lob
	@Column(name="revert_script")
	private String revertScript;

	private String state;

	public PlayEvolution() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getAppliedAt() {
		return this.appliedAt;
	}

	public void setAppliedAt(Timestamp appliedAt) {
		this.appliedAt = appliedAt;
	}

	public String getApplyScript() {
		return this.applyScript;
	}

	public void setApplyScript(String applyScript) {
		this.applyScript = applyScript;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getLastProblem() {
		return this.lastProblem;
	}

	public void setLastProblem(String lastProblem) {
		this.lastProblem = lastProblem;
	}

	public String getRevertScript() {
		return this.revertScript;
	}

	public void setRevertScript(String revertScript) {
		this.revertScript = revertScript;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}