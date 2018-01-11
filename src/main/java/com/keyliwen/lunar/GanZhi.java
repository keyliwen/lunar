package com.keyliwen.lunar;
/**
 * 天干地支
 * @author liwen
 * @date 2018年1月11日 下午4:42:52
 */
public class GanZhi {

	private Gan gan;	//天干
	private Zhi zhi;	//地支
	
	private static final LunarYear BASE_LUNAR_YEAR = new LunarYear(2000, new GanZhi(Gan.Ji, Zhi.Mao), ShengXiao.Tu);		//基准年： 2000年，己卯兔年
	
	private GanZhi(Gan gan, Zhi zhi) {
		this.gan = gan;
		this.zhi = zhi;
	}
	
	public Gan getGan() {
		return gan;
	}
	
	public Zhi getZhi() {
		return zhi;
	}
	
	public static GanZhi of(int year) {
		int baseYear = BASE_LUNAR_YEAR.getYear();
		GanZhi baseGanZhi = BASE_LUNAR_YEAR.getGanZhi();
		int ganOffset;
		int zhiOffset;
		if (year >= baseYear) {
			ganOffset = (year - baseYear) % 10;
			zhiOffset = (year - baseYear) % 12;
		} else {
			ganOffset = (baseYear - year) % 10;
			zhiOffset = (baseYear - year) % 12;
		}
		return baseGanZhi.offset(-ganOffset, -zhiOffset);
	}
	
	public GanZhi offset(int ganOffset, int zhiOffset) {
		return new GanZhi(gan.offset(ganOffset), zhi.offset(zhiOffset));
	}
	
	@Override
	public String toString() {
		return gan.toString() + zhi.toString();
	}
}
