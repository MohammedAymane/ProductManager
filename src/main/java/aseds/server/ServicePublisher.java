package aseds.server;

import aseds.webservices.ProductsManagerImpl;
import aseds.webservices.ProductsManager;
import javax.xml.ws.Endpoint;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class ServicePublisher {
  
	
	private static Logger logger = LoggerFactory.getLogger(ServicePublisher.class);
	 
	public static void main(String[] args) {
		logger.info("D�marrage du serveur");
		
		Endpoint.publish("http://localhost:3000/webservices/ProductsManager", new ProductsManagerImpl());
	
		logger.info("Serveur d�marr�");
	
	}
	
}
