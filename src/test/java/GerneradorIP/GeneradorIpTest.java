package GerneradorIP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeneradorIpTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	GeneradorIp generador = new GeneradorIp();
	@Test
	void testGenerarNumero() {
	        int min = 0;
	        int max = 254;

	        for (int i = 0; i < 1000; i++) {
	            int numeroGenerado = generador.generarNumero(min, max);
	            assertTrue(numeroGenerado >= min && numeroGenerado <= max,
	                    "El número generado debe estar entre " + min + " y " + max);
	        }
	    }

	@Test
	void testGenerarIp() {
        String ipGenerada = generador.generarIp();
        assertFalse(ipGenerada.startsWith("0"), "La IP no debe empezar con 0");
        assertFalse(ipGenerada.endsWith("0"), "La IP no debe terminar con 0");
    }
	}
