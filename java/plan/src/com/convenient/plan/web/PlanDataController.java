package com.convenient.plan.web;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.convenient.base.tools.FileUtil;
import com.convenient.plan.service.PlanIndexService;

@Controller
@Scope(value="prototype")
public class PlanDataController {
	
	@Resource
	private PlanIndexService planIndexService;

	@RequestMapping(value="/api/plan/data.json")
	public void doIndex(HttpServletRequest request, HttpServletResponse response) {
		JSONArray planArray = new JSONArray();
		
		try {
			planArray = planIndexService.getAllProjectPlan();
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(planArray.toString());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
