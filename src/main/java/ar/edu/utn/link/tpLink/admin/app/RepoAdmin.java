package ar.edu.utn.link.tpLink.admin.app;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="admin", excerptProjection = AdminDTO.class)
public interface RepoAdmin extends PagingAndSortingRepository<Admin, Integer> {

	Page<Admin> findAll(Pageable page);

}
