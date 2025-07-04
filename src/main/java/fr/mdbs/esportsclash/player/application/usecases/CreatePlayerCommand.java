package fr.mdbs.esportsclash.player.application.usecases;

import an.awesome.pipelinr.Command;
import fr.mdbs.esportsclash.player.domain.viewmodel.IdResponse;

public class CreatePlayerCommand implements Command<IdResponse> {
    private String name;

    public CreatePlayerCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
