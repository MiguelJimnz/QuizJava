package org.example;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;
    private String estado;//puede ser "En reparacion""Listo para entrega"
    private String placa;




//metodos





    public void mostrarDetalles(){

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Kilometraje: " + kilometraje + " km");
        System.out.println("Estado: " + estado);
        System.out.println("Placa"+placa);


    }
    public void  actualizarKilometraje( double nuevoKilometraje){
        if (nuevoKilometraje > this.kilometraje) {
            this.kilometraje = nuevoKilometraje;
        } else {
            System.out.println("El nuevo kilometraje no puede ser menor al actual.");
        }
    }
    public boolean esAntiguo(){
        int anioActual = 2025;
        return (anioActual - this.anio) > 15;
    }
    public boolean necesitaMantenimiento(){
        return this.kilometraje > 100000;
    }
    public double calcularConsumoCombustible(double distanciaRecorrida, double rendimientoVehiculo){
        if (rendimientoVehiculo <= 0) {
            System.out.println("Error: El rendimiento del vehículo debe ser mayor a 0.");
            return 0;
        }
        return distanciaRecorrida / rendimientoVehiculo;
    }
    public double combustibleRestante(double combustibleInicial, double distanciaRecorrida, double rendimientoVehiculo){


        double combustibleUsado = calcularConsumoCombustible(distanciaRecorrida, rendimientoVehiculo);
        return (combustibleInicial-combustibleUsado);
    }

    public Auto() {
    }

    public Auto(String marca, String modelo, int anio, double kilometraje, String estado, String placa) {

        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.placa=placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getPlaca() {
        return placa;
    }

}
