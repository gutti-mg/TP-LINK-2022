package ar.edu.utn.link.tpLink.proveedor.app.copy;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="proveedor", excerptProjection = ProveedorDTO.class)
public interface RepoProveedor extends PagingAndSortingRepository<Proveedor, Integer> {
	Page<Proveedor> findAll(Pageable page);

}
