
public class Animal {
	private boolean gender = true // male - true, female - false
			, twoLegs = false, fourLegs = false;
	private String color = "green", type = "";
	
	// Black female monkey
	Animal() {
		// Female
		gender = false;
		
		twoLegs = true;
		color = "black";
		type = "monkey";
	}
	
	// Grey female pigeon
	Animal(int useless) {
		// Female
		gender = false;

		twoLegs = true;
		color = "grey";
		type = "pigeon";
	}
	
	public void printType() {
		System.out.println(type);
	}
	
	public void makeInvisible() {
		color = "transparent";
	}

	
	
	// Getters and Setters
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public void setTwoLegs(boolean twoLegs) {
		this.twoLegs = twoLegs;
	}

	public void setFourLegs(boolean fourLegs) {
		this.fourLegs = fourLegs;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getGender() {
		return gender;
	}

	public boolean getTwoLegs() {
		return twoLegs;
	}

	public boolean getFourLegs() {
		return fourLegs;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}
}
