package com.convenient.plan.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.convenient.base.tools.FileReader;

@Controller
@Scope(value="prototype")
public class PlanDataController {

	@RequestMapping(value="/api/plan/data.json")
	public void doIndex(HttpServletRequest request, HttpServletResponse response) {
		String filePath = "/resource/data/data.json";
		
		String realFilePath = request.getSession().getServletContext().getRealPath(filePath);
		
		FileReader.readFile(realFilePath);
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("key", "value");
		
		JSONObject jsObj = JSONObject.fromObject(map);
		
		try {
			response.getWriter().write(jsObj.toString());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
