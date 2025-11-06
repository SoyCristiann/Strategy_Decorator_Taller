package co.edu.uniquindio.SOLID.Service.Observable;

import co.edu.uniquindio.SOLID.Service.Observer.ObservadorPedido;

public interface ObservablePedido {
    void addObserver(ObservadorPedido o);
    void deleteObserver(ObservadorPedido o);
    void notificarObservadores();

}
