package ar.edu.utn.link.tpLink.item.app;

import org.springframework.data.domain.Pageable;


import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="itemcarrito", excerptProjection = ItemCarritoDTO.class)
public interface RepoItemCarrito extends PagingAndSortingRepository<ItemCarrito, Integer> {

	Page<ItemCarrito> findAll(Pageable page);

}
