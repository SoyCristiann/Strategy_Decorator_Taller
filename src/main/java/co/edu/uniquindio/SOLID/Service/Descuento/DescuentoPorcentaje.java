package co.edu.uniquindio.SOLID.Service.Descuento;

import co.edu.uniquindio.SOLID.Model.Pedido;

public class DescuentoPorcentaje implements EstrategiaDescuento{
    private final String codigoDescuento;
    private final double porcentajeDescuento;


    public DescuentoPorcentaje(String codigo, double porcentaje) {
        this.codigoDescuento = codigo;
        this.porcentajeDescuento = porcentaje;
    }

    @Override
    public double calcularDescuento(double subtotal, Pedido pedido){
        return subtotal * (this.porcentajeDescuento/100.0);
    }

    /*
    * La instrucción del taller no decía que especificaba este metodo para este punto, pero se agrega para poder implementar la interfaz.
    * */
    @Override
    public String getCodigo(){
        return this.codigoDescuento;
    }

    @Override
    public boolean esAplicable(Pedido pedido){
        return true;
    }
}
