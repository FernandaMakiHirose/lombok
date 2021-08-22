package expertostech.dio.live.lombok.repository;

import expertostech.dio.live.lombok.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

// passa o tipo e o tipo da chave primária da tabela
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {
}
