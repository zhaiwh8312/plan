package com.convenient.plan.persistent.model;

import java.io.Serializable;

public class PlanInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String planId;
	private String projectId;
	private String planDesc;
	private String planStartTime;
	private String planEndTime;
	private String planLabel;
	private String planStyle;
	private int planSeq;

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getPlanDesc() {
		return planDesc;
	}

	public void setPlanDesc(String planDesc) {
		this.planDesc = planDesc;
	}

	public String getPlanStartTime() {
		return planStartTime;
	}

	public void setPlanStartTime(String planStartTime) {
		this.planStartTime = planStartTime;
	}

	public String getPlanEndTime() {
		return planEndTime;
	}

	public void setPlanEndTime(String planEndTime) {
		this.planEndTime = planEndTime;
	}

	public String getPlanLabel() {
		return planLabel;
	}

	public void setPlanLabel(String planLabel) {
		this.planLabel = planLabel;
	}

	public String getPlanStyle() {
		return planStyle;
	}

	public void setPlanStyle(String planStyle) {
		this.planStyle = planStyle;
	}

	public int getPlanSeq() {
		return planSeq;
	}

	public void setPlanSeq(int planSeq) {
		this.planSeq = planSeq;
	}

}
