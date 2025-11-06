package co.edu.uniquindio.SOLID.Service.Observer;

import co.edu.uniquindio.SOLID.Model.Pedido;

public class AuditoriaPedidos implements ObservadorPedido {

    public void registraLogCambios (){

    }

    @Override
    public void actualizar(Pedido pedido) {
        System.out.println("Notificando a la Auditoria de pedidos: el pedido cambió a " + pedido.getEstado());
    }
}
