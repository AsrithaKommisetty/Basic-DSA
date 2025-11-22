package fat.prep;
class Marks<Type>{
	Type mark;
	Marks(Type mark){
		this.mark=mark;
	}
	public Type getObj() {
		return mark;
	}
	public void setObj(Type mark) {
		this.mark=mark;
	}
	public String toString() {
		return mark.getClass().getName();
	}
}
public class GenericClassDemo {

	public static void main(String[] args) {
		Marks<Integer>m1=new Marks<Integer>(77);
		System.out.println("the mark is: "+m1);
		System.out.println(m1.getObj());
		Marks<Double>m2=new Marks<Double>(77.9);
		System.out.println("the mark is: "+m2);
		System.out.println(m2.getObj());
		Marks<Float>m3=new Marks<Float>(77.9f);
		System.out.println("the mark is: "+m3);
		System.out.println(m1.getObj());
		
		
	}}
