package com.convenient.plan.persistent.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.convenient.base.dao.BaseDAO;
import com.convenient.plan.persistent.dao.ProjectInfoDAO;
import com.convenient.plan.persistent.model.ProjectInfo;

@Repository(value="projectInfoDAO")
public class ProjectDAOImpl extends BaseDAO implements ProjectInfoDAO {

	@Override
	public List<ProjectInfo> getAllProjectInfoList() throws RuntimeException {
		return getSqlSession().selectList("ProjectInfo.getAllProjectInfoList");
	}

}
