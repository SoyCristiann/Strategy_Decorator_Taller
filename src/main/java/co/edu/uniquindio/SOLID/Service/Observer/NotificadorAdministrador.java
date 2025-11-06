package co.edu.uniquindio.SOLID.Service.Observer;

import co.edu.uniquindio.SOLID.Model.Pedido;

public class NotificadorAdministrador implements ObservadorPedido {

    public void alertaNuevoPedido(){

    }

    @Override
    public void actualizar(Pedido pedido) {
        System.out.println("Notificando al Admin: el pedido cambió a " + pedido.getEstado());
    }
}
