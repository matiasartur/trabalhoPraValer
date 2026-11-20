package funcoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Hotel{
    private String nome;
    private List<Quarto> quartos; // guarda todos os objetos quartos

    //Construtor
    public Hotel(String nome){ //lembre-se de colocar os parâmetros para o construtor receber nome ~mariana
        this.nome = nome;
        this.quartos = new ArrayList<>();
    }
    public String getNome(){
        return this.nome;
    }

    public List<Quarto> getQuartos(){
        return this.quartos;
    }

    public void setNome(String novo){ //void porque set não retorna NADA! ~mari
        this.nome = novo;
    }

    public void cadastrarQuarto(Scanner scanner){

        System.out.println("\n======= Cadastrar Quarto =======\n");

        System.out.println("Informe o nº do quarto: ");
        int numero = scanner.nextInt(); 

        System.out.println("Valor da diária(R$): ");
        double valor = scanner.nextDouble(); //double ~mariana

        System.out.println("Capacidade de pessoas: ");
        int capacidade = scanner.nextInt();

        Quarto novoQuarto = new Quarto(numero, capacidade, valor);

        if (this.quartos.contains(novoQuarto)){ //verifica duplicado. - .contains() chama sozinho o equals() do Quarto! Se já existir, imprime aviso e dá return; ~mari
            System.out.println("Já existe um quarto com esse número!");
            return;
        }

        this.quartos.add(novoQuarto);
        System.out.println("Quarto cadastrado com sucesso!");
    }

    public void listarQuartos(){

        System.out.println("\n======== Listar os Quartos ========");

        if (this.quartos.isEmpty()){
            System.out.println("Nenhum quarto cadastrado.");
            return;

        }

            for (int i = 0; i < this.quartos.size(); i++){
                System.out.println(this.quartos.get(i)); //imprime apenas o quarto da posicao i. get(i) isso chama sozinho o toString() da classe Quarto ~mari
            }
        }

    public void consultarQuarto(Scanner scanner){

        System.out.println("\n ======== CONSULTA 🔎︎ ========");
        System.out.println("Digite o nº do quarto: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < this.quartos.size(); i++){
            Quarto q = this.quartos.get(i);
            if (q.getNumero() == numero){
                System.out.println(q); // imprime só o quarto encontrado!
                return;
        }

    }

    System.out.println("Quarto não encontrado!"); //terminou o for sem achar ~mari

}
    // toString = mostra os conteúdos dos atributos ~mariana
    @Override
    public String toString() {
        return "Hotel: " + this.nome + " | Total de quartos: " + this.quartos.size();
    }


    public boolean equals(Object obj){
        // 1. "Eu estou comparando eu mesmo comigo mesmo na memória?" Se sim, é igual (true). ~mari
        if (this == obj) return true; 

        // 2. "O outro objeto veio vazio (null) OU ele nem é um Hotel (ex: é um Quarto ou Texto)?" ~mari
        // Se for nulo ou não for Hotel, não tem como ser igual (false).
        if (obj == null || !(obj instanceof Hotel)) return false;

        // 3. Logo, o obj É um Hotel! Essa linha "converte" o obj genérico
        // para o tipo Hotel, para podermos acessar o atributo ".nome" dele. ~mari
        Hotel outro = (Hotel) obj;

        // 4. Compara o nome DESTE hotel (this.nome) com o nome do OUTRO (outro.nome),
        // ignorando maiúsculas/minúsculas. Se bater, retorna true; senão, false. ~mari
        return this.nome.equalsIgnoreCase(outro.nome);
    }
}
