//Metodos geters y seters para enviar y recibir la informacion de Medicamento
package Modelo;

import java.sql.Date;
import java.sql.Connection;
import java.util.Calendar;

/**
 *
 * @author Eduardo
 */
public class Medicamento {
    private int Clave;
    private String Nombre;
    private String NombreComer;
    private String FormaFarm;
    private String Dosis;
    private String Presentacion;
   

    public Medicamento(int Clave, String Nombre, String NombreComer, String FormaFarm, String Dosis, String Presentacion) {
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.NombreComer = NombreComer;
        this.FormaFarm = FormaFarm;
        this.Dosis = Dosis;
        this.Presentacion = Presentacion;

    }

    public Medicamento() {
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreComer() {
        return NombreComer;
    }

    public void setNombreComer(String NombreComer) {
        this.NombreComer = NombreComer;
    }

    public String getFormaFarm() {
        return FormaFarm;
    }

    public void setFormaFarm(String FormaFarm) {
        this.FormaFarm = FormaFarm;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
    }

    public String getPresentacion() {
        return Presentacion;
    }

    public void setPresentacion(String Presentacion) {
        this.Presentacion = Presentacion;
    }
    
}
