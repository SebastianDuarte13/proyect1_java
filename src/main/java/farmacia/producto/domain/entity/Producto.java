package farmacia.producto.domain.entity;

import java.sql.Date;

public class Producto {
    private int Codigo_producto;
    private String nombre_producto;
    private String registro_invima_producto;
    private String via_administracion;
    private String principio_activo;
    private String unidad_medida;
    private String laboratorio;
    private String presentación;
    private Date fecha_caducidad;
    private int stock;
    private int stock_min;
    private int stock_maximo;
    private int valor_venta;
    private int proveedor_id;
    public Producto(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }
    public int getCodigo_producto() {
        return Codigo_producto;
    }
    public void setCodigo_producto(int codigo_producto) {
        Codigo_producto = codigo_producto;
    }
    public String getNombre_producto() {
        return nombre_producto;
    }
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    public String getRegistro_invima_producto() {
        return registro_invima_producto;
    }
    public void setRegistro_invima_producto(String registro_invima_producto) {
        this.registro_invima_producto = registro_invima_producto;
    }
    public String getVia_administracion() {
        return via_administracion;
    }
    public void setVia_administracion(String via_administracion) {
        this.via_administracion = via_administracion;
    }
    public String getPrincipio_activo() {
        return principio_activo;
    }
    public void setPrincipio_activo(String principio_activo) {
        this.principio_activo = principio_activo;
    }
    public String getUnidad_medida() {
        return unidad_medida;
    }
    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }
    public String getLaboratorio() {
        return laboratorio;
    }
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
    public String getPresentación() {
        return presentación;
    }
    public void setPresentación(String presentación) {
        this.presentación = presentación;
    }
    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }
    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock_min() {
        return stock_min;
    }
    public void setStock_min(int stock_min) {
        this.stock_min = stock_min;
    }
    public int getStock_maximo() {
        return stock_maximo;
    }
    public void setStock_maximo(int stock_maximo) {
        this.stock_maximo = stock_maximo;
    }
    public int getValor_venta() {
        return valor_venta;
    }
    public void setValor_venta(int valor_venta) {
        this.valor_venta = valor_venta;
    }
    public int getProveedor_id() {
        return proveedor_id;
    }
    public void setProveedor_id(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }
   

    

}
