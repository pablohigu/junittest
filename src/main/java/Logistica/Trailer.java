package Logistica;
import java.util.Random;
import java.util.Vector;

public class Trailer implements Transporte {
    private Vector<Paquete> paquetes;

    public Trailer() {
        this.paquetes = new Vector<>();
    }

    @Override
    public void incluirPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    @Override
    public float pesoTotal() {
        float totalPeso = 0;
        for (Paquete p : paquetes) {
            totalPeso += p.getPeso();
        }
        return totalPeso;
    }

    @Override
    public int recorrerDistancia() {
        Random random = new Random();
        return 270 + random.nextInt(31);
    }

    @Override
    public String toString() {
        return "Trailer{" +
                "paquetes=" + paquetes +
                '}';
    }
}

