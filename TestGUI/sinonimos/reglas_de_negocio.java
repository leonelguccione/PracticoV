package sinonimos;

import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class reglas_de_negocio {
    private diccionario diccsin = new diccionario();
    private DefaultTableModel ModeloSinonimos = new DefaultTableModel();
    private OptionPane optionPane = new DefaultOptionPane();
    public reglas_de_negocio() {
        super();
    }
    
    public void setOptionPane(OptionPane o) { this.optionPane = o; }
    public OptionPane getOptionPane() {return this.optionPane;}
    
    public diccionario getDiccionario()
    {
        return diccsin;
    }
    
    public void agregarsinonimo(String Clave, String textSinonimo) 
    {
        sinonimo sin = new sinonimo(Clave, textSinonimo);
        try
            {
                diccsin.agregar_sinonimo(sin);
                optionPane.showMessageDialog(null, "No Excepcion");
            } 
        catch (Exception e) 
            {
                optionPane.showMessageDialog(null, e.getMessage());
            }
    }
    
    public void eliminarsinonimo(String Clave, String textSinonimo) 
    {
        sinonimo sin = new sinonimo(Clave ,textSinonimo);
        try {
                diccsin.eliminar_sinonimo(sin);
                optionPane.showMessageDialog(null, "No Excepcion");
            } 
        catch (Exception e) 
            {
                optionPane.showMessageDialog(null, e.getMessage());
            }
    }
    
    public DefaultTableModel leosinonimo(String Clave) 
    {
        ModeloSinonimos.addColumn("Palabra");
        ModeloSinonimos.addColumn("Sinonimos");
        try {
        Iterator it =  diccsin.busqueda_sinonimo(Clave).iterator();
        while (it.hasNext())
            {
            Object[] renglon = new Object[2];
            sinonimo sinu = (sinonimo) it.next();
            renglon[0] = sinu.getPalabra_clave();
            renglon[1] = sinu.getSinonimo_clave();
            ModeloSinonimos.addRow(renglon);  
            }
        return ModeloSinonimos;    
        }
        catch (Exception e)
        {
            optionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    
}
