package globaltekmvc;

import Controlador.CtrlProducto;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.frmFactura;

public class GlobaltekMVC {

    public static void main(String[] args) {
        Producto mod = new Producto();
        ConsultasProducto modC = new ConsultasProducto();
        frmFactura frm = new frmFactura();
        
        CtrlProducto ctrl = new CtrlProducto(mod, modC, frm) {};
        ctrl.iniciar();
        frm.setVisible(true);
        
    }
    
}
