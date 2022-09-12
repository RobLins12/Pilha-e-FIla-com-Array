package br.unicap.ed1.atividade02;

public class StackArray implements IStack {
    
    private Integer [] vetor;
    private int top;

    public StackArray(int capacity){
        this.vetor = new Integer[capacity];
        this.top = -1;
    }

    @Override
    public void push(Integer value) throws IllegalStateException{
        if (this.top == vetor.length - 1) {
            throw new IllegalStateException("Stack cannot push more than 3 elements");
        }
        this.top++;
        vetor[this.top] = value;
    }

    @Override
	public Integer pop() throws IllegalStateException{
        if (this.isEmpty() == true) {
            throw new IllegalStateException("Stack is empty");
        }else{
            return vetor[this.top--];
        }  
    }

    @Override
	public boolean isEmpty(){
        if (this.top == -1) {
            return true;
        }else
            return false;
    }
}
