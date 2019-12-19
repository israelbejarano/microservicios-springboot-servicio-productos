// @autor: Israel Bejarano
package com.microservicios.springboot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.microservicios.springboot.app.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
