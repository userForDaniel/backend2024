package com.example.demo.service;

import com.example.demo.entity.Producto;

import java.util.List;

public interface ProductoService {
    // Métodos CRUD estándar
    List<Producto> obtenerTodosLosProductos();
    Producto obtenerProductoPorId(Long id);
    Producto crearProducto(Producto producto);
    Producto actualizarProducto(Long id, Producto producto);
    void eliminarProducto(Long id);

    // Nuevo método de búsqueda por nombre (insensible a mayúsculas y minúsculas)
    List<Producto> buscarProductosPorNombre(String name);

}
