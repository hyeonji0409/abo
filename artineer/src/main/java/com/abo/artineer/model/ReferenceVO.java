package com.abo.artineer.model;

import java.util.Date;

public class ReferenceVO {
	private int refNo;
	private String memName;
	private int memYear;
	private String refTitle;
	private String refContent;
	private int refHit;
	private String file;
	private Date createDate;
	private int comment;
	private String ctgId;
	public int getRefNo() {
		return refNo;
	}
	public void setRefNo(int refNo) {
		this.refNo = refNo;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public int getMemYear() {
		return memYear;
	}
	public void setMemYear(int memYear) {
		this.memYear = memYear;
	}
	public String getRefTitle() {
		return refTitle;
	}
	public void setRefTitle(String refTitle) {
		this.refTitle = refTitle;
	}
	public String getRefContent() {
		return refContent;
	}
	public void setRefContent(String refContent) {
		this.refContent = refContent;
	}
	public int getRefHit() {
		return refHit;
	}
	public void setRefHit(int refHit) {
		this.refHit = refHit;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public String getCtgId() {
		return ctgId;
	}
	public void setCtgId(String ctgId) {
		this.ctgId = ctgId;
	}
	
	

}
