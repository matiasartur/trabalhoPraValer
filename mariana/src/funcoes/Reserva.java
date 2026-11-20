package funcoes;

import java.time.LocalDate; // trabalhar com datas
import java.time.format.DateTimeFormatter; // para formatar a data no toString().

public class Reserva {
    private Quarto quarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Reserva(Quarto quarto, LocalDate dataEntrada, LocalDate dataSaida){
        this.quarto = quarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;

    }

    //GETTERS
    public Quarto getQuarto(){
        return this.quarto;

    }

    public LocalDate getDataEntrada(){
        return this.dataEntrada;
    
    }

    public LocalDate getDataSaida(){
        return this.dataSaida;

    }

    //SETTERS
    public void setQuarto(Quarto quarto){
        this.quarto = quarto;

    }

    public void setDataEntrada(LocalDate dataEntrada){
        this.dataEntrada = dataEntrada;

    }

    public void SetDataSaida(LocalDate dataSaida){
        this.dataSaida = dataSaida;

    }
    @Override
    public String toString(){
        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nº"+this.quarto.getNumero()+"\n"+
                " | Entrada: "+this.dataEntrada.format(formatado)+" | "+
                " | Sáida: "+this.dataSaida.format(formatado);
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || !(obj instanceof Reserva)) return false;
        Reserva outro = (Reserva) obj;
        return this.quarto.equals(outro.quarto) &&
                this.dataEntrada.equals(outro.dataEntrada) &&
                this.dataSaida.equals(outro.dataSaida);
    }
}
