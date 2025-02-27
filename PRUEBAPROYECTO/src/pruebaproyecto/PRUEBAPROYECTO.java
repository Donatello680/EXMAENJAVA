/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author genes
 */
public class PRUEBAPROYECTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del vendedor:");
int totalFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de facturas:"));
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del vendedor:"));
        int codigoFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la factura:"));
        int montoFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de mes (1-12):"));
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal:");
        String respuestaVehiculo = JOptionPane.showInputDialog("¿El vendedor cuenta con vehículo propio? (si/no)");
        boolean tieneVehiculo = respuestaVehiculo.compareTo("si") == 0;
        int productosElectricos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos eléctricos:"));
        int productosAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos automotrices:"));
        int productosConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos de construcción:"));

        Facturas factura = new Facturas(nombre, cedula, codigoFactura, montoFactura, mes, productosElectricos, productosAutomotrices, productosConstruccion);
        int puntos = factura.calcularPuntosVendedor();
        double bono = factura.calcularBono();
        boolean logroBonoExtra = bono >= 20000;
  String bonoExtraMensaje;
        if (logroBonoExtra) {
            bonoExtraMensaje = "Sí";
        } else {
            bonoExtraMensaje = "No";
        }
        
        String vehiculoMensaje;
        if (tieneVehiculo) {
            vehiculoMensaje = "Sí";
        } else {
            vehiculoMensaje = "No";
        }

        JOptionPane.showMessageDialog(null, "Nombre del Vendedor: " + nombre +
                "\nCódigo Factura: " + codigoFactura +
                "\nMes: " + mes +
                "\nTotal Vendido en Facturas: " + totalFacturas +
                "\nTotal de Comisiones: " + bono +
                "\n¿Logró el Bono Extra?: " + bonoExtraMensaje +
                "\nPuntos Obtenidos: " + puntos +
                "\n¿Cuenta con Vehículo Propio?: " + vehiculoMensaje +
                "\nSucursal: " + sucursal);
    }
}

 
    
      