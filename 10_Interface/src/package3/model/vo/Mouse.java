package package3.model.vo;

public class Mouse extends Animal {
private int weight;
	
	public Mouse() {}
	public Mouse(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void speak() {
		System.out.println("찍찍!!");
	}
	
}
