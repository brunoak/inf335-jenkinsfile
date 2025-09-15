package unicamp.inf335.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoBeanTest {
    @Test
    @DisplayName("Testa o método compareTo quando o valor é menor que o outro produto")
    void testCompareToValorMenor(){
        //Organizar (Arrange)
        ProdutoBean produtoA = new ProdutoBean("001", "Produto A", "Desc A", 50.0, "SP");
        ProdutoBean produtoB = new ProdutoBean("002", "Produto B", "Desc B", 100.0, "SP");

        //Agir (Act)
        int resultado = produtoA.compareTo(produtoB);
        //Verificar (Assert)
        assertEquals(-1,resultado);
    }

    @Test
    @DisplayName("Testa o método compareTo quando o valor é maior que o outro produto")
    void testCompareToValorMaior(){
        //Organizar (Arrange)
        ProdutoBean produtoA = new ProdutoBean("001", "Produto A", "Desc A", 100.0, "SP");
        ProdutoBean produtoB = new ProdutoBean("002", "Produto B", "Desc B", 50.0, "SP");

        //Agir (Act)
        int resultado = produtoA.compareTo(produtoB);
        //Verificar (Assert)
        assertEquals(1,resultado);
    }

    @Test
    @DisplayName("Testa o método compareTo quando o valor é igual  ao outro produto")
    void testCompareToValorIgaul(){
        //Organizar (Arrange)
        ProdutoBean produtoA = new ProdutoBean("001", "Produto A", "Desc A", 100.0, "SP");
        ProdutoBean produtoB = new ProdutoBean("002", "Produto B", "Desc B", 100.0, "SP");

        //Agir (Act)
        int resultado = produtoA.compareTo(produtoB);
        //Verificar (Assert)
        assertEquals(0,resultado);
    }
}