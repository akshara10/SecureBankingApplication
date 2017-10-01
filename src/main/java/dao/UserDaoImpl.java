package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import bean.User;

public class UserDaoImpl implements UserDao {

	
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory s)
	{
		this.sessionFactory = s;
	}
	
	@Override
	@Transactional
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);;
		
	}

	@Override
	@Transactional
	public void deleteUser(String email) {
		User user = (User)sessionFactory.getCurrentSession().load(User.class, email);
		
		if(null != user)
		{
			this.sessionFactory.getCurrentSession().delete(user);
		}
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
		
		return user;
	}

	@Override
	@Transactional
	public User getUserbyEmail(String Email) {
		return null;
	
		//return (User).session
	}

}
	

	