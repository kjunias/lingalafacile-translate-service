package org.kjunias.lingalafacile.translateservice.translate;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
class LoadDatabase {
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(TranslationRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Translation("Lingala", "mbote")));
			log.info("Preloading " + repository.save(new Translation("Lingala", "kobina")));
		};
	}
}