package one.microstream.domain;

public class Author
{
	private String			mail;
	private String			firstname;
	private String			lastname;
	
	public Author(String mail, String firstname, String lastname)
	{
		super();
		this.mail = mail;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getMail()
	{
		return mail;
	}
	
	public void setMail(String mail)
	{
		this.mail = mail;
	}
	
	public String getFirstname()
	{
		return firstname;
	}
	
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	
	public String getLastname()
	{
		return lastname;
	}
	
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}	
}
