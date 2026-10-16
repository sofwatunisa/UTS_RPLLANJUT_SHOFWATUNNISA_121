package com.ormawa.uts_rpll_shofwatunnisa_121;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@SpringBootApplication
public class UtsRpllShofwatunnisa121Application {

	public static void main(String[] args) {
		SpringApplication.run(UtsRpllShofwatunnisa121Application.class, args);
	}

	// Mendaftarkan DataSource H2 secara eksplisit
	@Bean
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.setName("ormawa-db")
				.build();
	}

	// Mendaftarkan TransactionManager secara eksplisit untuk Camunda Engine
	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}