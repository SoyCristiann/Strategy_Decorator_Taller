package co.edu.uniquindio.SOLID.Service.Descuento;

import co.edu.uniquindio.SOLID.Model.Pedido;

public interface EstrategiaDescuento {
    double calcularDescuento(double subtotal, Pedido pedido);
    String getCodigo();
    boolean esAplicable(Pedido pedido);
}
