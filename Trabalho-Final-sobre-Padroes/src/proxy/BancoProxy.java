package Proxy;

public class BancoProxy extends BancoUsuarios {

    protected String usuario, senha;

    public BancoProxy(String usuario, String senha) {
	this.usuario = usuario;
	this.senha = senha;
    }

    @Override
    public String getUsuario() {
	if (temPermissaoDeAcesso()) {
            return super.getUsuario();
	}
	return null;
    }

    private boolean temPermissaoDeAcesso() {
	return usuario == "marcos" && senha == "12345";
    }
}
