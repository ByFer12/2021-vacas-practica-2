package src.tienda;

import src.clientes.VectorClientes;
import src.peliculas.VectorPelicula;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private VectorPelicula tablaPelicula= new VectorPelicula();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5) Ingreso de peliculas");
            System.out.println("6) Mostrar peliculas");
            System.out.println("7) Ordenar Peliculas Ascente");
            System.out.println("8) Ordenar Clientes Descendente");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }
            if(menu==5){
                //Ingresando peliculas
                tablaPelicula.agregarPelicula();
            }
            if(menu==6){
                //Mostramos las peliculas
                tablaPelicula.mostrarPelicula();
            }
            if(menu==7){
                 //mostrar clientes
                 System.out.println("Desordenado:");
                 tablaPelicula.mostrarPelicula();
                 System.out.println("\n\nOrdenado:");
                 tablaPelicula.ordenarPelicula(true);
                 tablaPelicula.mostrarPelicula();

            }
            if(menu==8){
                System.out.println("Desordenado:");
                tablaPelicula.mostrarPelicula();
                System.out.println("\n\nOrdenado:");
                tablaPelicula.ordenarPelicula(false);
                tablaPelicula.mostrarPelicula();
            }

        }

    }

    
}
