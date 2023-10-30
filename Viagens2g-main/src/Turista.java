
public class Turista {




    /// Atributos
    private String nome;
    private  ValidarCPF cpf;

    public String getNome(){
        return  nome;
    }
    //metodos
    public String viajar(){
        return "viajando ..";
    }
    //construtor padrao
    public Turista(){}

    //sobrecarga do construtor personalizado

    Turista(String _nome){
        this.nome = _nome;
    }


}