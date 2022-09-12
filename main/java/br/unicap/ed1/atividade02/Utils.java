package br.unicap.ed1.atividade02;

public class Utils {
    public static void reverse(IQueue queueToBeReversed, IStack stackAuxiliary) {
        
            try {
                while(!queueToBeReversed.isEmpty()) {
                    stackAuxiliary.push(queueToBeReversed.dequeue());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            while(!stackAuxiliary.isEmpty()) {
                queueToBeReversed.enqueue(stackAuxiliary.pop());
                
            }  
        }                  
    } 
