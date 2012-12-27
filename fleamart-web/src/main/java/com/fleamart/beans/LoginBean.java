package com.fleamart.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.fleamart.uporabnik.ws.IUporabnikService;
import com.fleamart.uporabnik.ws.UporabnikService;
import java.io.Serializable;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable
{
	private String username, pass, txt;
	private int idUser;

	public int getIdUser()
	{
		return idUser;
	}
	public void setIdUser(int idUser)
	{
		this.idUser = idUser;
	}
	public String getTxt()
	{
		return txt;
	}
	public void setTxt(String txt)
	{
		this.txt = txt;
	}
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
			IUporabnikService service = new UporabnikService()
					.getBasicHttpBindingIUporabnikService();
			idUser = service.loginCheck(username, pass);

			if (idUser == 0)
			{
				setIdUser(0);
				// ce uporabnik ni uspesno vpisan je idUser=0
				txt = "Napaèno uporabniško ime ali geslo, poskusite ponovno!";
				return "#";
			} else
			{
				setIdUser(idUser);
				// ce je uporabnik uspesno vpisan
				return "index?faces-redirect=true";
			}

		} catch (Exception e)
		{

			e.printStackTrace();

		}
		return "";
	}

}
