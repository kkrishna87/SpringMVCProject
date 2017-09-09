package krishna.imcs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

@Configuration
@Import(DBConfig.class)

public class AppConfig {
	
	@Bean
	public RestTemplate	getRT() {
		RestTemplate rt=new RestTemplate();
		return rt;
	}

}
