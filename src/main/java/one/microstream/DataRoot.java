package one.microstream;

import java.util.ArrayList;
import java.util.List;

import one.microstream.domain.Author;


public class DataRoot
{
	private List<Author> authors = new ArrayList<Author>();
	
	public List<Author> getAuthors()
	{
		return authors;
	}
	
	public void setAuthors(List<Author> authors)
	{
		this.authors = authors;
	}
	
}
