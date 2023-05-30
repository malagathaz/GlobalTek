
package Modelo;

import java.util.Date;

public class Producto {
private int idFactura;
private int NumeroFactura;
private Date Fecha;
private String TipodePago;
private int DocumentoCliente;
private String NombreCliente;
private double Subtotal;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(int NumeroFactura) {
        this.NumeroFactura = NumeroFactura;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipodePago() {
        return TipodePago;
    }

    public void setTipodePago(String TipodePago) {
        this.TipodePago = TipodePago;
    }

    public int getDocumentoCliente() {
        return DocumentoCliente;
    }

    public void setDocumentoCliente(int DocumentoCliente) {
        this.DocumentoCliente = DocumentoCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotalDescuento() {
        return TotalDescuento;
    }

    public void setTotalDescuento(double TotalDescuento) {
        this.TotalDescuento = TotalDescuento;
    }

    public double getTotalImpuesto() {
        return TotalImpuesto;
    }

    public void setTotalImpuesto(double TotalImpuesto) {
        this.TotalImpuesto = TotalImpuesto;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
private int Descuento;
private double IVA;
private double TotalDescuento;
private double TotalImpuesto;
private double Total;
    
}
