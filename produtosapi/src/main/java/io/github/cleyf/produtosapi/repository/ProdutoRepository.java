package io.github.cleyf.produtosapi.repository;

import io.github.cleyf.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
