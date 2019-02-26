package com.program.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.google.gson.Gson;
import com.program.model.Car;

@Controller
public class GsonController {
	
	@RequestMapping("/gson")
	public ModelAndView objToGson()
	{
		ModelAndView mv = new ModelAndView("show");
		Car car = new Car();
        car.setName("AUDI");
        car.setModel(2014);
        car.setPrice(300000);
        car.getColors().add("GRAY");
        car.getColors().add("BLACK");
        car.getColors().add("WHITE");
        
        Gson gson=new Gson();
        String jsonString = gson.toJson(car);
        
//        System.out.println(jsonString);
        
        mv.addObject("message", jsonString);
		return mv;
        
        
	}
}
