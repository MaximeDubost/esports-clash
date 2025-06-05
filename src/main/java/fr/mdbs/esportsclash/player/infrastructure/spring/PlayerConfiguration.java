package fr.mdbs.esportsclash.player.infrastructure.spring;

import fr.mdbs.esportsclash.player.infrastructure.persistence.ram.InMemoryPlayerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfiguration {
    @Bean
    public InMemoryPlayerRepository playerRepository() {
        return new InMemoryPlayerRepository();
    }
}
