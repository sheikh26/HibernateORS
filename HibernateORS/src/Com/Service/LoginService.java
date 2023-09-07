package Com.Service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Com.DTO.LoginDTO;

public class LoginService {
	public void add(LoginDTO loginDTO) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(loginDTO);
		transaction.commit();
		session.close();

	}

	public LoginDTO authenticate(LoginDTO loginDTO) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query q = session.createQuery(" from LoginDTO where  UserName = ? and Password = ? ");

		q.setString(0, loginDTO.getUserName());
		q.setString(1, loginDTO.getPassword());

		List list = q.list();

		if (list.size() == 1) {
			System.out.println("password is valid");
			loginDTO = (LoginDTO) list.get(0);

		} else {
			System.out.println("Invalid user id");
			loginDTO = null;
		}
		return loginDTO;

	}

}
