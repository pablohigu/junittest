package Logistica;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TransporteTest {

    @Test
    public void testPesoTotal() {
        Camioneta camioneta = new Camioneta();
        Paquete paquete = new Paquete("Barcelona", 5.2f);
        camioneta.incluirPaquete(paquete);
        assertEquals(5.2f, camioneta.pesoTotal(), 0.001);
    }

    @Test
    public void testRecorrerDistancia() {
        Camioneta camioneta = new Camioneta();
        int distancia = camioneta.recorrerDistancia();
        assertTrue(distancia >= 70 && distancia <= 100);
    }
}

