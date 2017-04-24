package br.com.prisciladelima.model;

//*Cadastro de usuarios, configuração do perfil, status*//

public class Login {

	private Usuario usuario;
	private Perfil perfil;
	private String Senha;
	private boolean ativo;

	public Login(Usuario usuario, Perfil perfil, String senha, boolean ativo) {
		super();
		this.usuario = usuario;
		this.perfil = perfil;
		this.ativo = ativo;
		Senha = senha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
