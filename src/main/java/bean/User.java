package bean;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="user")
public abstract class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private long  uid;
	
	@Column(name="first_name",nullable=false)
	@NotEmpty(message = "Please provide first name")
	private String f_name;
	
	@Column(name="last_name",nullable=false)
	private String l_name;
	
	@Id
	@Column(name="email", unique=true,nullable=false)
	@Email(message = "Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;
	
	@Column(name="usertype")
	private int userType;
	
	@Column(name="active")
	private int active;
	
	
	
	@Column(name="password")
	@Length(min=5,max=12,message="enter password of atleast 5 characters and less than 12 characters")
	@NotEmpty(message="Enter password")
	@Transient
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "id1", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "custid"))
	//@JoinTable(name = "id2", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "eid"))	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
					
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	

}
