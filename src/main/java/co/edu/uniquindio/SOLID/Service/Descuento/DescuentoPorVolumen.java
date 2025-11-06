package co.edu.uniquindio.SOLID.Service.Descuento;

import co.edu.uniquindio.SOLID.Model.Pedido;

public class DescuentoPorVolumen implements EstrategiaDescuento{

    private final String codigoDescuento;
    private final int cantidadMinima;
    private final double porcentaje;

    public DescuentoPorVolumen(String codigo, int cantidadMinima, double Porcentaje){
        this.codigoDescuento = codigo;
        this.cantidadMinima = cantidadMinima;
        this.porcentaje = Porcentaje;
    }

    @Override
    public double calcularDescuento(double subtotal, Pedido pedido){
        return subtotal * (this.porcentaje / 100.0);
    };

    @Override
    public String getCodigo(){
        return this.codigoDescuento;
    };

    @Override
    public boolean esAplicable(Pedido pedido){
        return pedido.getItems().size() > this.cantidadMinima;
    };
}
