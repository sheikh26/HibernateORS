package Com.Service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import Com.DTO.MarksheetDTO;

public class MarksheetService {
public void add(MarksheetDTO marksheetDTO){
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session =sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	session.save(marksheetDTO);
	transaction.commit();
	session.close();
}
public void delete(MarksheetDTO marksheetDTO){
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(marksheetDTO);
	transaction.commit();
	session.close();
	
}
public void update(MarksheetDTO marksheetDTO){
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	session.update(marksheetDTO);
	transaction.commit();
	session.close();
	
}
public MarksheetDTO Get(MarksheetDTO marksheetDTO){
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	marksheetDTO=(MarksheetDTO) session.get(MarksheetDTO.class, marksheetDTO.getRollNo());
    System.out.println("Get");
    session.close();
    return marksheetDTO;
    }
public List getList(){
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	Criteria criteria =session.createCriteria(MarksheetDTO.class);
	List list=criteria.list();
	return list;
	
}

	/*public List Get1(MarksheetDTO marksheetDTO){
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	Criteria criteria=session.createCriteria(MarksheetDTO.class);
	criteria.add(Restrictions.like("Name",marksheetDTO.getName()+"%"));
	List list=criteria.list();
    System.out.println("Get");
    session.close();
	return list;
    
    }
*/
public List Get1(MarksheetDTO marksheetDTO){
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	Criteria criteria=session.createCriteria(MarksheetDTO.class);
	criteria.add(Restrictions.like("Name", marksheetDTO.getName()+"%"));
	List list=criteria.list();
	session.close();
	return list;
}










}
