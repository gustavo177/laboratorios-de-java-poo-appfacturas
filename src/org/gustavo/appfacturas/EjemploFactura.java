package org.gustavo.appfacturas;

import org.gustavo.appfacturas.modelo.*;


import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("555-55");
        cliente.setNombre("Tavo");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;
//        String nombre;
//        float precio;
//        int cantidad;

        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n " + producto.getCodigo() + ": ");
//            nombre = s.nextLine();
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
//            precio = s.nextFloat();
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
//            cantidad = s.nextInt();

//            ItemFactura item = new ItemFactura(s.nextInt(),producto);
            factura.addItemFactura(new ItemFactura(s.nextInt(),producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}
