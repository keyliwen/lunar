package com.keyliwen.lunar;


/**
 * 天干
 * @author liwen
 * @date 2018年1月11日 下午4:29:56
 */
public enum Gan {
	
	Jia(0, "甲"),
	Yi(1, "乙"),
	Bing(2, "丙"),
	Ding(3, "丁"),
	Wu(4, "戊"),
	Ji(5, "己"),
	Geng(6, "庚"),
	Xin(7, "辛"),
	Ren(8, "壬"),
	Gui(9, "癸");
	
	private int index;
	private String value;
	
	private Gan(int index, String value) {
		this.index = index;
		this.value = value;
	}
	
	/**
	 * 根据序号返回天干，序号从0开始
	 * @param index 序号
	 * @return
	 */
	public static Gan of(int index) {
		for (Gan gan: Gan.values()) {
			if (gan.index == index) {
				return gan;
			}
		}
		return null;
	}
	
	/**
	 * 根据值返回天干，如 “甲”
	 * @param value
	 * @return
	 */
	public static Gan of(String value) {
		for (Gan gan: Gan.values()) {
			if (gan.value.equals(value)) {
				return gan;
			}
		}
		return null;
	}
	
	/**
	 * 返回相对于当前天干偏移一段距离后的天干，offset正数时向后偏移，负数向前偏移
	 * @param offset
	 * @return
	 */
	public Gan offset(int offset) {
		if (offset >= 0) {
			return Gan.of((index + offset) % 10);
		} else {
			return Gan.of((index + Math.abs(10 + offset)) % 10);
		}
		
	}
	
	public int getIndex() {
		return index;
	}
	
	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return getValue();
	}
	
}
