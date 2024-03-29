import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class OpcVehiculo extends JFrame{
   public int opcion = 1;
   public JPanel OVPanel;
   public JTextField idVehiculo, placa, nombre, modelo, numeroSerie, marca;
   public OpcVehiculo(){
      this.setSize(720, 480);
      setLocationRelativeTo(null);
      setTitle(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      OVPanel = new JPanel();
      OVPanel.setLayout(null);
      this.getContentPane().add(OVPanel);
      switch(opcion){
         case 1:
            screenRegistrar();
         break;
      }
   }
   public void screenRegistrar(){
      setTitle("Registrar Vehiculo");
      idVehiculo = new JTextField();
      idVehiculo.setBounds(50, 60, 300, 30);
      OVPanel.add(idVehiculo);
      
      placa = new JTextField();
      placa.setBounds(50, 120, 300, 30);
      OVPanel.add(placa);
      
      nombre = new JTextField();
      nombre.setBounds(50, 180, 300, 30);
      OVPanel.add(nombre);
      
      modelo = new JTextField();
      modelo.setBounds(50, 240, 300, 30);
      OVPanel.add(modelo);
      
      numeroSerie = new JTextField();
      numeroSerie.setBounds(50, 300, 300, 30);
      OVPanel.add(numeroSerie);
      
      marca = new JTextField();
      marca.setBounds(50, 360, 300, 30);
      OVPanel.add(marca);
   }
}