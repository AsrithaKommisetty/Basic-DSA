package exceptionHandling;
import java.util.*;
public class ArrayListDemo {
    	public static void main(String[] args) {
		LinkedList<String> FruitList=new LinkedList<String>();//no difference arraylist or linkedlist
		FruitList.add("mango");
		FruitList.add("apple");
		FruitList.add("watermelon");
		FruitList.add("banana");
		System.out.println(FruitList);//printing list
		Collections.sort(FruitList);
		System.out.println(FruitList);//printing after sorting
		Collections.reverse(FruitList);//reversing
		int sizez=FruitList.size();
		System.out.println(sizez);//printing the size of the list
		System.out.println(FruitList.contains("raspberry"));//checking whether an element is present in it or not
		System.out.println(FruitList);//printing reversing
		for(int i=0;i<sizez;i++){
            if(i%2==0){
                System.out.print(FruitList.get(i)+" ");//printing even digit places
            }
            else{
                System.out.println(FruitList.get(i)+" ");//printing odd digit places
            }
            }
	    
	}

}
