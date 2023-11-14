package assignment5;

class TV1 {
	private int size;
	
	public TV1(int size) {
		this.size = size; 
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV1 extends TV1 {
	protected int color;
	
	public ColorTV1(int size, int color) {
		super(size);
		this.color = color;
	}
}

class IPTV extends ColorTV1 {
	private String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 " + ip + " 주소의 " + getSize() + "인치 " + color + "컬러");
	}
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}



