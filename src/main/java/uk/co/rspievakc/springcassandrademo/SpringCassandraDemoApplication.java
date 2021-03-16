package uk.co.rspievakc.springcassandrademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication()
@EnableCassandraRepositories(
		basePackages = "uk.co.rspievakc.springcassandrademo.repository")
public class SpringCassandraDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCassandraDemoApplication.class, args);
	}

}
