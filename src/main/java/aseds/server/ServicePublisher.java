package aseds.server;


import javax.xml.ws.Endpoint;
import org.slf4j.LoggerFactory;
import aseds.webservices.ProductsManagerImpl;

public class ServicePublisher {
  
	
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(ServicePublisher.class);
	 
	public static void main(String[] args) {
		logger.info("Démarrage du serveur");
		
		Endpoint.publish("http://localhost:2020/webservices/ProductManager", new ProductsManagerImpl());
	
		logger.info("Serveur démarré");
	
	}
	
}
