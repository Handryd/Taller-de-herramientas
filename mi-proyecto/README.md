# Gestión de Productos - FASE III

Este proyecto es una aplicación Java para la gestión de productos, estructurada en capas siguiendo buenas prácticas de arquitectura de software.

## Arquitectura

La aplicación está organizada en las siguientes capas:

```
+-------------------+
|   Capa de Cliente |
| (Navegador/Móvil) |
+---------+---------+
          | (HTTP/HTTPS)
          v
+---------+---------+
|   Capa de Presentación |
| (Servidor Web/API Gateway) |
|   - Manejo de Solicitudes |
|   - Autenticación/Autorización |
+---------+---------+
          | (Llamadas a Servicios)
          v
+---------+---------+
|   Capa de Lógica de Negocio |
| (Servicios/Controladores)   |
|   - Reglas de Negocio       |
|   - Procesamiento de Datos  |
+---------+---------+
          | (Consultas/Actualizaciones)
          v
+---------+---------+
|   Capa de Acceso a Datos    |
| (Repositorios)              |
|   - Interacción con DB      |
+---------+---------+
          |
          v
+-------------------+
|   Base de Datos   |
|   (PostgreSQL)    |
+-------------------+
```

## Estructura del Proyecto

- **modelo**: Clases de dominio (ej: `Producto`)
- **controlador**: Lógica de negocio y controladores (ej: `ProductoController`)
- **vista**: Punto de entrada y presentación (ej: `Main`)

## Instalación y Ejecución

1. Clona el repositorio:
   ```sh
   git clone https://github.com/usuario/mi-proyecto.git
   ```
2. Asegúrate de tener Java instalado.
3. Compila y ejecuta el proyecto desde la carpeta raíz:
   ```sh
   javac -d bin src/main/java/com/miempresa/gestionproductos/modelo/Producto.java src/main/java/com/miempresa/gestionproductos/controlador/ProductoController.java src/main/java/com/miempresa/gestionproductos/vista/Main.java
   java -cp bin com.miempresa.gestionproductos.vista.Main
   ```

## Organización en GitHub

- **Branches**:  
  - `main` o `master`: versión estable  
  - `develop`: desarrollo  
  - `feature/*`, `bugfix/*`, `release/beta`, `release/rc`: ramas para nuevas características, correcciones y versiones

- **Issues**:  
  Cada requerimiento, mejora o bug debe estar documentado como issue, con análisis y solución propuesta.

- **Milestones**:  
  - `beta`: para la versión beta  
  - `rc`: para la release candidate


## Licencia

Este proyecto está bajo la licencia MIT.

---

