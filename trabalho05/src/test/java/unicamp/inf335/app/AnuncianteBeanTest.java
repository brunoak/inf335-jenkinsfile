package unicamp.inf335.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AnuncianteBeanTest {
    @Test
    @DisplayName("Testa o valor medio do anúncio com a lista vazia")
    void testValorMedioAnunciosListaVazia() {
        // Arrange (Organizar)
        AnuncianteBean anuncianteX = new AnuncianteBean();

        // Act (Agir)
        double resultado = anuncianteX.valorMedioAnuncios();
        // Assert (Verificar)
        assertEquals(0.0, resultado);
    }

    @Test
    @DisplayName("Testa o valor medio do anúncio com a lista com valor")
    void testValorMedioAnunciosListaComValor() {
        // Arrange (Organizar)
        ProdutoBean produto1 = new ProdutoBean("P01", "Produto 1", "desc1", 10.0, "SP");
        ProdutoBean produto2 = new ProdutoBean("P02", "Produto 2", "desc2", 30.0, "SP");
        AnuncioBean anuncio1 = new AnuncioBean(produto1, null, 0.0);
        AnuncioBean anuncio2 = new AnuncioBean(produto2, null, 0.0);
        AnuncianteBean anuncianteX = new AnuncianteBean();
        anuncianteX.addAnuncio(anuncio1);
        anuncianteX.addAnuncio(anuncio2);

        // Act (Agir)
        double resultado = anuncianteX.valorMedioAnuncios();
        // Assert (Verificar)
        assertEquals(20.0,resultado);

    }
}