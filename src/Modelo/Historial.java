//Metodos geters y seters para enviar y recibir la informacion de Historial
package Modelo;

import java.sql.Date;


public class Historial {
    private int ClaveMed;
    private Date FechaMov;
    private int CantidadIO;
    private String Movimiento;
    private int Existencia;
    private int FolioReceta;
    private int IdHistorial;

    public Historial(int ClaveMed, Date FechaMov, int CantidadIO, String Movimiento, int Existencia, int FolioReceta, int IdHistorial) {
        this.ClaveMed = ClaveMed;
        this.FechaMov = FechaMov;
        this.CantidadIO = CantidadIO;
        this.Movimiento = Movimiento;
        this.Existencia = Existencia;
        this.FolioReceta = FolioReceta;
        this.IdHistorial = IdHistorial;
    }

    public Historial() {
    }

    public int getClaveMed() {
        return ClaveMed;
    }

    public void setClaveMed(int ClaveMed) {
        this.ClaveMed = ClaveMed;
    }

    public Date getFechaMov() {
        return FechaMov;
    }

    public void setFechaMov(Date FechaMov) {
        this.FechaMov = FechaMov;
    }

    public int getCantidadIO() {
        return CantidadIO;
    }

    public void setCantidadIO(int CantidadIO) {
        this.CantidadIO = CantidadIO;
    }

    public String getMovimiento() {
        return Movimiento;
    }

    public void setMovimiento(String Movimiento) {
        this.Movimiento = Movimiento;
    }

    public int getExistencia() {
        return Existencia;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }

    public int getFolioReceta() {
        return FolioReceta;
    }

    public void setFolioReceta(int FolioReceta) {
        this.FolioReceta = FolioReceta;
    }

    public int getIdHistorial() {
        return IdHistorial;
    }

    public void setIdHistorial(int IdHistorial) {
        this.IdHistorial = IdHistorial;
    }
    
   
            
}
