package chapter02;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
//		String name;
//		int price;
//		int countStock;
//		int countSold;
//		Scanner scanner = new Scanner(System.in);
//		name = scanner.next();
		
		String str[];
		Goods camera = new Goods(); //기본 생성자를 사용, Goods클래스에 생성자가 자동으로 만들어짐
		Scanner scanner = new Scanner(System.in);
		System.out.print("상품정보를 입력하세요. ex) camera 300,000 40 20 : ");
		camera.setName(scanner.next());
		camera.setPrice(scanner.nextInt());
		camera.setCountStock(scanner.nextInt());
		camera.setCountSold(scanner.nextInt());
		
		Goods goods1 = new Goods("camera", "200,000원", 50, 40);//개발자가 임의로 만든 생성자를 사용, 오버로딩 가능;기본생성자와 같이 사용 가능
//		camera.showInfo();
		System.out.println(camera.toString());
		
//		System.out.println("상품이름 :"+camera.name+", 가격: "+camera.price+", 재고개수:"+camera.countStock+", 팔린 개수: "+camera.countSold);
	}
}
