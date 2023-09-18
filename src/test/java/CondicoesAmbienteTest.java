import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondicoesAmbienteTest {

    @BeforeEach
    void setUp(){
        CondicoesAmbiente.getInstance().setTemperaturaIdeal(21);
        CondicoesAmbiente.getInstance().setLuminosidadeIdeal(7000);
        CondicoesAmbiente.getInstance().setUmidadeIdeal(50);
    }

    @Test
    void deveRetornarTemperaturaIdeal(){
        assertEquals(21,CondicoesAmbiente.getInstance().getTemperaturaIdeal());
    }

    @Test
    void deveRetornarUmidadeIdeal(){
        assertEquals(50,CondicoesAmbiente.getInstance().getUmidadeIdeal());
    }

    @Test
    void deveRetornarLuminosidadeIdeal(){
        assertEquals(7000,CondicoesAmbiente.getInstance().getLuminosidadeIdeal());
    }

    @Test
    void deveRetornarComparacaoTemperaturaCorreta(){
        assertEquals(true,CondicoesAmbiente.getInstance().isTemperaturaOk(21));
    }

    @Test
    void deveRetornarComparacaoUmidadeCorreta(){
        assertEquals(true,CondicoesAmbiente.getInstance().isUmidadeOk(50));
    }

    @Test
    void deveRetornarComparacaoLuminosidadeCorreta(){
        assertEquals(true,CondicoesAmbiente.getInstance().isLuminosidadeOk(7000));
    }

    @Test
    void deveRetornarComparacaoTemperaturaIncorreta(){
        assertEquals(false,CondicoesAmbiente.getInstance().isTemperaturaOk(22));
    }

    @Test
    void deveRetornarComparacaoUmidadeIncorreta(){
        assertEquals(false,CondicoesAmbiente.getInstance().isUmidadeOk(51));
    }

    @Test
    void deveRetornarComparacaoLuminosidadeIncorreta(){
        assertEquals(false,CondicoesAmbiente.getInstance().isLuminosidadeOk(7001));
    }
}