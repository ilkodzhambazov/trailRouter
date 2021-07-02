package com.example.demo;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class TrialRouter {
    
    public static void main(String[] args) {
    	SpringApplication.run(TrialRouter.class, args);
    }
 
   
    @Autowired
    private PayloadRepo repository;
    

    @PostMapping(value = "/", consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)    
    public ResponseEntity<String> routingTo(@RequestBody Payload p){ 
    	if(p.getType().equals("0")){  
    		return ResponseEntity.created(URI.create(String.format("/path/"))).body(p.getSignal());      		
      	}else if (p.getType().equals("1")) {
      		repository.save(p);	
      	}
      	
    	return null;
      	
    }   
}
