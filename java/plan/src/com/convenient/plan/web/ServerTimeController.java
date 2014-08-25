package com.convenient.plan.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope(value="prototype")
public class ServerTimeController {
	
	@RequestMapping(value="/api/time")
	public @ResponseBody String doGetServerTime() {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
//		String serverTime = sdf.format(new Date());
		
		return String.valueOf(new Date().getTime());
	}
}
