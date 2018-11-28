package br.com.java.lambdas.status1;

import java.util.List;
import java.util.function.Consumer;

import br.com.java.lambdas.model.Usuario;
import br.com.java.lambdas.valores.ValoresUsuarios;

public class Exercicio3 {

	public static void main(String[] args) {

		List<Usuario> usuarios = ValoresUsuarios.listaUsuario();

		Consumer<Usuario> mostrarMensagem = u -> System.out.println("antes de imprimir os nomes");
		Consumer<Usuario> imprimirNomes = u -> System.out.println(u.getNome());

		usuarios.forEach(mostrarMensagem.andThen(imprimirNomes));

	}

}
