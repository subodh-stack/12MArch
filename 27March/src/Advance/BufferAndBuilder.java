package Advance;

public class BufferAndBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Velocity");
		
		sb.append("Katraj");
		
		System.out.println(sb);
		
		StringBuffer b = new StringBuffer("Katraj");
		
		b.reverse();
		
		System.out.println(b);
		
		String s = "Pune";
		StringBuffer ns = new StringBuffer(s);
		ns.reverse();
		System.out.println(ns);
		
	}
}
