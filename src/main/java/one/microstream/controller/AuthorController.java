package one.microstream.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import one.microstream.DB;
import one.microstream.domain.Author;


@Controller("/authors")
public class AuthorController
{
	@Get("/create")
	public HttpResponse<String> createAuthors()
	{
		Author author = new Author("Charlotte", "Link", "c.link@example.com");
		
		DB.root.getAuthors().clear();
		DB.root.getAuthors().add(author);
		DB.storageManager.store(DB.root.getAuthors());
		
		return HttpResponse.ok("Author successfully created!");
	}
	
	@Get("/update")
	public HttpResponse<String> updateAuthor()
	{
		Optional<Author> findFirst = DB.root.getAuthors().stream().findFirst();
		
		if(findFirst.isPresent())
		{
			Author author = findFirst.get();
			
			author.setFirstname(author.getFirstname() + LocalDateTime.now());
			DB.storageManager.store(author);
		}
		
		return HttpResponse.ok("Author successfully updated!");
	}
	
	@Get
	public List<Author> getAuthors()
	{
		return DB.root.getAuthors();
	}
}
