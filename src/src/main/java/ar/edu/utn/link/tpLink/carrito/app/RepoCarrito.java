package ar.edu.utn.link.tpLink.carrito.app;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;




@RepositoryRestResource(path="carrito", excerptProjection = CarritoDTO.class)
public interface RepoCarrito extends PagingAndSortingRepository<Carrito, Integer> {


	Page<Carrito> findAll(Pageable page);

}
