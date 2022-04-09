package br.log.limbo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories(basePackages = "br.log.limbo.domain.repository")
public class LimboConfiguration extends AbstractJdbcConfiguration {
}
