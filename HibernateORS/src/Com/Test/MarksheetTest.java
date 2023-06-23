package Com.Test;

import java.util.Iterator;
import java.util.List;

import Com.DTO.MarksheetDTO;
import Com.Service.MarksheetService;

public class MarksheetTest {

	/**
	 * @paparam args
	 */
	public static void main(String[] args) {
   /* MarksheetDTO marksheetDTO=new MarksheetDTO();
    marksheetDTO.setRollNo(111);
    marksheetDTO.setName("abhay");
    marksheetDTO.setPhy(500);
    marksheetDTO.setChe(51);
    marksheetDTO.setMaths(10);
    MarksheetService service=new MarksheetService();
    service.add(marksheetDTO);*/
    //service.delete(marksheetDTO);
    //service.update(marksheetDTO);
  /*  marksheetDTO=service.Get(marksheetDTO);
    System.out.println(marksheetDTO.getRollNo());
    System.out.println(marksheetDTO.getName());
    System.out.println(marksheetDTO.getPhy());
    System.out.println(marksheetDTO.getChe());
    System.out.println(marksheetDTO.getMaths());
*/	
MarksheetDTO marksheetDTO=new MarksheetDTO();
MarksheetService service=new MarksheetService();
marksheetDTO.setName("anurag");
List list=service.Get1(marksheetDTO);
Iterator iterator=list.iterator();
while(iterator.hasNext()){
	marksheetDTO=(MarksheetDTO)iterator.next();
System.out.println(marksheetDTO.getRollNo());
System.out.println(marksheetDTO.getName());
System.out.println(marksheetDTO.getPhy());
System.out.println(marksheetDTO.getChe());
System.out.println(marksheetDTO.getMaths());
	
	}
}
}