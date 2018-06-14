
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 * @author Alunos
 */
public class Filme {
    private String titulo, tituloOriginal, genero, diretor;
    private short anoLancamento;
    private double valorFaturamento, valorOrcamento;
    private long espectadores;
    private String classificacao;
    private double mediaPreco;
    private LocalDate dataLancamentoBrasil;
    private String idioma;
    
    public void setTitulo(String titulo){
        if(titulo.trim().equals("")){
            throw new
                IllegalArgumentException("O título não pode ser deixado em branco");
            }
            if(titulo.trim().length() < 2){
                throw new IllegalArgumentException("O titulo deve conter ao menos dois caracteres");
        }
            this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTituloOriginal(String tituloOriginal){
        if(titulo.trim().equals("")){
            throw new
                IllegalArgumentException("O titulo original não pode ser deixado em branco");
        }
        if(tituloOriginal.trim().length() < 2){
            throw new
                IllegalArgumentException("O titulo original deve conter no mínimo dois caracteres");
        }
        this.tituloOriginal = tituloOriginal;
    }
    public String getTituloOriginal(){
        return tituloOriginal;
    }
    public void setAnoLancamento(short anoLancamento){
            this.anoLancamento = anoLancamento;    
    }
    public short getAnoLancamento(){
        return anoLancamento;
    }
    public void setGenero(String genero){
        if(genero.trim().equals("")){
            throw new IllegalArgumentException("O gênero não pode ser deixado em branco");
        }
        if(tituloOriginal.trim().length() < 4 ){
            throw new IllegalArgumentException("O gênero não pode conter menos de 4 caracteres");
        }
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }
    public void setDiretor(String diretor){
        if(diretor.trim().equals("")){
            throw new IllegalArgumentException("O nome do diretor não pode ser em branco");
        }
        if(diretor.trim().length() < 3 ){
            throw new IllegalArgumentException("O nome do diretor deve conter ao menos 3 caracteres");
        }
        this.genero = genero;
    }
    public String getDiretor(){
        return diretor;
    }
    public void setValorFaturamento(double valorFaturamento){
        this.valorFaturamento = valorFaturamento;
    }
    public double getValorFaturamento(){
        return valorFaturamento;
    }
    public void setEspectadores(long espectadores){
        this.espectadores = espectadores;
    }
    public long getEspectadores(){
        return espectadores;
    }
    public void setClassificacao(String classificacao){
        if(classificacao.trim().equals("")){
            throw new IllegalArgumentException("A classificação precisa ser informada");
        }
            this.classificacao = classificacao;
    }
    public String getClassificacao(){
        return classificacao;
    }
    public void setValorOrcamento(double valorOrcamento){
        while(true){
            try{
                valorOrcamento = Double.parseDouble(JOptionPane
                        .showInputDialog("Informe o valor do orçamento"));
            }catch(Exception e){
                throw new IllegalArgumentException("Insira somente números");
            }
        this.valorOrcamento = valorOrcamento;
        }
    }
    public double getValorOrcamento(){
        return valorOrcamento;
    }
    public void setMediaPreco(double mediaPreco){
        this.mediaPreco = mediaPreco;
    }
    public double getMediaPreco(){
        return mediaPreco;
    }
    public void setDataLancamentoBrasil(LocalDate dataLancamentoBrasil){
        this.dataLancamentoBrasil = dataLancamentoBrasil;
    }
    public LocalDate getDataLancamentoBrasil(){
        return dataLancamentoBrasil;
    }
    public void setIdioma(String idioma){
        if(idioma.trim().equals("")){
            throw new IllegalArgumentException("O idioma deve ser informado");
        }
        if(idioma.trim().length ()< 2){
            throw new IllegalArgumentException("O idioma deve conter ao menos dois caracteres");
        }
        this.idioma = idioma;
    }
    public String getIdioma(){
        return idioma;
    }
}
