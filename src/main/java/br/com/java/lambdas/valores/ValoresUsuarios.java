package br.com.java.lambdas.valores;

import java.util.Arrays;
import java.util.List;

import br.com.java.lambdas.model.Usuario;

public class ValoresUsuarios {

	public static List<Usuario> listaUsuario() {
		Usuario usr1 = new Usuario("Douglas Dias", 100);
		Usuario usr2 = new Usuario("Débora Oliveira", 80);
		Usuario usr3 = new Usuario("Jhonatas Ferreira", 50);

		List<Usuario> usuarios = Arrays.asList(usr1, usr2, usr3);

		return usuarios;
	}

}
