package funcoes;

public class Quarto{
    //declaracao de atributos
    private int numero;
    private double valorDiaria;
    private int capacidade;
    private boolean disponivel;

    //construtores ~mariana
    public Quarto(){
        this.numero = 0;
        this.capacidade = 0;
        this.valorDiaria = 0.0;
        this.disponivel = true;

    }

    public Quarto(int numero, int capacidade, double valor){
        this.numero = numero;
        this.capacidade = capacidade;
        this.valorDiaria = valor;
        this.disponivel = true;  // todo quarto novo começa livre ~mariana
    }
    //GETTERS = ler valor do atributo ~mariana
    public int getNumero(){
            return this.numero;
        }

    public double getValorDiaria(){
            return this.valorDiaria;
        }

    public int getCapacidade(){
            return this.capacidade;
        }

    public boolean isDisponivel(){
         return this.disponivel;
    }

    // SETTERS = alterar valor do atributo (sempre void!) ~mariana
    public void setNumero(int novo){
        this.numero = novo;
    }

    public void setValorDiaria(double novo){
        this.valorDiaria = novo;
    }

    public void setCapacidade(int novo){
        this.capacidade = novo;
    }

    public void setDisponivel(boolean novo){
        this.disponivel = novo;
    }
    
    // toString = mostra os conteúdos dos atributos ~mariana
    @Override
    public String toString() {
        String status = this.disponivel ? "Livre" : "Ocupado";
        return "Nº do quarto: " + this.numero + "\n" +
               "Valor do quarto (R$): " + this.valorDiaria + "\n" +
               "Capacidade: " + this.capacidade + " pessoa(s)\n" +
               "Status: " + status + "\n";
    }

    // equals = compara se dois quartos têm o mesmo número (exigência do projeto) ~mariana

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Quarto)) return false;
        Quarto outro = (Quarto) obj;
        return this.numero == outro.numero;
    }
}