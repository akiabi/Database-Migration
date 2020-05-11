package com.demo.example;

import java.util.List;

public class IATableInfo {
	private String srcTblName;
	private String targetTbleName;
	 public List<IAColumnInfo> iaColumns;
	 
	 
	 
	public String getSrcTblName() {
		return srcTblName;
	}
	public void setSrcTblName(String srcTblName) {
		this.srcTblName = srcTblName;
	}
	
	public String getTargetTbleName() {
		return targetTbleName;
	}
	public void setTargetTbleName(String targetTbleName) {
		this.targetTbleName = targetTbleName;
	}
	public List<IAColumnInfo> getIaColumns() {
		return iaColumns;
	}
	public void setIaColumns(List<IAColumnInfo> datacolumns) {
		this.iaColumns = datacolumns;
	}
	@Override
	public String toString() {
		return "IATableInfo [srcTblName=" + srcTblName + ", targetTbleName=" + targetTbleName + ", iaColumns="
				+ iaColumns + "]";
	}
	
	 
		
}