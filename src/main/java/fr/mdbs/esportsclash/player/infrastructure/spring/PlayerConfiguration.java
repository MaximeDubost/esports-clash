package fr.mdbs.esportsclash.player.infrastructure.spring;

import fr.mdbs.esportsclash.player.infrastructure.persistence.jpa.SQLPlayerDataAccessor;
import fr.mdbs.esportsclash.player.infrastructure.persistence.jpa.SQLPlayerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfiguration {
    @Bean
    public SQLPlayerRepository playerRepository(SQLPlayerDataAccessor dataAccessor) {
        return new SQLPlayerRepository(dataAccessor);
    }
}
