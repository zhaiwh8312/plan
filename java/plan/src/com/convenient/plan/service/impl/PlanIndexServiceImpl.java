package com.convenient.plan.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.convenient.plan.persistent.dao.PlanInfoDAO;
import com.convenient.plan.persistent.dao.ProjectInfoDAO;
import com.convenient.plan.persistent.model.PlanInfo;
import com.convenient.plan.persistent.model.ProjectInfo;
import com.convenient.plan.service.PlanIndexService;

@Service(value="planIndexService")
public class PlanIndexServiceImpl implements PlanIndexService {
	
	@Resource
	private ProjectInfoDAO projectInfoDAO;
	@Resource
	private PlanInfoDAO planInfoDAO;
	
	@Override
	public JSONArray getAllProjectPlan() throws RuntimeException, Exception {
		JSONArray allArray = new JSONArray();
		
		List<ProjectInfo> projectList = projectInfoDAO.getAllProjectInfoList();
		
		int size = projectList.size();
		
		for (int i = 0; i < size; i++) {
			ProjectInfo projectInfo = projectList.get(i);
			
			this.getPlanForProject(allArray, projectInfo);
		}
		
		return allArray;
	}
	
	private void getPlanForProject(JSONArray allArray, ProjectInfo projectInfo) {
		List<PlanInfo> planInfoList = planInfoDAO.getPlanInfoListByProjectId(projectInfo.getProjectId());

		JSONObject jsObj = new JSONObject();
		
		int size = planInfoList.size();
		
		for (int i = 0; i < size; i++) {
			PlanInfo plan = planInfoList.get(i);
			
			if (0 == i) {
				jsObj.put("name", projectInfo.getProjectName());
			} else {
				jsObj.put("name", " ");
			}
			
			jsObj.put("desc", plan.getPlanDesc());
			
			JSONArray valuesArray = new JSONArray();
			
			JSONObject valueObject = new JSONObject();
			valueObject.put("from", "/Date(" + plan.getPlanStartTime() + ")/");
			valueObject.put("to", "/Date(" + plan.getPlanEndTime() + ")/");
			valueObject.put("label", plan.getPlanLabel());
			valueObject.put("customClass", plan.getPlanStyle());
			
			valuesArray.add(valueObject);
			
			jsObj.put("values", valuesArray);
			
			allArray.add(jsObj);
		}
	}
}
