package one.microstream.controller;

import java.util.List;

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
		Author author = new Author("c.link@example.com", "Charlotte", "Link");
		
		DB.root.getAuthors().clear();
		DB.root.getAuthors().add(author);
		DB.storageManager.store(DB.root.getAuthors());
		
		return HttpResponse.ok("Author successfully created!");
	}
		
	@Get
	public List<Author> getAuthors()
	{
		return DB.root.getAuthors();
	}
}
