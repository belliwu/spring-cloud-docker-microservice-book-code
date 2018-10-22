package edume.microservicefeignconsumermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MicroserviceFeignConsumerMovieApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceFeignConsumerMovieApplication.class, args);
	}
}
