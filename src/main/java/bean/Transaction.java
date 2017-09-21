package bean;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)		
	@Column(name="transaction_id")
	private int tid;
	
	@Column(name ="transaction_date")
	private Timestamp date;
	
	@Column(name="account_id_1")
	private String acc_id1;
	
	@Column(name="account_id_2")
	private String acc_id2;
	
	@Column(name="transactiontype")
	private int transType;
	
	@Column(name="status")
	private String status;
	
	@Column(name="transaction_description")
	private String description;
	
	@Column(name="approvedby")
	private String approvedby;
	
	@Column(name="amount")
	private long amount;
	
	@Column(name="iscritical")
	private boolean iscritical;
		
	public boolean isIscritical() {
		return iscritical;
	}
	public void setIscritical(boolean iscritical) {
		this.iscritical = iscritical;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Timestamp getDate() {
		return date;
	}
	public String getStatus() {
		return status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getApprovedby() {
		return approvedby;
	}
	public void setApprovedby(String approvedby) {
		this.approvedby = approvedby;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getAcc_id1() {
		return acc_id1;
	}
	public void setAcc_id1(String acc_id1) {
		this.acc_id1 = acc_id1;
	}
	public String getAcc_id2() {
		return acc_id2;
	}
	public void setAcc_id2(String acc_id2) {
		this.acc_id2 = acc_id2;
	}
	public int getTransType() {
		return transType;
	}
	public void setTransType(int transType) {
		this.transType = transType;
	}
	

}
