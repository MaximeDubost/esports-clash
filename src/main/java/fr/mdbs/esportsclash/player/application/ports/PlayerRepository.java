package fr.mdbs.esportsclash.player.application.ports;

import fr.mdbs.esportsclash.player.domain.model.Player;

public interface PlayerRepository {
    Player findById(String id);

    void save(Player player);
}
