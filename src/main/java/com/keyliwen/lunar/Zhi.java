package com.keyliwen.lunar;
/**
 * 地支
 * @author liwen
 * @date 2018年1月11日 下午4:34:22
 */
public enum Zhi {
	
	Zi(0, "子"),
	Chou(1, "丑"),
	Yin(2, "寅"),
	Mao(3, "卯"),
	Chen(4, "辰"),
	Si(5, "巳"),
	Wu(6, "午"),
	Wei(7, "未"),
	Shen(8, "申"),
	You(9, "酉"),
	Xu(10, "戌"),
	Hai(11, "亥");
	
	private int index;
	private String value;
	
	private Zhi(int index, String value) {
		this.index = index;
		this.value = value;
	}
	
	/**
	 * 根据序号返回地支，序号从0开始
	 * @param index 序号
	 * @return
	 */
	public static Zhi of(int index) {
		for (Zhi zhi: Zhi.values()) {
			if (zhi.index == index) {
				return zhi;
			}
		}
		return null;
	}
	
	/**
	 * 根据值返回地支，如 “子”
	 * @param value
	 * @return
	 */
	public static Zhi of(String value) {
		for (Zhi zhi: Zhi.values()) {
			if (zhi.value.equals(value)) {
				return zhi;
			}
		}
		return null;
	}
	
	/**
	 * 返回相对于当前地支偏移一段距离后的地支，offset正数时向后偏移，负数向前偏移
	 * @param offset
	 * @return
	 */
	public Zhi offset(int offset) {
		if (offset >= 0) {
			return Zhi.of((index + offset) % 12);
		} else {
			return Zhi.of((index + Math.abs(12 + offset)) % 12);
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
