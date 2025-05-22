package org.example.parking;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class EstacionamientoTest {

    private Estacionamiento estacionamiento;
    private Vehiculo vehiculo;
    private Cliente cliente;



    @Before
    public void setup(){
        estacionamiento=new Estacionamiento();
        vehiculo=new Vehiculo("Ad546","Gold trend", Vehiculo.Tipo.AUTO);
        cliente=new Cliente("354789","Maria Paz");
        estacionamiento.ingresarVehiculo(cliente.getDni(),cliente.getNombre(),vehiculo);
    }

    @Test
    public void testRetirarVehiculo() throws Exception {

        Ticket ticket=estacionamiento.retirarVehiculo("Ad546");

        assertEquals(ticket.getVehiculo().getPatente(),vehiculo.getPatente());
    }



    @Test
    public void testCalcularPrecio() throws Exception {

        // TODO test
    }

}