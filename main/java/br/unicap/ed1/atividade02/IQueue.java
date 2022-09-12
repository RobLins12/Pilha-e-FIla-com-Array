package br.unicap.ed1.atividade02;

public interface IQueue {
	public void enqueue(Integer value) ;

	public Integer dequeue() throws Exception;

	public boolean isEmpty();

}
