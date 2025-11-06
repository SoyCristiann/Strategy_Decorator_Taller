package co.edu.uniquindio.SOLID.Service.Descuento;

import co.edu.uniquindio.SOLID.Model.Pedido;

public class DescuentoCantidadFija implements EstrategiaDescuento{
    private final String codigoDescuento;
    private final double cantidadfija;

    public DescuentoCantidadFija(String codigo, double cantidadFija){
        this.codigoDescuento = codigo;
        this.cantidadfija = cantidadFija;
    }

    @Override
    public double calcularDescuento(double subtotal, Pedido pedido){
        return Math.min(subtotal, this.cantidadfija);
    };

    @Override
    public String getCodigo(){
        return this.codigoDescuento;
    };

    @Override
    public boolean esAplicable(Pedido pedido){
        return true;
    };
}
