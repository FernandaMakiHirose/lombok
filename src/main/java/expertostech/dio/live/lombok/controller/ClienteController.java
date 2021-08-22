package expertostech.dio.live.lombok.controller;

import expertostech.dio.live.lombok.model.ClienteModel;
import expertostech.dio.live.lombok.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// define que é um controller
@RestController

// caminho padrão
@RequestMapping("/api/cliente")

// adiciona todos os construtores
@AllArgsConstructor 
public class ClienteController {

    // declara o repositório do tipo 'final' porque essa instância não vai se modificar
    private final ClienteRepository repository;

    @GetMapping("/listarTodos")
    // retorna uma entidade, é do tipo list, vai vir um ClienteModel e o nome do método é listarTodos, o qual nunca pode ser usado em produção, usamos apenas em questão didática
    public ResponseEntity<List<ClienteModel>> listarTodos() {
        // retorna os dados do repository
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar")
    // necessário passar o @RequestBody
    public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel cliente) {
        // salva os dados do cliente
        return ResponseEntity.ok(repository.save(cliente));
    }

}
