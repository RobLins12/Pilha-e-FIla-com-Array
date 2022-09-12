package br.unicap.ed1.atividade02;

public interface IStack {

	public void push(Integer value);

	public Integer pop() throws IllegalStateException;

	public boolean isEmpty();
}
