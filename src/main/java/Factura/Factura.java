package Factura;
import java.util.Vector;

public class Factura {
    private Vector<Producto> productos;

    public Factura() {
        this.productos = new Vector<>();
    }

    public void meterProducto(Producto p) {
        this.productos.add(p);
    }

    public float totalFactura() {
        float total = 0;
        for (Producto p : productos) {
            total += p.precioTotal();
        }
        return total;
    }

    public float aplicarIva(float iva) {
        float total = totalFactura();
        return total + (total * iva / 100);
    }

    @Override
    public String toString() {
        return "Factura: " +
                "productos=" + productos +
                '}';
    }
}
