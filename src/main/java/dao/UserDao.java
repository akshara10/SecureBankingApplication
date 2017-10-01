package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bean.User;

public interface UserDao  {
	
	public void addUser(User user);
	public void deleteUser(String email);
	public User updateUser(User user);
	public User getUserbyEmail(String email);
}
