package aseds.server;


import javax.xml.ws.Endpoint;
import org.slf4j.LoggerFactory;
import aseds.webservices.ProductsManagerImpl;
import org.slf4j.Logger;

public class ServicePublisher {
  
	
	private static Logger logger = LoggerFactory.getLogger(ServicePublisher.class);
	 
	public static void main(String[] args) {
		logger.info("Démarrage du serveur");
		
		Endpoint.publish("http://localhost:2020/webservices/ProductManager", new ProductsManagerImpl());
	
		logger.info("Serveur démarré");
	
	}
	
}
