package chapter02;

public class Point {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("[x = " + x + ",y = " + y + "]에 점을 그렷습니다.");

	}

	public void show(boolean visible) {
		// TODO Auto-generated method stub
		if(visible){
			show();
			return;
		}
		System.out.println("[x = " + x + ",y = " + y + "]에 점을 그렷습니다.");

	}

}
