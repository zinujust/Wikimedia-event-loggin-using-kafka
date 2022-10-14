package app.zainal.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.zainal.springboot.config.WikimediaChangesProducer;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProducerApplication.class);
	}

	
	@Autowired
	private WikimediaChangesProducer producer;
	
	@Override
	public void run(String... args) throws Exception {

		producer.sendMessage();
		
	}

}
