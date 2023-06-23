package Com.Test;

import Com.DTO.LoginDTO;
import Com.Service.LoginService;

public class LoginTest {
	public static void main(String[] args) throws Exception{
    LoginDTO loginDTO =new LoginDTO();
    loginDTO.setUserName("ashik");
    loginDTO.setPassword("sheikh");
    LoginService ls=new LoginService();
    loginDTO=ls.authenticate(loginDTO);
    System.out.println(loginDTO);
	}

}
