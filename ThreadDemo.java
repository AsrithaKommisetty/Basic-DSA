package fat.prep;

class Count {
	public Count(String name) {
		for(int i=0;i<15;i++) {
			System.out.println(name+" "+i);
		}
	}	
}

class Iterate extends Thread {
	String name;
	Iterate(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=0;i<15;i++) {
			System.out.println(name+" "+i);
		}
	}	
}
public class ThreadDemo {

	public static void main(String[] args) {
		Iterate c1=new Iterate("c1");
		Iterate c2=new Iterate("c2");
		c1.start();
		
		c2.start();
	}

}
