package Controlador;

import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmFactura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public abstract class CtrlProducto implements ActionListener{
    
    private Producto mod;
    private ConsultasProducto modC;
    private frmFactura frm;
    
    public CtrlProducto(Producto mod, ConsultasProducto modC, frmFactura frm)
    {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
    }
    
    public void iniciar()
    {
        frm.setTitle("Productos");
        frm.setLocation(null);
        frm.txtBuscar.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==frm.btnGuardar)
        {
//            mod.setId(frm.txtIdFactura.getText());
//            mod.setNombre(frm.txtNumeroFactura.getText());
//            mod.setId(frm.dateFecha.getText());
//            mod.setId(frm.cmbTipoDePago.getText());
//            mod.setId(frm.txtDocumentoCliente.getText());
//            mod.setId(frm.txtNombreCliente.getText());
//            mod.setId(frm.txtSubtotal.getText());
//            mod.setId(frm.txtDescuento.getText());
//            mod.setId(frm.txtIVA.getText());
//            mod.setId(frm.txtTotalDescuento.getText());
//            mod.setId(frm.txtTotalImpuesto.getText());
//            mod.setId(frm.txtTotal.getText());
            
//            mod.setCodigo(frm.txtCodigo.getText());
//            mod.setNombre(frm.txtNombre.getText());
//            mod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
//            mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
            
            if(modC.registrar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
            
        }
        
        if(e.getSource()==frm.btnModificar)
        {
//            mod.setId(frm.txtIdFactura.getText());
//            mod.setNombre(frm.txtNumeroFactura.getText());
//            mod.setId(frm.dateFecha.getText());
//            mod.setId(frm.cmbTipoDePago.getText());
//            mod.setId(frm.txtDocumentoCliente.getText());
//            mod.setId(frm.txtNombreCliente.getText());
//            mod.setId(frm.txtSubtotal.getText());
//            mod.setId(frm.txtDescuento.getText());
//            mod.setId(frm.txtIVA.getText());
//            mod.setId(frm.txtTotalDescuento.getText());
//            mod.setId(frm.txtTotalImpuesto.getText());
//            mod.setId(frm.txtTotal.getText());
            
//            mod.setId(Integer.parseInt(frm.txtId.getText()));
//            mod.setCodigo(frm.txtCodigo.getText());
//            mod.setNombre(frm.txtNombre.getText());
//            mod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
//            mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
            
            if(modC.modificar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
            
        }
        
        if(e.getSource()==frm.btnEliminar)
        {
//            mod.setId(frm.txtIdFactura.getText());
//            mod.setNombre(frm.txtNumeroFactura.getText());
//            mod.setId(frm.dateFecha.getText());
//            mod.setId(frm.cmbTipoDePago.getText());
//            mod.setId(frm.txtDocumentoCliente.getText());
//            mod.setId(frm.txtNombreCliente.getText());
//            mod.setId(frm.txtSubtotal.getText());
//            mod.setId(frm.txtDescuento.getText());
//            mod.setId(frm.txtIVA.getText());
//            mod.setId(frm.txtTotalDescuento.getText());
//            mod.setId(frm.txtTotalImpuesto.getText());
//            mod.setId(frm.txtTotal.getText());
            
//            mod.setId(Integer.parseInt(frm.txtId.getText()));
            
            if(modC.eliminar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
            
        }
        
        if(e.getSource()==frm.btnBuscar)
        {
//            mod.setId(frm.txtIdFactura.getText());
//            mod.setNombre(frm.txtNumeroFactura.getText());
//            mod.setId(frm.dateFecha.getText());
//            mod.setId(frm.cmbTipoDePago.getText());
//            mod.setId(frm.txtDocumentoCliente.getText());
//            mod.setId(frm.txtNombreCliente.getText());
//            mod.setId(frm.txtSubtotal.getText());
//            mod.setId(frm.txtDescuento.getText());
//            mod.setId(frm.txtIVA.getText());
//            mod.setId(frm.txtTotalDescuento.getText());
//            mod.setId(frm.txtTotalImpuesto.getText());
//            mod.setId(frm.txtTotal.getText());
            
//            mod.setCodigo(frm.txtId.getText());
            
            if(modC.buscar(mod))
            {
//                frm.txtIdFactura.setText(String.valueOf(mod.getId()));
//                frm.txtCodigo.setText(mod.getCodigo());
//                frm.txtNombre.setText(mod.getNombre());
//                frm.txtPrecio.setText(String.valueOf(mod.getPrecio()));
//                frm.txtCanitdad.setText(String.valueOf(mod.getCantidad()));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se encontro registro");
            }
            
        }
        if(e.getSource()==frm.btnLimpiar)
        {
            limpiar();
        }
    }
    public void limpiar()
        {
            frm.txtIdFactura.setText(null);
            frm.txtNumeroFactura.setText(null);
            frm.dateFecha.setText(null);
            frm.cmbTipoDePago.setSelectedIndex(0);
            frm.txtDocumentoCliente.setText(null);
            frm.txtNombreCliente.setText(null);
            frm.txtSubtotal.setText(null);
            frm.txtDescuento.setText(null);
            frm.txtIVA.setText(null);
            frm.txtTotalDescuento.setText(null);
            frm.txtTotalImpuesto.setText(null);
            frm.txtTotal.setText(null);
            
        }
}
