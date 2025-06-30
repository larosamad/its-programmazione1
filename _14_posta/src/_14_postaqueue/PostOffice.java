package _14_postaqueue;
import java.util.LinkedList;
import java.util.Queue;

public class PostOffice {
	private Queue<Person> queue;

    public PostOffice() {
    	
        queue = new LinkedList<>();
    }
    
    public void joinQueue(Person person) {
    	queue.add(person);
        System.out.println(person.getName() + " is in queue.");
    }
    
    public void whosNext() {
    	Person nextPerson = queue.peek();
        System.out.println(nextPerson.getName() + " is next.");
    }
    
    public void serveNext() {
    	Person nextPerson = queue.poll();
        System.out.println(nextPerson.getName() + " has been served.");
    }
    
    public void showQueue() {
        System.out.println("Queue:");
    	for (Person person: queue) {
    		System.out.println("- " + person.getName());
    	}
    }
    
}
