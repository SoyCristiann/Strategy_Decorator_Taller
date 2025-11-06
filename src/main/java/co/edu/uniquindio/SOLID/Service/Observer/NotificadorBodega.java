package co.edu.uniquindio.SOLID.Service.Observer;

import co.edu.uniquindio.SOLID.Model.Pedido;

public class NotificadorBodega implements ObservadorPedido {

    public void alertaPreparar(){

    }

    @Override
    public void actualizar(Pedido pedido) {
        System.out.println("Notificando a la Bodega: el pedido cambió a " + pedido.getEstado());
    }
}
