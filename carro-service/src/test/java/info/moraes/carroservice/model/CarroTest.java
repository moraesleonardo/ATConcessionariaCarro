package info.moraes.carroservice.model;

import org.junit.jupiter.api.Test; // Certifique-se de que esta importação esteja correta

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void testCarroGettersAndSetters() {
        // Testando Getters e Setters
        Carro carro = new Carro();
        carro.setId(1L);
        carro.setNome("Polo Sedan");
        BigDecimal preco = new BigDecimal("50000.00");
        carro.setPreco(preco);
        carro.setFabricante("Volkswagen");
        carro.setFabricanteId(123);

        assertEquals(1L, carro.getId());
        assertEquals("Polo Sedan", carro.getNome());
        assertEquals(preco, carro.getPreco());
        assertEquals("Volkswagen", carro.getFabricante());
        assertEquals(123, carro.getFabricanteId());
    }

    @Test
    void testCarroAllArgsConstructor() {
        // Testando Construtor com Todos os Argumentos
        Carro carro = new Carro(1L, "Polo Sedan", new BigDecimal("50000.00"), "Volkswagen", 123);
        assertEquals(1L, carro.getId());
        assertEquals("Polo Sedan", carro.getNome());
        assertEquals(new BigDecimal("50000.00"), carro.getPreco());
        assertEquals("Volkswagen", carro.getFabricante());
        assertEquals(123, carro.getFabricanteId());
    }

    @Test
    void testCarroNoArgsConstructor() {
        // Testando Construtor Padrão (Sem Argumentos)
        Carro carro = new Carro();
        assertEquals(0L, carro.getId()); // Valor padrão para long
        assertNull(carro.getNome()); // Espera-se null para strings
        assertNull(carro.getPreco()); // Espera-se null para BigDecimal
        assertNull(carro.getFabricante());
        assertEquals(0, carro.getFabricanteId()); // Valor padrão para int
    }

    @Test
    void testCarroBuilder() {
        // Testando o Padrão Builder
        Carro carro = Carro.builder()
                .id(1L)
                .nome("Polo Sedan")
                .preco(new BigDecimal("50000.00"))
                .fabricante("Volkswagen")
                .fabricanteId(123)
                .build();
        assertEquals(1L, carro.getId());
        assertEquals("Polo Sedan", carro.getNome());
        assertEquals(new BigDecimal("50000.00"), carro.getPreco());
        assertEquals("Volkswagen", carro.getFabricante());
        assertEquals(123, carro.getFabricanteId());
    }

    @Test
    void testCarroEqualsAndHashCode() {
        // Testando Métodos equals e hashCode (@Data). Determinar se dois objetos são iguais
        Carro carro1 = new Carro(1L, "Polo Sedan", new BigDecimal("50000.00"), "Volkswagen", 123);
        Carro carro2 = new Carro(1L, "Polo Sedan", new BigDecimal("50000.00"), "Volkswagen", 123);
        Carro carro3 = new Carro(2L, "Golf", new BigDecimal("60000.00"), "Volkswagen", 124);

        assertEquals(carro1, carro2); // Objetos iguais devem ser considerados iguais
        assertEquals(carro1.hashCode(), carro2.hashCode());

        assertNotEquals(carro1, carro3); // Objetos diferentes não devem ser iguais
        assertNotEquals(carro1.hashCode(), carro3.hashCode());
    }

    @Test
    void testCarroToString() {
        // Testando Método toString
        Carro carro = new Carro(1L, "Polo Sedan", new BigDecimal("50000.00"), "Volkswagen", 123);
        String expected = "Carro(id=1, nome=Polo Sedan, preco=50000.00, fabricante=Volkswagen, fabricanteId=123)";
        assertEquals(expected, carro.toString());
    }
}
