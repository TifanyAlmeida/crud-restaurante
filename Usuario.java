public class Usuario {

    private String nome;
    private String endereco;
    private int idClint;
    private String cpf;

    public Usuario(int idClint, String nome, String endereco, String cpf){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idClint = idClint;
    }

    public void setIdClint(int idClint) {
        this.idClint = idClint;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return idClint+"\t\t"+ nome +"\t\t\t"+cpf+"\t\t"+endereco;
    }
}

