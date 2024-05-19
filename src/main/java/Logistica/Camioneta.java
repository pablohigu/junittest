package Logistica;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Camioneta implements Transporte {
    private List<Paquete> paquetes;

    public Camioneta() {
        this.paquetes = new ArrayList<>();
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
        return 70 + random.nextInt(31);
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "paquetes=" + paquetes +
                '}';
    }
}

