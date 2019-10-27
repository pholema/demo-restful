package com.example.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

@RestController
public class Controller {

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
	public ResEntity hello() {
		ResEntity e = new ResEntity();
		e.setHello("wilson");
		return e;
	}

	@RequestMapping(value = "/hi", method = RequestMethod.POST)
	public String hi() {
		return "hi~";
	}
}
