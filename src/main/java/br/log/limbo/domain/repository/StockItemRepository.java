package br.log.limbo.domain.repository;

import br.log.limbo.domain.model.StockItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    Optional<StockItem> findByNome(String nome);
}

