package com.example.demo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.*;
import org.springframework.hateoas.client.Traverson;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.hal.Jackson2HalModule;
import org.springframework.hateoas.mvc.TypeReferences;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.File;
import java.net.URI;
import java.util.*;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;
import static org.springframework.hateoas.MediaTypes.HAL_JSON;

/*
Note: have coker's 'pobs-data' app running then run this app 2nd

 */

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Autowired
	RestOperations restOperations;


	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

		 /*
			//RestTemplate restTemplate = new RestTemplate();
    	ResponseEntity<Resource<LocationUnitType>> responseEntity =
                restTemplate.exchange("http://localhost:8080/pobsdata/api/locationUnitTypes/2", HttpMethod.GET,
                null, new ParameterizedTypeReference<Resource<LocationUnitType>>() {}, Collections.emptyMap());
				if (responseEntity.getStatusCode() == HttpStatus.OK) {
					Resource<LocationUnitType> userResource = responseEntity.getBody();
					LocationUnitType locationUnitType = userResource.getContent();
					int z = 1;
				}

				// a different way to do the same thing
			LocationUnitType lut = restTemplate.getForObject("http://localhost:8080/pobsdata/api/locationUnitTypes/2", LocationUnitType.class);
			log.info(lut.toString());

              */
			  /*

		    // consume it and build the object
			ResponseEntity<Resource<Location>> responseEntity2 =
               restTemplate.exchange("http://localhost:8080/pobsdata/api/customers/15818321/lastLocation", HttpMethod.GET,
               null, new ParameterizedTypeReference<Resource<Location>>() {}, Collections.emptyMap());
			if (responseEntity2.getStatusCode() == HttpStatus.OK) {
				Resource<Location> userResource2 = responseEntity2.getBody();
				Location lastLocation = userResource2.getContent();
				int z = 1;
			}


			// or do it this way with 1 line of code !!!
			InstructHeader ih = restTemplate.getForObject("http://localhost:8080/pobsdata/api/instructHeaders/6", InstructHeader.class);





			List<InstructHeader> ihList = new ArrayList<InstructHeader>();
			for ( int i = 1; i < 8 ; i++ ) {
				String url = "http://localhost:8080/pobsdata/api/instructHeaders/" + i;
				InstructHeader inHdr = restTemplate.getForObject(url, InstructHeader.class);
				ihList.add(inHdr);
				log.info(ih.toString());
			}
			int x = 1;

           */
		 // -------------------
			//PagedResources<Customer> userResource2 = responseEntity2.getBody();
			//				userResource2.iterator().forEachRemaining(cust -> {
			//				            int x = 1;
			//				        });

		   // -----------------------------------------------------------
			 /*
			//RestTemplate rest = new RestTemplate() ;
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			mapper.registerModule(new Jackson2HalModule());
			MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		    //converter.setSupportedMediaTypes(MediaType.parseMediaTypes("application/hal+json"));
			//converter.setSupportedMediaTypes(MediaType.parseMediaTypes("application/x-spring-data-verbose+json"));
			converter.setSupportedMediaTypes(Arrays.asList(MediaTypes.HAL_JSON));
		    converter.setObjectMapper(mapper);
			RestTemplate rest = new RestTemplate(Arrays.asList(converter));

			//add the new converters to the restTemplate
			    //but make sure it is BEFORE the exististing converters
			   // List<HttpMessageConverter<?>> converters = rest.getMessageConverters();
			    //converters.add(0,converter);
			    //rest.setMessageConverters(converters);


			//ResponseEntity<Resource<Customer>> responseEntity2 =
			//		rest.exchange("http://localhost:8080/pobsdata/api/customers/15818321", HttpMethod.GET,
			//                null, new ParameterizedTypeReference<Resource<Customer>>() {}, Collections.emptyMap());



			ResponseEntity<Resource<Customer>> responseEntity22 =
								rest.exchange("http://localhost:8080/pobsdata/api/customers/15818321", HttpMethod.GET,
						                null, new ParameterizedTypeReference<Resource<Customer>>() {});

			if (responseEntity22.getStatusCode() == HttpStatus.OK) {
				Resource<Customer> userResource22 = responseEntity22.getBody();
				Customer c = userResource22.getContent();

    				//Resource<Customer> customer = mapper.readValue(customerAsJson, new TypeReference<Resource<Customer>>() {});
				//Resource<Customer> customer2 = mapper.readValue(userAsJson, new TypeReference<Resource<Customer>>() {});
				//Resource<Customer> customer3 = mapper.readValue("", new TypeReference<Resource<Customer>>() {});

				int z = 1;
			}

			//ParameterizedTypeReference<Resource<Customer>> resourceParameterizedTypeReference = new ParameterizedTypeReference<Resource<Customer>>() {};
			//Traverson traverson = new Traverson(new URI("http://localhost:8080/pobsdata/api/customers/15818321"), MediaTypes.HAL_JSON);
			//Resource<Customer> actual =  traverson.follow( "customer" ).toObject(resourceParameterizedTypeReference);
     				//Resource<Customer> actual =  traverson.follow( "customer" ).toObject(resourceParameterizedTypeReference);

            */

			//--------------------------------------------------------------------------
			/*
			ObjectMapper mapper = new ObjectMapper();  //builder.build();
			MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
			//Customer cus = new Customer();
			//mapper.writeValue(new File("target/cus.json"), cus);
			//String cusAsString = mapper.writeValueAsString(cus);

			messageConverter.setSupportedMediaTypes(MediaType.parseMediaTypes("application/hal+json")) ;
			messageConverter.setObjectMapper(mapper);

			ResponseEntity<Resource<Customer>> responseEntity3 =
					restTemplate.exchange("http://localhost:8080/pobsdata/api/customers/15818321", HttpMethod.GET,
							                null, new ParameterizedTypeReference<Resource<Customer>>() {});



			if (responseEntity3.getStatusCode() == HttpStatus.OK) {
				Resource<Customer> userResource3 = responseEntity3.getBody();
				//Resource<Customer> customer = mapper.readValue(cusAsString, new TypeReference<Resource<Customer>>() {});
				//Resource<Customer> customer2 = mapper.readValue(userAsJson, new TypeReference<Resource<Customer>>() {});
				//ParameterizedTypeReference<Resource<Customer>> resourceParameterizedTypeReference = new ParameterizedTypeReference<Resource<Customer>>() {};

				int port = 1;

				//int x = 1;
			} */

			  //------------------------
			/*
			ResponseEntity<Resources<Customer>> responseEntity =
			                restTemplate.exchange("http://localhost:8080/pobsdata/api/customers/15818321",
			                                HttpMethod.GET, null,
			                        new ParameterizedTypeReference<Resources<Customer>>() {},
			                        Collections.emptyMap());




			        if (responseEntity.getStatusCode() == HttpStatus.OK) {
			            Resources<Customer> questionsResource = responseEntity.getBody();
						//Resources<Resource<Customer>>    questionsResource = responseEntity.getBody();
			            Collection<Customer> questions = questionsResource.getContent();
						//Resources<Resource<Customer>> questions2 =  responseEntity.getBody();
						List<Link> myLinks = responseEntity.getBody().getLinks();
			            int x = 1;
			        }
			        */
			// -----------------

			// --------------

			//RestTemplate template = new RestTemplate();
			/////CustomerResource resource  =  template.getForEntity("http://localhost:8080/pobsdata/api/customers/15818321", Customer.class);
			//ResponseEntity resp =  template.getForEntity("http://localhost:8080/pobsdata/api/customers/15818321", Customer.class);
			//Customer customer = (Customer) resp.getBody();
			//Location loc = customer.getLastLocation();
			//int x = 1;

			// -------------------------------
			/*
			RestTemplate template = new RestTemplate();
			final ResponseEntity<List> entity = template.getForEntity(LinkUtils.findBeruf(), List.class);

			    if (entity.getStatusCode() == HttpStatus.OK ) {
			        final List<LinkedHashMap> body = entity.getBody();
			        for (final LinkedHashMap map : body) {
			            final LinkedHashMap idMap = (LinkedHashMap) map.get("_links");
			            //String id = remove(String.valueOf(idMap.get("self")), "href=");
			            //id = remove(id, "{");
			            //id = remove(id, "}");
			            //final String name = String.valueOf(map.get("name"));
			            //final Beruf beruf = new Beruf(id, name);
			            //berufListe.add(beruf);
			        }
			    }
                */

			//---------------------------------------
					//RestTemplate template = new RestTemplate();
					//CustomerResource[] resources =  template.getForEntity("http://localhost:8080/pobsdata/api/customers/15818321", CustomerResource[].class);

					//List<CustomerResource> berufResources = Arrays.asList(resources);
					//for(CustomerResource resource : berufResources) {
					//	Customer beruf = resource.getContent();
					//}


			  //----------------------------------
			/*
			String fooResourceUrl = "http://localhost:8080/pobsdata/api/customers/15818321";
			RestTemplate restTemplate2 = new RestTemplate();
			ResponseEntity<String> response1 = restTemplate2.getForEntity("http://localhost:8080/pobsdata/api/customers/15818321", String.class);
			ResponseEntity<Customer> response2 = restTemplate2.getForEntity("http://localhost:8080/pobsdata/api/customers/15818321", Customer.class);

			if (response1.getStatusCode() == HttpStatus.OK) {
				// now turn the string into object

				HttpHeaders httpHeaders = restTemplate2.headForHeaders(fooResourceUrl);
				int x  =1;
			} */

			// ----------------------------------------------------------------------------
			/*

			int port=1;
			String MY_URI = "http://localhost:8080/pobsdata/api/customers/15818321";

			URI uri = URI.create(String.format(MY_URI, port));
					RequestEntity<Void> request = RequestEntity.get(uri).accept(HAL_JSON).build();
					Resource<Object> rootLinks = restOperations.exchange(request, new TypeReferences.ResourceType<Object>() {}).getBody();


			Links links = new Links(rootLinks.getLinks());
			int x = 1;

			Link lastLocationLink = links.getLink("location").expand();
			request = RequestEntity.get(URI.create(lastLocationLink.getHref())).accept(HAL_JSON).build();
					Resources<Location> stores = restOperations.exchange(request, new TypeReferences.ResourcesType<Location>() {}).getBody();

			stores.getContent().forEach(location -> log.info("{} - {}", location.getLocationName(), location.getLocationId()));
			*/

		   // --------------------------------------------
			String CUSTOMER_URL = "http://localhost:8080/pobsdata/api/customers/15818321";
			String MY_AFFILIATE = "http://localhost:8080/pobsdata/api/customers/15818321/affiliate";
			String MY_LASTLOCATION = "http://localhost:8080/pobsdata/api/customers/15818321/lastLocation";
			int port = 1;


			Customer   customer = restTemplate.getForObject(CUSTOMER_URL, Customer.class);
			ParameterizedTypeReference<Resource<Customer>> resourceParameterizedTypeReference = new ParameterizedTypeReference<Resource<Customer>>() {};
			Traverson traverson = new Traverson(new URI("http://localhost:8080/pobsdata/api/customers/15818321"), MediaTypes.HAL_JSON);
			Resource<Customer> actual =  traverson.follow( "customer" ).toObject(resourceParameterizedTypeReference);
			List<Link> myList = actual.getLinks();

			for ( Link link : myList) {
				String href = link.getHref();
				if  ( href.equalsIgnoreCase(MY_LASTLOCATION)  ) {
					Location  loc = restTemplate.getForObject(MY_LASTLOCATION, Location.class);
					 int x = 1;
				} else if ( href.equalsIgnoreCase(MY_AFFILIATE)  ) {
					Affiliate aff = restTemplate.getForObject(MY_AFFILIATE, Affiliate.class);
					int x = 1;
				} else if ( href.equalsIgnoreCase(CUSTOMER_URL)  ) {
					Customer   cus = restTemplate.getForObject(CUSTOMER_URL, Customer.class);
					int x = 1;
				}
			}
			int x = 1;


		};

	}

	/*
	public class CustomerResource extends Resource<Customer> {

		public CustomerResource(Customer content, Link... links) {
			super(content, links);
		}
	}  */

}
