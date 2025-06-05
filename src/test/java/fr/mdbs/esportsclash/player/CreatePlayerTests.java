package fr.mdbs.esportsclash.player;

import fr.mdbs.esportsclash.player.application.usecases.CreatePlayerUseCase;
import fr.mdbs.esportsclash.player.domain.model.Player;
import fr.mdbs.esportsclash.player.infrastructure.persistence.ram.InMemoryPlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreatePlayerTests {

    @Test
    void shouldCreatePlayer() {
        var repository = new InMemoryPlayerRepository();
        var useCase = new CreatePlayerUseCase(repository);

        var result = useCase.execute("name");

        var expectedPlayer = new Player(result.getId(), "name");
        Player actualPlayer = repository.findById(expectedPlayer.getId());

        Assertions.assertEquals(expectedPlayer.getName(), actualPlayer.getName());
    }

}
