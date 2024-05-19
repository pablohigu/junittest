package Factura;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FacturaTest {

    @Test
    public void testTotalFactura() {
        Factura factura = new Factura();
        Producto p1 = new Producto("pan", 0.50f, 2);
        Producto p2 = new Producto("leche", 1.20f, 3);
        factura.meterProducto(p1);
        factura.meterProducto(p2);
        assertEquals(4.10f, factura.totalFactura(), 0.001);
    }

    @Test
    public void testAplicarIva() {
        Factura factura = new Factura();
        Producto p1 = new Producto("pan", 0.50f, 2);
        Producto p2 = new Producto("leche", 1.20f, 3);
        factura.meterProducto(p1);
        factura.meterProducto(p2);
        float totalConIva = factura.aplicarIva(21);
        assertEquals(4.961f, totalConIva, 0.001);
    }
}

