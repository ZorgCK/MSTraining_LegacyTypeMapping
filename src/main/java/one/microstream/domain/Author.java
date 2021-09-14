package one.microstream.domain;

public class Author
{
	private String	mailAuthor;
	private String	firstname;
	private String	name;
	
	public Author(String mailAuthor, String firstname, String name)
	{
		super();
		this.mailAuthor = mailAuthor;
		this.firstname = firstname;
		this.name = name;
	}
	
	public String getMailAuthor()
	{
		return mailAuthor;
	}
	
	public void setMailAuthor(String mailAuthor)
	{
		this.mailAuthor = mailAuthor;
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
