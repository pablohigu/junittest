package GerneradorIP;

import java.util.Random;

public class GeneradorIp {
	 private Random random;
	 
    public int generarNumero(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
    public String generarIp() {
        String ip = "";
        for (int i = 0; i < 4; i++) {
            ip += generarNumero(0, 255);
            if (i < 3) {
                ip +=".";
            }
        }
        return ip;
    }
}
