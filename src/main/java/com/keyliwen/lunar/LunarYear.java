package com.keyliwen.lunar;

public class LunarYear {

	private final GanZhi ganZhi;
	private final int year;
	private final ShengXiao shengXiao;
	
	public LunarYear(int year, GanZhi ganZhi, ShengXiao shengXiao) {
		this.year = year;
		this.ganZhi = ganZhi;
		this.shengXiao = shengXiao;
	}

	public GanZhi getGanZhi() {
		return ganZhi;
	}

	public int getYear() {
		return year;
	}

	public ShengXiao getShengXiao() {
		return shengXiao;
	}
	
	
	
}
