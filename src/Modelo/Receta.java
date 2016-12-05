//Metodos geters y seters para enviar y recibir la informacion de Receta
package Modelo;

import java.sql.Date;


public class Receta {
  private int Folio;
  private Date Fecha;
  private int NoExpediente;
  private int ClaveMed;
  private int CantidadPres;
  private int CantidadSurtida;        

    public Receta(int Folio, Date Fecha, int NoExpediente, int ClaveMed, int CantidadPres, int CantidadSurtida) {
        this.Folio = Folio;
        this.Fecha = Fecha;
        this.NoExpediente = NoExpediente;
        this.ClaveMed = ClaveMed;
        this.CantidadPres = CantidadPres;
        this.CantidadSurtida = CantidadSurtida;
    }

    public Receta() {
    }

    public int getFolio() {
        return Folio;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getNoExpediente() {
        return NoExpediente;
    }

    public void setNoExpediente(int NoExpediente) {
        this.NoExpediente = NoExpediente;
    }

    public int getClaveMed() {
        return ClaveMed;
    }

    public void setClaveMed(int ClaveMed) {
        this.ClaveMed = ClaveMed;
    }

    public int getCantidadPres() {
        return CantidadPres;
    }

    public void setCantidadPres(int CantidadPres) {
        this.CantidadPres = CantidadPres;
    }

    public int getCantidadSurtida() {
        return CantidadSurtida;
    }

    public void setCantidadSurtida(int CantidadSurtida) {
        this.CantidadSurtida = CantidadSurtida;
    }
  
  
    
}
