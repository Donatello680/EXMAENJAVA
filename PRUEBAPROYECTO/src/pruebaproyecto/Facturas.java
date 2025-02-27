/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaproyecto;

/**
 *
 * @author genes
 */
public class Facturas {
 private String NombreVendedor;
    private int Cedula;
    private int codigoFactura;
    private int montoFactura;
    private int mes;
    private int ProductosElectricos;
    private int ProductosAutomotrices;
    private int ProductosConstruccion;
    private int totalFacturas;
    private boolean tieneVehiculo;
    private static double totalFacturado = 0;

    public Facturas(String NombreVendedor, int Cedula, int codigoFactura, int montoFactura, int mes, int ProductosElectricos, int ProductosAutomotrices, int ProductosConstruccion) {
        this.NombreVendedor = NombreVendedor;
        this.Cedula = Cedula;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.ProductosElectricos = ProductosElectricos;
        this.ProductosAutomotrices = ProductosAutomotrices;
        this.ProductosConstruccion = ProductosConstruccion;
        
        totalFacturado += montoFactura;
        
    }

    public int calcularPuntosVendedor() {
        int puntos = 0;
        if (ProductosElectricos > 0 && ProductosAutomotrices > 0 && ProductosConstruccion > 0) {
            puntos += 3;
        } else {
            if (ProductosElectricos >= 3) puntos += 1;
            if (ProductosAutomotrices > 4) puntos += 1;
            if (ProductosConstruccion > 0) puntos += 2;
        }
        if (montoFactura > 50000) {
            puntos += 1;
        }
        return puntos;
    }

    public double calcularBono() {
        double bono = 0;
        if (ProductosElectricos > 0 && ProductosAutomotrices > 0 && ProductosConstruccion > 0) {
            bono = montoFactura * 0.10;
        } else {
            if (ProductosElectricos >= 3) bono += montoFactura * 0.04;
            else bono += montoFactura * 0.02;
            if (ProductosAutomotrices > 4) bono += montoFactura * 0.04;
            else bono += montoFactura * 0.02;
            if (ProductosConstruccion > 0) bono += montoFactura * 0.08;
        }
        if (montoFactura > 50000) {
            bono += montoFactura * 0.05;
        }
        if (totalFacturas > 3 || totalFacturado > 300000) {
            bono += 20000;
        }
        return bono;
    }
}
  

     