package fr.mdbs.esportsclash.core.infrastructure.spring;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Notification;
import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Pipelinr;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PipelineConfiguration {
    @Bean
    Pipeline pipeline(
        ObjectProvider<Command.Handler> commandHandler,
        ObjectProvider<Command.Middleware> middleware,
        ObjectProvider<Notification.Handler> notificationHandler
    ) {
        return new Pipelinr()
            .with(() -> commandHandler.orderedStream())
            .with(() -> middleware.orderedStream())
            .with(() -> notificationHandler.orderedStream());
    }
}
