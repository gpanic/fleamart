package com.fleamart.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import com.fleamart.beans.SessionBean;
import com.fleamart.obj.Seja;

@ManagedBean(name = "loginBean")
@RequestScoped
public class LoginBean
{
	String username, pass;

	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPass()
	{
		return pass;
	}
	public void setPass(String pass)
	{
		this.pass = pass;
	}

	public LoginBean()
	{
	}

	public String checkUser()
	{
		try
		{

			int idUser = 0;
			/*
			 * fleamart.LoginWebServiceService service = new
			 * Login.client.LoginWebServiceService();
			 * fleamart.client.LoginWebService port =
			 * service.getLoginWebServicePort();
			 * 
			 * idUser = port.LoginCheck(username, pass);
			 */
			if (idUser == 0)
			{
				// ce uporabnik ni uspesno vpisan je idUser=0
				Seja seja = new Seja(idUser);
				//seja.setIdUser(idUser);
				return "login";
			} else
			{
				// ce je uporabnik uspesno vpisan
				Seja seja = new Seja(idUser);
				return "index";
			}

		} catch (Exception e)
		{
			/*
			 * e.printStackTrace();
			 */
		}
		return "";
	}
	
	//prestavi v class za action listener metodo
	public void checkUserId(ActionEvent actionEvent){
		
	}
	

}
