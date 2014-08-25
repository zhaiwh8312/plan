package com.convenient.plan.persistent.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.convenient.base.dao.BaseDAO;
import com.convenient.plan.persistent.dao.PlanInfoDAO;
import com.convenient.plan.persistent.model.PlanInfo;

@Repository(value="planInfoDAO")
public class PlanInfoDAOImpl extends BaseDAO implements PlanInfoDAO {

	@Override
	public List<PlanInfo> getPlanInfoListByProjectId(String projectId) throws RuntimeException {
		return getSqlSession().selectList("PlanInfo.getPlanInfoListByProjectId", projectId);
	}

	@Override
	public List<PlanInfo> getPlanInfoListByProjectIdAndParentPlanId(
			Map<String, String> condition) throws RuntimeException {
		return getSqlSession().selectList("PlanInfo.getPlanInfoListByProjectIdAndParentPlanId", condition);
	}

}
