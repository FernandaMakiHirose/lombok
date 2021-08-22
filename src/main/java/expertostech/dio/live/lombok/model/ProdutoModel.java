package expertostech.dio.live.lombok.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

// precisa especificar o nome, caso contrário vai usar o nome da classe
@Entity(name = "produto")
@Getter @Setter // adiciona getters e setters
public class ProdutoModel {

    // mostra para o banco de dados que é um id
    @Id
    // cria um id novo toda vez que incluir cliente novo no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;

    // é melhor do que usar double
    private BigDecimal valor;

}
