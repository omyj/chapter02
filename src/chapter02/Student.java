package chapter02;

public class Student extends Person {
public void showInfo(){
	System.out.println(age); // 부모의 default 접근 o
//	System.out.println(name); 부모의 private 접근 x
	System.out.println(height); // 부모의 public 접근 o
	System.out.println(weight); // 부모의 public 접근 o (자식만)
}
}
