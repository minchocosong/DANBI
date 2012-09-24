package com.swm.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Counsel {
	
	@Id
	private String id;
	
	private String no;
	private String type;
	private String relationship;
	private String cAge; // c:client
	private String cType;
	private String date;
	 
	//extend
	private String root;
	private String cGender;
	private String cJob;
	private String cAddress;
	private String cAcademic;
	private String cMarriage;
	private String cMarriageYear;
	private String cChildren;
	private String cFamily;
	private String cObstacle;
	private String cNationality;
	
	private String aGender;
	private String aJob;
	private String aAddress;
	private String aAge;
	private String aMarriage;
	private String aMarriageYear;
	private String aChildren;
	private String aAcademic;
	private String aObstacle;
	private String aNationality;

	public Counsel() {
		super();
	}

	public Counsel( String no, String type, String relationship,
			String clientAge, String clientType, String date) {
		super();
		this.no = no;
		this.type = type;
		this.relationship = relationship;
		this.cAge = clientAge;
		this.cType = clientType;
		this.date = date;
	}
	
	public Counsel(String no, String type, String relationship,
			String cAge, String cType, String date, String root,
			String cGender, String cJob, String cAddress, String cAcademic,
			String cMarriage, String cMarriageYear, String cChildren,
			String cFamily, String cObstacle, String cNationality,
			String aGender, String aJob, String aAddress, String aAge,
			String aMarriage, String aMarriageYear, String aChildren,
			String aAcademic, String aObstacle, String aNationality) {
		super();
		this.no = no;
		this.type = type;
		this.relationship = relationship;
		this.cAge = cAge;
		this.cType = cType;
		this.date = date;
		this.root = root;
		this.cGender = cGender;
		this.cJob = cJob;
		this.cAddress = cAddress;
		this.cAcademic = cAcademic;
		this.cMarriage = cMarriage;
		this.cMarriageYear = cMarriageYear;
		this.cChildren = cChildren;
		this.cFamily = cFamily;
		this.cObstacle = cObstacle;
		this.cNationality = cNationality;
		this.aGender = aGender;
		this.aJob = aJob;
		this.aAddress = aAddress;
		this.aAge = aAge;
		this.aMarriage = aMarriage;
		this.aMarriageYear = aMarriageYear;
		this.aChildren = aChildren;
		this.aAcademic = aAcademic;
		this.aObstacle = aObstacle;
		this.aNationality = aNationality;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getcAge() {
		return cAge;
	}

	public void setcAge(String cAge) {
		this.cAge = cAge;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public String getcGender() {
		return cGender;
	}

	public void setcGender(String cGender) {
		this.cGender = cGender;
	}

	public String getcJob() {
		return cJob;
	}

	public void setcJob(String cJob) {
		this.cJob = cJob;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcAcademic() {
		return cAcademic;
	}

	public void setcAcademic(String cAcademic) {
		this.cAcademic = cAcademic;
	}

	public String getcMarriage() {
		return cMarriage;
	}

	public void setcMarriage(String cMarriage) {
		this.cMarriage = cMarriage;
	}

	public String getcMarriageYear() {
		return cMarriageYear;
	}

	public void setcMarriageYear(String cMarriageYear) {
		this.cMarriageYear = cMarriageYear;
	}

	public String getcChildren() {
		return cChildren;
	}

	public void setcChildren(String cChildren) {
		this.cChildren = cChildren;
	}

	public String getcFamily() {
		return cFamily;
	}

	public void setcFamily(String cFamily) {
		this.cFamily = cFamily;
	}

	public String getcObstacle() {
		return cObstacle;
	}

	public void setcObstacle(String cObstacle) {
		this.cObstacle = cObstacle;
	}

	public String getcNationality() {
		return cNationality;
	}

	public void setcNationality(String cNationality) {
		this.cNationality = cNationality;
	}

	public String getaGender() {
		return aGender;
	}

	public void setaGender(String aGender) {
		this.aGender = aGender;
	}

	public String getaJob() {
		return aJob;
	}

	public void setaJob(String aJob) {
		this.aJob = aJob;
	}

	public String getaAddress() {
		return aAddress;
	}

	public void setaAddress(String aAddress) {
		this.aAddress = aAddress;
	}

	public String getaAge() {
		return aAge;
	}

	public void setaAge(String aAge) {
		this.aAge = aAge;
	}

	public String getaMarriage() {
		return aMarriage;
	}

	public void setaMarriage(String aMarriage) {
		this.aMarriage = aMarriage;
	}

	public String getaMarriageYear() {
		return aMarriageYear;
	}

	public void setaMarriageYear(String aMarriageYear) {
		this.aMarriageYear = aMarriageYear;
	}

	public String getaChildren() {
		return aChildren;
	}

	public void setaChildren(String aChildren) {
		this.aChildren = aChildren;
	}

	public String getaAcademic() {
		return aAcademic;
	}

	public void setaAcademic(String aAcademic) {
		this.aAcademic = aAcademic;
	}

	public String getaObstacle() {
		return aObstacle;
	}

	public void setaObstacle(String aObstacle) {
		this.aObstacle = aObstacle;
	}

	public String getaNationality() {
		return aNationality;
	}

	public void setaNationality(String aNationality) {
		this.aNationality = aNationality;
	}

}
