//package br.com.cod3r.exerciciossb.model.repositories;
//
//import java.util.Optional;
//
//import org.springframework.data.repository.PagingAndSortingRepository;
////import org.springframework.data.repository.PagingAndSortingRepository;
//
//import br.com.cod3r.exerciciossb.model.entities.Produto;
//import jakarta.validation.Valid;
//
//public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
//
//	void save(@Valid Produto produto);
//
//	Iterable<Produto> findByNome();
//
//	Optional<Produto> findById(int id);
//
//	Iterable<Produto> findByNomeIterable(String parteNome);
//
//	void deleteById(int id);
//
//
//}

package br.com.cod3r.exerciciossb.model.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import jakarta.validation.Valid;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

    // O método save já vem herdado de CrudRepository/PagingAndSortingRepository,
    // não sendo necessário redeclará-lo aqui.
    
    // Removemos o método findByNome() sem parâmetros, pois não segue a 
    // convenção de consulta do Spring Data.

    // Alteramos o método de consulta para utilizar uma palavra-chave que
    // permita buscar produtos cujo nome contenha a string informada, ignorando
    // diferenças entre maiúsculas e minúsculas.
    List<Produto> findByNomeContainingIgnoreCase(String parteNome);
    
    // O método findById também já está disponível na interface base,
    // mas se desejar especificar a assinatura, use a classe Wrapper Integer.
    Optional<Produto> findById(Integer id);

	Produto save(@Valid Produto produto);

	void deleteById(Integer id);

    // O método deleteById também já é herdado, portanto não é necessário redeclará-lo.
}