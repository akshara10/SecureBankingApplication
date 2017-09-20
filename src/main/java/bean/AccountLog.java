package bean;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accountlog")
public class AccountLog {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	//TO ADD	
	
	@Column(name="time")
	private Timestamp date;
	
	@Column(name="message")
	private String message;
	
	

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
	

}
