package com.miempresa.gestiondeproductos.vista;

import com.miempresa.gestionproductos.controlador.ProductoController;
import com.miempresa.gestionproductos.modelo.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductoController controller = new ProductoController();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú de Productos ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio del producto: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.print("Ingrese un precio válido: ");
                        scanner.next();
                    }
                    double precio = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer
                    Producto producto = new Producto(nombre, precio);
                    if (controller.agregarProducto(producto)) {
                        System.out.println("Producto agregado.\n");
                    } else {
                        System.out.println("No se pudo agregar el producto.\n");
                    }
                    break;
                case 2:
                    System.out.println("Lista de productos:");
                    controller.obtenerProductos()
                            .forEach(p -> System.out.println(p.getNombre() + " - $" + p.getPrecio()));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Nombre a buscar: ");
                    String buscar = scanner.nextLine();
                    controller.buscarPorNombre(buscar)
                            .ifPresentOrElse(
                                    p -> System.out.println("Encontrado: " + p.getNombre() + " - $" + p.getPrecio()),
                                    () -> System.out.println("Producto no encontrado."));
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.\n");
            }
        } while (opcion != 0);

        scanner.close();
    }
}