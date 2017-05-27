package br.com.pim.model;

//*Cadastro de perfis do usuário, tais como cliente, vendedor, administrador,...*//

public class Perfil {

private String perfil;

public Perfil(String perfil) {
	super();
	this.perfil = perfil;
}

public String getPerfil() {
	return perfil;
}

public void setPerfil(String perfil) {
	this.perfil = perfil;
}

}
