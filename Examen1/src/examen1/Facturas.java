if (montoFactura>=50000 || ProductosElectricos>=1 ||ProductosAutomotrices>=1 || ProductosConstruccion>=1) puntos += 1; 
        if (ProductosElectricos>=3) puntos += 1;
        if (ProductosAutomotrices>4) puntos += 1;
        if (ProductosConstruccion>1) puntos += 2;
        if (montoFactura >50000) puntos += 1;
        return puntos;
    
    
    
    

