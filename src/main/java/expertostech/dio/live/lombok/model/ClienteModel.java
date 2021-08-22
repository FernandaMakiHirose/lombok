package expertostech.dio.live.lombok.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

// precisa especificar o nome, caso contrário vai usar o nome da classe
@Entity(name = "cliente") 
@Data // adiciona @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor
public class ClienteModel {

    // mostra para o banco de dados que é um id
    @Id
    // cria um id novo toda vez que incluir cliente novo no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // tamanho do tamanho do nome é 100 caracteres e não vai poder deixar de preencher o nome
    @Column(length = 100, nullable = false)
    private String nome;
    private String endereco;

    // muitos pedidos para um cliente
    @ManyToOne(cascade = CascadeType.ALL)
    private PedidoModel pedido;

}
