package Factura;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    @Test
    public void testNuevo() {
        Producto p = new Producto("pan", 0.50f, 1);
        assertEquals("pan", p.getNombre());
        assertEquals(0.50f, p.getPrecio());
        assertEquals(1, p.getCantidad());
    }

    @Test
    public void testPrecioTotal() {
        Producto p = new Producto("leche", 1.20f, 3);
        assertEquals(3.60f, p.precioTotal(), 0.001);
    }
}

