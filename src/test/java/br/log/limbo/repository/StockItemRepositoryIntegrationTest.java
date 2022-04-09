package br.log.limbo.repository;

import br.log.limbo.LimboConfiguration;
import br.log.limbo.domain.repository.StockItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Integration tests for {@link StockItemRepository}.
 *
 * @author Sergio M C Figueiredo
 */
@JdbcTest
@ContextConfiguration(classes = {LimboConfiguration.class})
@Sql("/sql/insert_data.sql")
class StockItemRepositoryIntegrationTest {

        @Autowired
        private StockItemRepository repository;

        @Test
        void findAllCustomers() {
            assertThat(this.repository.findAll()).hasSize(2);
        }

        @Test
        void findByNameWithMatch() {
            assertThat(this.repository.findByNome("LED")).isPresent();
        }

        @Test
        void findByNameWithNoMatch() {
            assertThat(this.repository.findByNome("CHIP")).isEmpty();
        }

}