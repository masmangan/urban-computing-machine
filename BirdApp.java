import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A classe BirdApp é um sistema para processamento de dados de avistamento de aves.
 * 
 * O sistema utiliza dados selecionados do site Wiki Aves.
 * 
 * @author marco.mangan@pucrs.br
 */
public class BirdApp {

    /**
     * Realiza a leitura de um arquivo de dados sobre aves.
     * 
     * @param filePath o nome do arquivo de dados a ser lido
     * @param birds a lista de aves onde as aves lidas são adicionadas
     */
    public static void read(String filePath, ArrayList<Bird> birds) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");

                Bird bird = new Bird();
                bird.family = fields[0];
                bird.specie = fields[1];
                bird.commomName = fields[2];
                bird.height = Double.parseDouble(fields[3]);
                bird.year = Integer.parseInt(fields[4]);

                birds.add(bird);
            }
        } catch (Exception e) {
            System.err.println("Erro lendo arquivo de dados!");
            e.printStackTrace();
        }
    }

    /**
     * Obtém o caminho até o arquivo de dados e processa os dados.
     * 
     * @param args o nome do arquivo a ser lido.
     */
    public static void main(String[] args) {
        System.out.println("Birds!\n");

        if (args.length != 1) {
            System.out.println("Uso:\n\njava -jar birds.jar <nome do arquivo de dados>\n");
            return;
        }

        String filePath = args[0];
        System.out.println(filePath);

        ArrayList<Bird> birds = new ArrayList<Bird>();
        read(filePath, birds);

        for (Bird bird : birds) {
            System.out.println(bird);
        }

        System.out.println();
        
        ArrayList<Double> heights = new ArrayList<>();
        for (Bird bird : birds) {
            heights.add(bird.height);
        }
        System.out.printf("Menor altura: %.1f%n", Collections.min(heights));
        System.out.printf("Maior altura: %.1f%n", Collections.max(heights));
    }
}
