package com.convenient.plan.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.convenient.base.tools.FileUtil;

@Controller
@Scope(value="prototype")
public class PlanDataController {

	@RequestMapping(value="/api/plan/data.json")
	public void doIndex(HttpServletRequest request, HttpServletResponse response) {
		String filePath = "/resource/data/plan.json";
		
		String realFilePath = request.getSession().getServletContext().getRealPath(filePath);
		
		String planStr = FileUtil.readFile(realFilePath);
		
		JSONArray planArray = new JSONArray();
		
		JSONObject plan1 = new JSONObject();
		plan1.put("name", "mimi网");
		plan1.put("desc", "需求设计");
		JSONArray values1 = new JSONArray();
		JSONObject obj1 = new JSONObject();
		obj1.put("from", "/Date(1408291200000)/");
		obj1.put("to", "/Date(1408723199000)/");
		obj1.put("label", "需求设计");
		obj1.put("customClass", "ganttBlue");
		values1.add(obj1);
		plan1.put("values", values1);
		
		JSONObject plan2 = new JSONObject();
		plan2.put("name", " ");
		plan2.put("desc", "管理平台开发");
		JSONArray values2 = new JSONArray();
		JSONObject obj2 = new JSONObject();
		obj2.put("from", "/Date(1408896000000)/");
		obj2.put("to", "/Date(1410364799000)/");
		obj2.put("label", "管理平台开发");
		obj2.put("customClass", "ganttBlue");
		values2.add(obj2);
		plan2.put("values", values2);
		
		JSONObject plan3 = new JSONObject();
		plan3.put("name", " ");
		plan3.put("desc", "网站开发");
		JSONArray values3 = new JSONArray();
		JSONObject obj3 = new JSONObject();
		obj3.put("from", "/Date(1410364800000)/");
		obj3.put("to", "/Date(1412092799000)/");
		obj3.put("label", "网站开发");
		obj3.put("customClass", "ganttBlue");
		values3.add(obj3);
		plan3.put("values", values3);
		
		JSONObject plan4 = new JSONObject();
		plan4.put("name", " ");
		plan4.put("desc", "系统测试");
		JSONArray values4 = new JSONArray();
		JSONObject obj4 = new JSONObject();
		obj4.put("from", "/Date(1412092800000)/");
		obj4.put("to", "/Date(1413302400000)/");
		obj4.put("label", "系统测试");
		obj4.put("customClass", "ganttBlue");
		values4.add(obj4);
		plan4.put("values", values4);
		
		
		
		
		planArray.add(plan1);
		planArray.add(plan2);
		planArray.add(plan3);
		planArray.add(plan4);
		
		response.setContentType("text/html;charset=UTF-8");
		try {
			response.getWriter().write(planArray.toString());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
