package com.abo.artineer.model;

import java.io.File;
import java.sql.Date;

public class ProjectVO {
	private int projNo;
	private String memName;
	private int memYear;
	private String projTitle;
	private String projContent;
	private int projHit;
	private String projfile;
	private Date createDate;
	private int comment;
	private String ctgId;
	
	private String memId;
	
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public int getProjNo() {
		return projNo;
	}
	public void setProjNo(int projNo) {
		this.projNo = projNo;
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
	public String getProjTitle() {
		return projTitle;
	}
	public void setProjTitle(String projTitle) {
		this.projTitle = projTitle;
	}
	public String getProjContent() {
		return projContent;
	}
	public void setProjContent(String projContent) {
		this.projContent = projContent;
	}
	public int getProjHit() {
		return projHit;
	}
	public void setProjHit(int projHit) {
		this.projHit = projHit;
	}
	public String getProjfile() {
		return projfile;
	}
	public void setProjfile(String projfile) {
		this.projfile = projfile;
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
