package package3.model.vo;

public class Cat extends Animal implements Pet{
	private String location;
	private String color;
	
	public Cat() {}
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString() + " " + this.location 
							+ "에 서식하며, 색상은 " + this.color + " 입니다.");
	}
	
	@Override
	public void play() {
		System.out.println("고양이가 집에서 뒹굴거리고 있습니다.");
	}
}
