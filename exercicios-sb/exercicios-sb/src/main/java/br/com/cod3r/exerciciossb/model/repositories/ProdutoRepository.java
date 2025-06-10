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

    
    List<Produto> findByNomeContainingIgnoreCase(String parteNome);
    
  
    Optional<Produto> findById(Integer id);

	Produto save(@Valid Produto produto);

	void deleteById(Integer id);

   
}