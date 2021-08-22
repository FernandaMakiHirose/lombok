package expertostech.dio.live.lombok.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

// precisa especificar o nome, caso contrário vai usar o nome da classe
@Entity(name = "PedidoItem")
@Data // adiciona @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor
public class PedidoItemModel {

    // mostra para o banco de dados que é um id
    @Id
    // cria um id novo toda vez que incluir cliente novo no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // muitos pedidos para um cliente
    @ManyToOne(cascade = CascadeType.ALL)
    private ProdutoModel produto;
    private BigDecimal valor;

}
