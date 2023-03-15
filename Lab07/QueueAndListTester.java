/**
 * Tester class for all classes
 * @author boran
 * @version 30.07.2021
 */ 

public class QueueAndListTester 
{
    public static void main(String[] args)
    {
        System.out.println("Tester for SimpleLinkedList class");

        SimpleLinkedList myList = new SimpleLinkedList();
        
        myList.addToTail("1");
        myList.addToTail("2");
        myList.addToTail("3");
        
        System.out.println(myList);
        
        myList.removeFromHead();
        
        // after removing from head
        System.out.println(myList);
        
        
        // tester for simple queue class
        System.out.println("Tester for SimpleQueue class");
        SimpleQueue myQueue = new SimpleQueue();
        
        myQueue.enqueue("Boran");
        myQueue.enqueue("Torun");
        myQueue.enqueue("Java");
        
        System.out.println(myQueue);
        
        myQueue.dequeue();
        
        // after dequeueing
        System.out.println(myQueue);
        
        
        // tester for simple stack with queue
        System.out.println("Tester for SimpleStackWithQueue class");
        SimpleStackWithQueue simpleStack = new SimpleStackWithQueue();
        
        simpleStack.push("water");
        simpleStack.push("paper");
        simpleStack.push("napkin");
        
        System.out.println(simpleStack);
        
        simpleStack.pop();
        
        // after popping
        System.out.println(simpleStack);
    }
}
