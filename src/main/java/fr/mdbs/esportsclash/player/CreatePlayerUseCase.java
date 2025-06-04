package fr.mdbs.esportsclash.player;

import java.util.UUID;

public class CreatePlayerUseCase {
    private final PlayerRepository repository;
    public CreatePlayerUseCase(PlayerRepository repository) {
        this.repository = repository;
    }

    String execute(String name) {
        var player = new Player(UUID.randomUUID().toString(), name);
        repository.save(player);
        return player.getId();
    }
}
