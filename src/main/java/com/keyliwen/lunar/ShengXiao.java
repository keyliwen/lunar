package com.keyliwen.lunar;
/**
 * 12生肖
 * @author liwen
 * @date 2018年1月11日 下午4:41:31
 */
public enum ShengXiao {
	
	Shu("鼠"),
	Niu("牛"),
	Hu("虎"),
	Tu("兔"),
	Long("龙"),
	She("蛇"),
	Ma("马"),
	Yang("羊"),
	Hou("猴"),
	Ji("鸡"),
	Gou("狗"),
	Zhu("猪");
	
	private String value;
	
	private ShengXiao(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
