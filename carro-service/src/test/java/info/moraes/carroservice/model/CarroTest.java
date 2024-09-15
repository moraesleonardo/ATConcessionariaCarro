package info.moraes.carroservice.model;

import org.junit.jupiter.api.Test; // Certifique-se de que esta importação esteja correta
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarroTest {

    @Test
    void testCarroId() {
        // Criando um objeto Carro com o ID 1
        Carro carro = new Carro();
        carro.setId(1L);

        // Verificando se o ID do carro está correto
        assertEquals(1L, carro.getId());
    }
}
