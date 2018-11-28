package br.com.java.lambdas.status1;

import java.util.Arrays;
import java.util.List;

import br.com.java.lambdas.model.Usuario;

public class Exercicio1 {

	public static void main(String[] args) {

		Usuario usr1 = new Usuario("Douglas Dias", 100);
		Usuario usr2 = new Usuario("Débora Oliveira", 80);
		Usuario usr3 = new Usuario("Jhonatas Ferreira", 50);

		List<Usuario> usuarios = Arrays.asList(usr1, usr2, usr3);

		usuarios.forEach(s -> System.out.println(s.getNome()));
		
		usuarios.forEach(s -> s.tornaModerador());

	}
}
