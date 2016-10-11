package com.zp.test.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zp.test.model.User;
import com.zp.test.service.HelloWorldService;

@Controller
public class HelloWorldController {
	@Autowired
	private HelloWorldService helloWorldService;

	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	/**
	 * 表单封装数据
	 * @param user
	 * @return
	 */
	@RequestMapping("login")
	public String login(@ModelAttribute User user){
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		return "success";
	}
	
	@RequestMapping("upload")
	public String upLoad(@RequestParam("file")MultipartFile file) throws Exception{
		if(!file.isEmpty()){
			System.out.println("本地文件名称是==="+file.getOriginalFilename());
			
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("G:\\test\\",System.currentTimeMillis()+file.getOriginalFilename()));
			
		}
		return "success";
		
	}
	
	

}
