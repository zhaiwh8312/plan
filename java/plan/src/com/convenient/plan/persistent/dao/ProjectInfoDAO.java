package com.convenient.plan.persistent.dao;

import java.util.List;

import com.convenient.plan.persistent.model.ProjectInfo;

public interface ProjectInfoDAO {
	/**
	 * 获取所有的项目列表
	 * @return
	 * @throws RuntimeException
	 */
	public List<ProjectInfo> getAllProjectInfoList() throws RuntimeException;
}
