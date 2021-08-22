package expertostech.dio.live.lombok.controller;

import expertostech.dio.live.lombok.model.ClienteModel;
import expertostech.dio.live.lombok.model.ProdutoModel;
import expertostech.dio.live.lombok.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// define que é um controller
@RestController

// caminho padrão
@RequestMapping("/api/produto")

// adiciona todos os construtores
@AllArgsConstructor 
public class ProdutoController {

    // declara o repositório do tipo 'final' porque essa instância não vai se modificar
    private final ProdutoRepository repository;

    @GetMapping("/listarTodos")
    // retorna uma entidade, é do tipo list, vai vir um ClienteModel e o nome do método é listarTodos, o qual nunca pode ser usado em produção, usamos apenas em questão didática
    public ResponseEntity<List<ProdutoModel>> listarTodos() {
        // retorna os dados do repository
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar")
    // necessário passar o @RequestBody
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produto) {
        // salva os dados do cliente
        return ResponseEntity.ok(repository.save(produto));
    }

}
