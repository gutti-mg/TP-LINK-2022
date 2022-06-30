package ar.edu.utn.link.tpLink.item.app;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemCarritoDTO {
		String getCantidad();
		Page<ItemCarrito> findById(Integer id,Pageable page);
		
}
