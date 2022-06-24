package ar.edu.utn.link.tpLink.usuario.app;

import org.springframework.data.domain.Pageable;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="cliente", excerptProjection = UsuarioDTO.class)
public interface RepoUsuario extends PagingAndSortingRepository<Usuario, Integer> {

	Optional<Usuario> findByNombre(String nombre);
	Page<Usuario> findAll(Pageable page);

}
