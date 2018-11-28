package br.com.java.lambdas.status1;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.java.lambdas.interfaceFuncional.Validador;

/****
 * Interfaces Funcionais
 * 
 * @author Marques
 *
 */
public class Exercicio2 {

	public static void main(String[] args) {

		// before java 8
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					System.out.println(i);
				}
			}
		};
		new Thread(r).start();

		// after java 8
		Runnable t = () -> {
			for (int i = 0; i <= 1000; i++) {
				System.out.println("after: " + i);
			}
		};
		new Thread(t).start();

		// ---------------------------------------------------------------//

		// before java 8
		Button button = null;
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Evento do click adicionado");
			}
		});

		// after java 8
		button.addActionListener((event) -> System.out.println("Evento do click adicionado"));

		System.out.println(button);

		// ---------------------------------------------------------------//

		// before java 8
		Validador<String> validadorCep = new Validador<String>() {
			@Override
			public boolean validar(String valor) {
				return valor.matches("[0-9]{5}[0-9]{3}");
			}
		};

		System.out.println(validadorCep);

		// after java 8
		Validador<String> validarCep = valor -> valor.matches("[0-9]{5}[0-9]{3}");

		System.out.println(validarCep);

	}

}
