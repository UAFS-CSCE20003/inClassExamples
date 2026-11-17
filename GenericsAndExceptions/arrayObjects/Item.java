package arrayObjects;

public class Item {
	private static int num=0;
	private String desc;
	private int count;
	
	public Item() {
		this.setDesc("Item " + ++num);
		this.setCount(num*num);
	}
	
	@Override
	public String toString() {
		return "Item: " + this.getDesc() + " - " + this.getCount();
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
