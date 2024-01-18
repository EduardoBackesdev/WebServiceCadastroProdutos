package com.example.CadastroProdutos.Controllers;
import com.example.CadastroProdutos.Models.Repositories.ProdutoRepository;
import com.example.CadastroProdutos.Models.Entitys.ProdutosCadastro;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping (path = "/api")
public class ProdutoCadastroController {

    @Autowired
    private ProdutoRepository ProdutoRepository;


    // Inserir Produto CRUD
    @PostMapping(path = "/cadastrar/produto")
   public @ResponseBody ProdutosCadastro inserirProduto (ProdutosCadastro produto){
        return  ProdutoRepository.save(produto);
   }

   // Listar produto por ID CRUD
   @GetMapping("/{id}")
   public Optional<ProdutosCadastro>listarProduto(@PathVariable int id){
        return ProdutoRepository.findById(id);
   }

   // Atualizar produto CRUD
   @PutMapping
   public ProdutosCadastro atualizarProduto(ProdutosCadastro produto){
     return ProdutoRepository.save(produto);
   }

   // Deletar produto CRUD
   @DeleteMapping ("/{id}")
   public void ProdutosCadastro(@PathVariable int id){
          ProdutoRepository.deleteById(id);
   }


    
}
