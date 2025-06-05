package fr.mdbs.esportsclash.player.infrastructure.persistence.jpa;

import fr.mdbs.esportsclash.player.domain.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SQLPlayerDataAccessor extends JpaRepository<Player, String> {

}
