package expertostech.dio.live.lombok.controller;

import expertostech.dio.live.lombok.model.PedidoModel;
import expertostech.dio.live.lombok.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.hibernate.id.GUIDGenerator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

// define que é um controller
@RestController

// caminho padrão
@RequestMapping("/api/pedido")

// adiciona todos os construtores
@AllArgsConstructor 
public class PedidoController {

    // declara o repositório do tipo 'final' porque essa instância não vai se modificar
    private final PedidoRepository repository;

    @GetMapping("/listarTodos")
    // retorna uma entidade, é do tipo list, vai vir um ClienteModel e o nome do método é listarTodos, o qual nunca pode ser usado em produção, usamos apenas em questão didática
    public ResponseEntity<List<PedidoModel>> listarTodos() {
        // retorna os dados do repository
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar")
    // necessário passar o @RequestBody
    public ResponseEntity<PedidoModel> salvar(@RequestBody @NonNull PedidoModel pedido) {

        // se o pedido for igual a nulo ou vazio vai adicionar o pedido
        if (pedido.getId() == null || pedido.getId().isEmpty()) {
            pedido.setId(UUID.randomUUID().toString());
        }

        // salva os dados do cliente
        return ResponseEntity.ok(repository.save(pedido));
    }

}
