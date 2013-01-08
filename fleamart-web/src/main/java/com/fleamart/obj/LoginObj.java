package com.fleamart.obj;

public class LoginObj
{
	String username, pass;
	private int idUser;

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

	public int getIdUser()
	{
		return idUser;
	}

	public void setIdUser(int idUser)
	{
		this.idUser = idUser;
	}
	
	public LoginObj(int idUser){
		super();
		this.idUser = idUser;
	}

}
