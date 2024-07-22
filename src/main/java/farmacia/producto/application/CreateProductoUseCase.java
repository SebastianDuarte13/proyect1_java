package farmacia.producto.application;

import farmacia.producto.domain.entity.Producto;
import farmacia.producto.domain.service.ProductoService;

public class CreateProductoUseCase {
    private final ProductoService productoService;

    public CreateProductoUseCase(ProductoService productoService) {
        this.productoService = productoService;
    }

    public void execute(Producto producto) {
        productoService.createProducto(producto);
    }
}