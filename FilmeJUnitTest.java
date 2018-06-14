import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
/**
 * @author Cidmar
 */
public class FilmeJUnitTest {
    @Test
    public void testeDefinirEObterTitulo(){
        Filme k = new Filme();
        k.setTitulo("K: Missing Kings");
        assertEquals("K: Missing Kings", k.getTitulo());
    }
    @Test
    public void testeDefinirEObterTituloOriginal(){
        Filme  pokemon = new Filme();
        
        pokemon.setTituloOriginal("Pocket Monsters");
        assertEquals("Pocket Monsters", pokemon.getTituloOriginal());
    }
    @Test
    public void testeDefinirEObterGenero(){
        Filme mrBean = new Filme();
        mrBean.setClassificacao("Comédia");
        assertEquals("Comédia", mrBean.getClassificacao());
    }
    @Test
    public void testeDefinirEObterAnoLancamento(){
        Filme aliceInWonderland = new Filme();
        aliceInWonderland.setAnoLancamento((short)2016);
        assertEquals(2016, aliceInWonderland.getAnoLancamento());
    }
    @Test
    public void testeDefinirEObterValorFaturamento(){
        Filme up = new Filme();
        up.setValorFaturamento(12585694);
        assertEquals(12585694, up.getValorFaturamento());
    }
    @Test
    public void testeDefinirEObterValorOrcamento(){
        Filme dragonBall = new Filme();
        dragonBall.setValorOrcamento(85000000);
        assertEquals(85000000, dragonBall.getValorOrcamento());
    }
    @Test
    public void testeDefinirEObterEspectadores(){
        Filme saw = new Filme();
        saw.setEspectadores(14685261l);
        assertEquals(14685261l, saw.getEspectadores());
    }
    @Test
    public void testeDefinirEObterClassificacao(){
        Filme garfield = new Filme();
        garfield.setClassificacao("L");
        assertEquals("L", garfield.getClassificacao());
    }
    @Test
    public void testeDefinirEObterMediaPreco(){
        Filme lotr = new Filme();
        lotr.setMediaPreco(36);
        assertEquals(36, lotr.getMediaPreco());
    }
    @Test
    public void testeDefinirEObterDataLancamentoBrasil(){
        Filme sao = new Filme();
        sao.setDataLancamentoBrasil(LocalDate.of(2016, 12, 19));
        assertEquals()
    }
}
