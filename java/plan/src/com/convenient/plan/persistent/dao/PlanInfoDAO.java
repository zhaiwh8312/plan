package com.convenient.plan.persistent.dao;

import java.util.List;
import java.util.Map;

import com.convenient.plan.persistent.model.PlanInfo;

public interface PlanInfoDAO {
	/**
	 * 根据项目ID获取所有的计划列表
	 * @return
	 * @throws RuntimeException
	 */
	public List<PlanInfo> getPlanInfoListByProjectId(String projectId) throws RuntimeException;
	
	/**
	 * 根据项目ID和父级ID获取其下一级的计划列表
	 * @param condition
	 * @return
	 * @throws RuntimeException
	 */
	public List<PlanInfo> getPlanInfoListByProjectIdAndParentPlanId(Map<String, String> condition) throws RuntimeException;
}
