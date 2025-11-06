package co.edu.uniquindio.SOLID.Service.Observer;

import co.edu.uniquindio.SOLID.Model.Pedido;

public class NotificadorCliente implements ObservadorPedido{

    @Override
    public void actualizar(Pedido pedido) {
        System.out.println("Notificando al cliente: el pedido cambió a " + pedido.getEstado());
    }
}
