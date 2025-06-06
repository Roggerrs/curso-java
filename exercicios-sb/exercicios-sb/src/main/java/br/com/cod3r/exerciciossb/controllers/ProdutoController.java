//package br.com.cod3r.exerciciossb.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.cod3r.exerciciossb.model.entities.Produto;
//import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
//import jakarta.validation.Valid;
//
//@RestController
//@RequestMapping("/api/produtos")
//public class ProdutoController {
//
//	@Autowired
//	private ProdutoRepository produtoRepository;
//
//	// @PostMapping
//	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
//	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
//
//	
//	
//
//	@GetMapping(path = "/nome/{parteNome}")
//	public Iterable<Produto> obterProdutosPorId(@PathVariable String  parteNome) {
//		return produtoRepository.findByNomeIterable(parteNome);
//	}
//
////	@PutMapping
////	public Produto alterarProduto(@Valid Produto produto) {
////		produtoRepository.save(produto);
////		return produto;
////	}
//
//	@DeleteMapping(path = "/{id}")
//	public void excluirProduto(@PathVariable int id) {
//		produtoRepository.deleteById(id);
//	}
//}

package br.com.cod3r.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto salvarProduto(@Valid @RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

   
    @GetMapping("/nome/{parteNome}")
    public List<Produto> buscarProdutoPorNome(@PathVariable String parteNome) {
       return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }

    @PutMapping
public Produto alterarProduto(@Valid Produto produto) {
	produtoRepository.save(produto);
	return produto;
}
    
    @DeleteMapping("/{id}")
    public void excluirProduto(@PathVariable Integer id) {
        produtoRepository.deleteById(id);
    }
}