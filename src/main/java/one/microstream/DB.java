package one.microstream;

import java.net.URL;
import java.util.Optional;

import io.micronaut.core.io.ResourceResolver;
import io.micronaut.core.io.scan.ClassPathResourceLoader;
import one.microstream.persistence.internal.InquiringLegacyTypeMappingResultor;
import one.microstream.persistence.types.PersistenceLegacyTypeMappingResultor;
import one.microstream.storage.embedded.configuration.types.EmbeddedStorageConfiguration;
import one.microstream.storage.embedded.types.EmbeddedStorageFoundation;
import one.microstream.storage.embedded.types.EmbeddedStorageManager;


public class DB
{
	public static EmbeddedStorageManager	storageManager;
	public final static DataRoot			root	= new DataRoot();
	
	static
	{
		ClassPathResourceLoader loader = new ResourceResolver().getLoader(ClassPathResourceLoader.class).get();
		Optional<URL> resource = loader.getResource("microstream.xml");
		
		EmbeddedStorageFoundation<?> foundation = EmbeddedStorageConfiguration.load(
			resource.get().getPath()).createEmbeddedStorageFoundation();
		
		foundation.getConnectionFoundation().setLegacyTypeMappingResultor(
			InquiringLegacyTypeMappingResultor.New(
				PersistenceLegacyTypeMappingResultor.New()));
		
		storageManager = foundation.createEmbeddedStorageManager(root).start();
	}
}
