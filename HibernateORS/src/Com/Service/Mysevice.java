package Com.Service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.DTO.MarksheetDTO;

public class Mysevice {
public MarksheetDTO get(MarksheetDTO marksheetDTO2)
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s= sf.openSession();
	marksheetDTO2=(MarksheetDTO) s.get(MarksheetDTO.class, marksheetDTO2.getRollNo());
	s.close();
	return marksheetDTO2;
	
}
public List getlist()
{
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session s= sf.openSession();
	Criteria c=s.createCriteria(MarksheetDTO.class);
	List list=c.list();
	return list;
	
}
}
