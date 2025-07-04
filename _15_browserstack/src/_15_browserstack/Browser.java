package _15_browserstack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Browser {
	
	private Stack<String> stack;
	
	public Browser() {
		stack = new Stack<String>();
	}
	
	public void visitPage(String url) {
		stack.push(url);
		System.out.println("Hai visitato: " + url);
	}
	
	public void goBack() {
		try {
			System.out.println("Sei andato via da: " + stack.pop());
		} catch ( EmptyStackException e) {
			System.out.println("Nessuna pagina precedente");
		}
	}
	
	public void previousPage() {
		try {
			System.out.println("La pagina precedente a " + stack.peek() + " è " + stack.get(stack.size() - 2));
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println("Nessuna pagina precedente");
		}
	}
	
	public void printHistory() {
		System.out.println("Stampa la cronologia delle pagine visitate:");
		for(String url : stack) {
			System.out.println(url);
		}
	}

}
