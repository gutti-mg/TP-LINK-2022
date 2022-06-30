package ar.edu.utn.link.tpLink.producto.app;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;


@RepositoryRestResource(path="productos", excerptProjection = ProductoDTO.class)
@RequestMapping("/productos")
public interface RepoProducto extends PagingAndSortingRepository<Producto, Integer> {

	Optional<Producto> findByNombre(String nombre);
	Page<Producto> findAll(Pageable page);

}
