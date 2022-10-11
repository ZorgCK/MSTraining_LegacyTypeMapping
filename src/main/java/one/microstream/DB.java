package one.microstream;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import io.micronaut.core.io.ResourceResolver;
import io.micronaut.core.io.scan.ClassPathResourceLoader;
import one.microstream.chars.XChars;
import one.microstream.exceptions.IORuntimeException;
import one.microstream.persistence.types.Persistence;
import one.microstream.storage.embedded.configuration.types.EmbeddedStorageConfiguration;
import one.microstream.storage.embedded.types.EmbeddedStorageManager;


public class DB
{
	public static EmbeddedStorageManager	storageManager;
	public final static DataRoot			root	= new DataRoot();
	
	static
	{
		final ClassPathResourceLoader loader = new ResourceResolver().getLoader(ClassPathResourceLoader.class).get();
		final Optional<URL> resource = loader.getResource("microstream.xml");
		
		storageManager = EmbeddedStorageConfiguration.load(
			resource.get().getPath()).createEmbeddedStorageFoundation().setRefactoringMappingProvider(
				Persistence.RefactoringMapping(provideMapping())).createEmbeddedStorageManager(
					root).start();
	}
	
	private static String provideMapping()
	{
		final ClassPathResourceLoader refactoringLoader =
			new ResourceResolver().getLoader(ClassPathResourceLoader.class).get();

		try(InputStream in = refactoringLoader.getResourceAsStream("refactoring.csv").get())
		{
			return XChars.readStringFromInputStream(in, StandardCharsets.UTF_8);
		}
		catch(final IOException e)
		{
			throw new IORuntimeException(e);
		}
	}
}
