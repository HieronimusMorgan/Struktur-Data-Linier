/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author basisb16
 */
public class MainQueueDinamis {
    public static void main(String[] args) {
        QueueDinamis a = new QueueDinamis();
       a.enqueue(10);
        a.enqueue(20);
        a.enqueue(30);
        a.enqueue(40);
        a.enqueue(50);
        a.enqueue(60);
        a.enqueue(70);
        a.enqueue(80);
        a.enqueue(90);
        a.enqueue(100);
        
        while (!a.isEmpty()) {            
            System.out.println(a.dequeue());
        }
    }
}
