DROP DATABASE farmacia;

CREATE DATABASE IF NOT EXISTS farmacia;

USE farmacia;

CREATE TABLE tipo_identificacion (
  id INTEGER PRIMARY KEY,
  nom_tipo VARCHAR(50)
);

CREATE TABLE proveedor (
    id_proveedor INT PRIMARY KEY,
    nombre VARCHAR(100)
);

CREATE TABLE clientes (
  nro_identificacion INTEGER PRIMARY KEY,
  nombres VARCHAR(100),
  apellidos VARCHAR(100),
  edad INTEGER,
  fecha_nacimiento DATE,
  fecha_registro DATE,
  ciudad_radical VARCHAR(20),
  barrio VARCHAR(80),
  tipo_identificacion_id INTEGER,
  FOREIGN KEY (tipo_identificacion_id) REFERENCES tipo_identificacion(id)
);

CREATE TABLE productos (
    Codigo_producto INT PRIMARY KEY,
    nombre_producto VARCHAR(100),
    registro_invima_producto VARCHAR(100),
    via_administracion VARCHAR(100),
    principio_activo VARCHAR(100),
    unidad_medida VARCHAR(20),
    laboratorio VARCHAR(100),
    presentacion VARCHAR(100),
    fecha_caducidad DATE,
    stock INT,
    stock_min INT,
    stock_maximo INT,
    valor_venta INT,
    proveedor_id INT,  
    FOREIGN KEY (proveedor_id) REFERENCES proveedor(id_proveedor)
);

CREATE TABLE clienteproductos (
    Codigo_producto INT,
    nro_identificacion INT,
    PRIMARY KEY (Codigo_producto, nro_identificacion),
    FOREIGN KEY (nro_identificacion) REFERENCES clientes(nro_identificacion),
    FOREIGN KEY (Codigo_producto) REFERENCES productos(Codigo_producto)
);

