package fr.mdbs.esportsclash.player;

import fr.mdbs.esportsclash.player.application.usecases.CreatePlayerCommand;
import fr.mdbs.esportsclash.player.application.usecases.CreatePlayerCommandHandler;
import fr.mdbs.esportsclash.player.domain.model.Player;
import fr.mdbs.esportsclash.player.infrastructure.persistence.ram.InMemoryPlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreatePlayerTests {

    @Test
    void shouldCreatePlayer() {
        var repository = new InMemoryPlayerRepository();
        var useCase = new CreatePlayerCommandHandler(repository);

        var command = new CreatePlayerCommand("name");
        var result = useCase.handle(command);

        var expectedPlayer = new Player(result.getId(), "name");
        Player actualPlayer = repository.findById(expectedPlayer.getId());

        Assertions.assertEquals(expectedPlayer.getName(), actualPlayer.getName());
    }

}
