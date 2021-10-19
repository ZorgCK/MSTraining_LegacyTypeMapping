package one.microstream.domain;

public class Author
{
	private String	mail_2;
	private String	mail_3;
	private String	mail_4;
	private String	mail_5;
	private String	mail_6;
	private String	firstname;
	private String	name;
	
	public Author(String mail_6, String firstname, String name)
	{
		super();
		this.mail_6 = mail_6;
		this.firstname = firstname;
		this.name = name;
	}
	
	public String getMail_2()
	{
		return mail_2;
	}
	
	public void setMail_2(String mail_2)
	{
		this.mail_2 = mail_2;
	}
	
	public String getMail_3()
	{
		return mail_3;
	}
	
	public void setMail_3(String mail_3)
	{
		this.mail_3 = mail_3;
	}
	
	public String getMail_4()
	{
		return mail_4;
	}
	
	public void setMail_4(String mail_4)
	{
		this.mail_4 = mail_4;
	}
	
	public String getMail_5()
	{
		return mail_5;
	}
	
	public void setMail_5(String mail_5)
	{
		this.mail_5 = mail_5;
	}
	
	public String getMail_6()
	{
		return mail_6;
	}
	
	public void setMail_6(String mail_6)
	{
		this.mail_6 = mail_6;
	}
	
	public String getFirstname()
	{
		return firstname;
	}
	
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
}
