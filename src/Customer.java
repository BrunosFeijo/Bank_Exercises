package src;

public class Customer {
    private String nome;

    public Customer(String nome) throws Exception {
        if (nome == null){
            throw new Exception("Invalid Name");
        }else {
            this.nome = nome;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
