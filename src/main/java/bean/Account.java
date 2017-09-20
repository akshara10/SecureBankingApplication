package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="Account")
public class Account {
	
	@Column(name="id")
	private long account_id;
	
	@Column(name="amount")
	private long amount;

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	

}
