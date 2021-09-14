package one.microstream.domain;

import one.microstream.reference.Lazy;


public class Author
{
	private String			mail;
	private String			firstname;
	private String			lastname;
	private Lazy<byte[]>	image;
	
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
	
	public Lazy<byte[]> getImage()
	{
		return image;
	}
	
	public void setImage(Lazy<byte[]> image)
	{
		this.image = image;
	}
	
}
