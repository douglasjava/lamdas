package br.com.java.lambdas.interfaceFuncional;

@FunctionalInterface
public interface Validador<T> {
	public boolean validar(T t);
}
