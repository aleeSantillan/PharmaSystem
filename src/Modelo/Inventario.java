//Metodos geters y seters para enviar y recibir la informacion de Inventario
package Modelo;


import java.sql.Date;
import java.sql.Connection;
import java.util.Calendar;


public class Inventario extends Medicamento{
    private int IdInventario;
    private Date FechaReg;
    private int Existencia;  

    public Inventario() {
    }

    public Inventario(int IdInventario, Date FechaReg, Date FechaCad, String Lote, int Existencia) {
        this.IdInventario = IdInventario;
        this.FechaReg = FechaReg;
        this.Existencia = Existencia;
    }

    public int getIdInventario() {
        return IdInventario;
    }

    public void setIdInventario(int IdInventario) {
        this.IdInventario = IdInventario;
    }
    

    public Date getFechaReg() {
        return FechaReg;
    }

    public void setFechaReg(Date FechaReg) {
        this.FechaReg =FechaReg;
    }


    public int getExistencia() {
        return Existencia;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }
    
    
}

