package clients;

import javax.xml.ws.spi.http.HttpHandler;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class GetClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestTemplate rt = new RestTemplate();
		UriComponentsBuilder uriBuilder = UriComponentsBuilder
				.fromHttpUrl("http://localhost:8081/spring-rest-1/")
				.path("emp");
		
		System.out.println("-------------------------------------");
		ResponseEntity<String> resp =rt.getForEntity(uriBuilder.toUriString(), String.class);
		System.out.println(resp.getBody());
		System.out.println("-------------------------------------");
		
		HttpHeaders hdr = new HttpHeaders();
		hdr.add("Accept", "application/xml");
		
		HttpEntity et = new HttpEntity(hdr);
		ResponseEntity<String> resp1 = rt.exchange("http://localhost:8081/spring-rest-1/emp", HttpMethod.GET,et, String.class);
		System.out.println(resp1.getBody());
		
	}

}