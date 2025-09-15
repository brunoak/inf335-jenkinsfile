package unicamp.inf335.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnuncioBeanTest {
    @Test
    @DisplayName("Testa o calculo do valor do anúncio com 20% de desconto")
    void testGetValorComDesconto(){
        // Arrange (Organizar)
        ProdutoBean produtoX = new ProdutoBean("001", "Produto A", "Desc A", 100.0, "SP");
        AnuncioBean anuncioX = new AnuncioBean();
        anuncioX.setProduto(produtoX);
        anuncioX.setDesconto(0.2);

        // Act (Agir)
        double resultado = anuncioX.getValor();
        // Assert (Verificar)
        assertEquals(80.0, resultado);
    }
}