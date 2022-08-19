/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Equipo
 */
public class Estudiante {
    
    private String nombres; // aqui almaceno los nombres del estudiante
    private String Apellidos;
    private Double promedio;
    private Double valormatricula;
    public int cantidadSubsidiados=0;

    public Estudiante(String nombres, String apellidos, Double promedio, Double valormatricula) {
        this.nombres = nombres;
        this.Apellidos = apellidos;
        this.promedio = promedio;
        this.valormatricula = valormatricula;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Double getValormatricula() {
        return valormatricula;
    }

    public void setValormatricula(Double valormatricula) {
        this.valormatricula = valormatricula;
    }


    public  String dameDatos(){
        return "Nombres: " + this.nombres + " Apellidos: " + this.Apellidos + " promedio: " + this.promedio + " valor semestre: " + this.valormatricula;
    }

    public int getCantidadSubsidiados() {
        return cantidadSubsidiados;
    }

    public void darSubsidio(){
        Double temp;

        if (this.promedio>3 && this.promedio<=3.5){
            temp=(this.valormatricula*20)/100;
            this.valormatricula=this.valormatricula-temp;
            cantidadSubsidiados++;

        }else if (this.promedio>=3.6 && this.promedio<=3.9){
            temp=(this.valormatricula*40)/100;
            this.valormatricula=this.valormatricula-temp;
            cantidadSubsidiados++;

        }else if (this.promedio>=4.0 && this.promedio<=4.5){
            temp=(this.valormatricula*60)/100;
            this.valormatricula=this.valormatricula-temp;
            cantidadSubsidiados++;

        }else if (this.promedio>=4.6 && this.promedio<=5.0){
            temp=(this.valormatricula*80)/100;
            this.valormatricula=this.valormatricula-temp;
            cantidadSubsidiados++;

        }

    }
    
}
