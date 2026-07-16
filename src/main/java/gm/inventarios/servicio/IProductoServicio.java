package gm.inventarios.servicio;

import java.util.List;

import gm.inventarios.modelo.Producto;

public interface IProductoServicio {
    List<Producto> listaProductos();
    Producto buscarProductoPorId(Integer idProducto);
    void guardarProducto(Producto producto);
    void eliminarProductoPorId(Integer idProducto);
}
