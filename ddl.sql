CREATE DATABASE IF NOT EXISTS farmacia;

USE farmacia;

CREATE TABLE tipo_identificacion (
  id INTEGER PRIMARY KEY,
  nom_tipo VARCHAR(50)
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