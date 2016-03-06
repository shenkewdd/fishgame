package net.keshen.enumration;

/**
 * 鱼的种类
 * @author shenke
 *
 */
public enum FishType {
	/**
	 * 燕鱼
	 */
	MACKEREL("fish01"),
	/** 红鱼*/
	SNAPPER("fish02"),
	/** 鲨鱼*/
	SHARK("fish02"),
	/** 小型鱼*/
	SMALL(""),
	/** 中型鱼*/
	MID(""),
	/** 美人鱼*/
	SEAMAID("");
	
	private String name;

	
	private FishType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
