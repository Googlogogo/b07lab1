package lab4.Lab4Part2;

public class GroceryItem {
	String id;
	String name;
	double length;
	double width;
	double height;
	
	public GroceryItem(String id, String name, double length, double width, double height) {
		this.id = id;
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof GroceryItem))
			return false;
		GroceryItem other = (GroceryItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}
}
