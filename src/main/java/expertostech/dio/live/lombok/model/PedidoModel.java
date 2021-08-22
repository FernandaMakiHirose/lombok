package expertostech.dio.live.lombok.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

// precisa especificar o nome, caso contrário vai usar o nome da classe
@Entity(name = "pedido")
@Data // adiciona @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor
public class PedidoModel {

    // mostra para o banco de dados que é um id
    @Id
    private String id;

    // muitos clientes para um produto
    @ManyToOne(cascade = CascadeType.ALL)
    private ClienteModel cliente;

    // um pedido para muitros clientes
    @OneToMany(cascade = CascadeType.ALL)
    private List<PedidoItemModel> itens;

}
