package chapter02;

public class Goods {
	// String name = "nikon";
	// String price = "400,000";
	// int countStock = 30;
	// int countSold = 50;
	
	private static int countOfGoods;
	private String name;
	private String price;
	private int countStock;
	private int countSold;
	
	//생성자 -- 기본생성자, 오버로딩이 가능함;임의로만든 생성자 둘다사용 가능
	//빈 기본생성자
	public Goods(){
		
	}
	//개발자가 만든 생성자
	public Goods(String name, String price, int countStock, int countSold){
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		}
		String str = String.format("%,d원", price);

		this.price = str;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

//	public void showInfo() {
//		System.out.println("상품이름 :" + name + ", 가격: " + price + ", 재고개수:" + countStock + ", 팔린 개수: " + countSold);
//	}

	@Override
	public String toString() {//source의 generate사용
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}
}
