package co.edu.uniquindio.SOLID.Service.Descuento;

import co.edu.uniquindio.SOLID.Model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class GestorDescuento {
    private List<EstrategiaDescuento> estrategias;

    public GestorDescuento() {
        estrategias = new ArrayList<>();

        //Inicializar las estrategias - Los códigos y valores se toman del taller.
        EstrategiaDescuento descuentoPorcentaje= new DescuentoPorcentaje("DTO10", 10);
        EstrategiaDescuento descuentoCantidadFija= new DescuentoCantidadFija("DESC5000", 5000);
        EstrategiaDescuento descuentoPorVolumen= new DescuentoPorVolumen("VOL15", 5, 15);

        estrategias.add(descuentoPorcentaje);
        estrategias.add(descuentoCantidadFija);
        estrategias.add(descuentoPorVolumen);
    }

    //Metodo para buscar la estrategia de la lista y retornarla.
    public EstrategiaDescuento seleccionarEstrategia(String codigoDescuento){
        for(EstrategiaDescuento estrategia: estrategias){
            if(estrategia.getCodigo().equals(codigoDescuento)){
                return estrategia;
            }
        }
        return null;
    }

    //Metodo para aplicar los descuentos según una estrategia seleccionada. Los parámetros subtotal y pedido son necesarios para las estrategias.
    public double aplicaDescuento(double subtotal, Pedido pedido){

        //Primero identifica busca la estrategia dentro de la lista y la asigna.
        for(EstrategiaDescuento e: estrategias){
            if(e.getCodigo().equals(pedido.getCodigoDescuento())){
                if(e.esAplicable(pedido)){
                    return e.calcularDescuento(subtotal, pedido);
                }
            }
        }
        return 0;
    }
}
