package Proxy;

public class BancoUsuarios {
    private String nome;

    public BancoUsuarios() {
        nome = "Marcos Vieira";
    }

    String getUsuario() {
        return ("Acesso do usuário: " + nome);
    }
    
}
