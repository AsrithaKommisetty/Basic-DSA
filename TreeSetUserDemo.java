package fat.prep;

import java.util.*;

class Student1 implements Comparable{
	String sid;
	int mark;
	public Student1(String sid, int mark) {
		this.sid = sid;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", mark=" + mark + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student1 newStudent=(Student1)o;
		if(newStudent.mark < this.mark)
			return 1;
		else
			return -1;
	}
}
public class TreeSetUserDemo {

	public static void main(String[] args) {	
		TreeSet<Student1> list = new TreeSet<Student1>();
		
		Student1 s1 = new Student1("bcd101", 80);
		Student1 s2 = new Student1("bcd110", 90);
		Student1 s3 = new Student1("bce201", 70);
		Student1 s4 = new Student1("bcd102", 70);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for(Student1 i:list)
			System.out.println(i);
	}
}


