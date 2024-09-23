/**
 * A classe Bird representa os dados de um pássaro.
 * 
 * Cada pássaro é representado por cinco campos de dados.
 * Os dados foram escolhidos a partir de um catálogo de aves,
 * com uma consulta para proximidade no Sul do país.
 * 
 * @see https://www.wikiaves.com.br/especies.php?t=c&c=4314902&r=50&o=4
 * 
 * @author marco.mangan@pucrs.br
 */
public class Bird {

    /**
     * Nome da família da espécie.
     */
    String family;

    /**
     * Nome científico do pássaro.
     */
    String specie;

    /**
     * Nome comum do pássaro
     */
    String commomName;

    /**
     * Altura do pássaro em centímetros
     */
    double height;

    /**
     * Ano de registro próximo ao Sul do país.
     */
    int year;

    /**
     * Retorna um representação do pássaro em texto.
     * 
     * @return a representação dos dados do pássaro em formato de texto
     */
    @Override
    public String toString() {        
        return String.format("%13s %20s %18s %2.1f %4d", family, specie, commomName, height, year);
    }
}