package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Auto> listaAutos = new ArrayList<>();

        boolean continuar=true;


        while (continuar){


            System.out.println("""
                    Taller de Autos :)
                    Menu Disponible:
                    1->Agregar Auto
                    2->Mostrar todos los autos disponibles
                    3->Actualizar el kilometraje
                    4-> Ver si es antiguo
                    5->Necesita Mantenimiento
                    6->Salir
                    
                    """);
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1->{
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();


                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Año: ");
                    int anio = scanner.nextInt();
                    System.out.print("Kilometraje: ");
                    double kilometraje = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Estado (En reparación / Listo para entrega): ");
                    String estado = scanner.nextLine();
                    Auto nuevoAuto = new Auto(marca, modelo, anio, kilometraje, estado, placa);
                    listaAutos.add(nuevoAuto);
                    System.out.println("Auto agregado con éxito.");
                }
                case 2->{
                    if (listaAutos.isEmpty()) {
                        System.out.println("📋 No hay autos en el taller.");
                    } else {
                        System.out.println("Lista de autos en el taller:");
                        for (int i = 0; i < listaAutos.size(); i++) {
                            System.out.println("[" + (i + 1) + "] " + listaAutos.get(i).getMarca() + " " + listaAutos.get(i).getModelo() + " - " + listaAutos.get(i).getEstado());
                        }
                    }

                }
                case 3->{
                    System.out.print("Ingrese la placa del auto: ");
                    String placaActualizar = scanner.nextLine().toUpperCase();

                }
                case 4->{
                    System.out.print("Ingrese la placa del auto: ");
                    String placaAntiguo = scanner.nextLine().toUpperCase();
                    if (placaAntiguo != null) {
                        System.out.println(placaAntiguo.esAntiguo()"El auto es antiguo." : "El auto no es antiguo.");
                    } else {
                        System.out.println("Error: No se encontró un auto con esa placa.");
                    }
                    break;
                }
                case 5->{

                }
                case 6->{

                    continuar = false;
                    System.out.println("👋 Saliendo del programa...");
                    break;
                }
                default -> System.out.println("Opcion no disponible");;

            };
        };







    }
}