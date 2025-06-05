package fr.mdbs.esportsclash.player.infrastructure.persistence.jpa;

import fr.mdbs.esportsclash.player.application.ports.PlayerRepository;
import fr.mdbs.esportsclash.player.domain.model.Player;

public class SQLPlayerRepository implements PlayerRepository {
    private final SQLPlayerDataAccessor dataAccessor;

    public SQLPlayerRepository(SQLPlayerDataAccessor dataAccessor) {
        this.dataAccessor = dataAccessor;
    }

    @Override
    public Player findById(String id) {
        return dataAccessor.findById(id).get();
    }

    @Override
    public void save(Player player) {
        dataAccessor.save(player);
    }
}
