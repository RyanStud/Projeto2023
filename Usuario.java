public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private int idade;
    private String endereco;

    // Adicione este construtor à sua classe Usuario
    public Usuario(String nome, String email, String senha, int idade, String endereco) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
