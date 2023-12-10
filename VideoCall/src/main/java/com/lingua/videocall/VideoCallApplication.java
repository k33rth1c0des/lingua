package com.lingua.videocall;

import com.lingua.videocall.user.User;
import com.lingua.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService service)
	{
		return args ->
		{
			service.register(User.builder()
					.username("k33rth1")
					.email("kv@gmail.com")
					.password("qwerty")
					.build());

			service.register(User.builder()
					.username("@d1")
					.email("adithya@gmail.com")
					.password("asdfgh")
					.build());

			service.register(User.builder()
					.username("nolan")
					.email("nolan@gmail.com")
					.password("notapalindrome")
					.build());
		};
	}

}
