package com.demo.example;

public class IAColumnInfo {

	private String srcColName;
	private String targetColName;
	private boolean needTransformation;
	
	
	
	
	public String getSrcColName() {
		return srcColName;
	}
	public void setSrcColName(String srcColName) {
		this.srcColName = srcColName;
	}
	public String getTargetColName() {
		return targetColName;
	}
	public void setTargetColName(String targetColName) {
		this.targetColName = targetColName;
	}
	public boolean isNeedTransformation() {
		return needTransformation;
	}
	public void setNeedTransformation(boolean needTransformation) {
		this.needTransformation = needTransformation;
	}
	
	  @Override public String toString() { return "IAColumnInfo [srcColName=" +
	  srcColName + ", targetColName=" + targetColName + ", needTransformation=" +
	  needTransformation + "]"; }
	 
}
