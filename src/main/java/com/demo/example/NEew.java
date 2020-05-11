package com.demo.example;

import java.util.List;

public class NEew extends IATableInfo{
	
	IATableInfo iaTableInfo = new IATableInfo();
	
	List<IATableInfo> iaTables;
	public List<IATableInfo> getIaTables() {
		return iaTables;
	}
	public void setIaTables(List<IATableInfo> iaTables) {
		this.iaTables = iaTables;
	}
	@Override
	public String toString() {
		return "NEew [iaTables=" + iaTables + "]";
	}

}
