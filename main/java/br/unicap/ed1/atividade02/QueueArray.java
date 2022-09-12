package br.unicap.ed1.atividade02;

public class QueueArray implements IQueue {
    private Integer[] vetor;
    private int head;
    private int tail;
    private int size;

    public QueueArray(int capacity) {
        this.vetor = new Integer[capacity];
        this.size = 0;
        this.tail = 0;
        this.head = 0;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(Integer value) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Queue cannot enqueue more than 3 elements");
        } else {
            this.vetor[this.tail] = value;
            this.size++;
            this.tail++;
        }
    }

    private boolean isFull() {
        if (this.size == this.vetor.length) {
            return true;
        }else
        return false;
    }
        
    @Override
    public Integer dequeue() throws Exception {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }else if (isFull()){
            this.tail = 0;
            int data = this.vetor[this.head];
            vetor[this.head] = null;
            this.head++;
            this.head = head % vetor.length;
            this.size--;
            return data;  
        }else{
            int data = this.vetor[this.head];
            vetor[this.head] = null;
            this.head++;
            this.head = head % vetor.length;
            this.size--;
            return data;
        }
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}


