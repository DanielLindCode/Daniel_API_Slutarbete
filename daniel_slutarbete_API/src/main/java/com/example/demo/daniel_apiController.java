package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class daniel_apiController implements ErrorController {
	
	rps_gameService myGame = new rps_gameService();
	documentationClass myDoc = new documentationClass();
	
	//////////////////////////////////////// ROOT ////////////////////////////////////////
	
	// http://localhost:8080/
	@RequestMapping(
			value = "/",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String root()
	{
		return myDoc.rootInfo();
	}
	
	
	//////////////////////////////////////// RPS GAME ////////////////////////////////////////
	
	// http://localhost:8080/rps
	@RequestMapping(
			value = "/rps",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String rsp()
	{
		return myDoc.rspInfo();
	}
	
	// http://localhost:8080/rps/play/[PLAYERMOVE]
	@RequestMapping(
			value = "/rps/play/{playerMove}",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String rspGame(@PathVariable String playerMove)
	{
		return myGame.rpsGame(playerMove);
	}
	
	// http://localhost:8080/rps/result
	@RequestMapping(
			value = "/rps/result", 
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String rpsResult() 
	{
		return myGame.showMatches();
	}
	
	
	//////////////////////////////////////// CALCULATOR ////////////////////////////////////////
	
	// http://localhost:8080/calc
	@RequestMapping(
			value = "/calc", 
			method = RequestMethod.GET, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String calcinfo() 
	{
		return myDoc.calcInfo();
	}
	
	// http://localhost:8080/calc/[OPERATOR]/[NUMBER1]/[NUMBER2]
	@RequestMapping(
			value = "/calc/{op}/{n1}/{n2}",
			method = RequestMethod.GET,
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String calc(@PathVariable String op, @PathVariable String n1, @PathVariable String n2) 
	{
		calcService myCalc = new calcService();
		return myCalc.calculator(op, n1, n2);
	}
	
	
	//////////////////////////////////////// FILE READER ////////////////////////////////////////
	
	// http://localhost:8080/filereader
	@RequestMapping(
			value = "/filereader", 
			method = RequestMethod.GET, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String filereader()
	{
		return myDoc.fileReaderInfo();
	}
	
	// http://localhost:8080/filereader/totext
	@RequestMapping(
			value = "/filereader/totext", 
			method = RequestMethod.GET, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public void filereaderCsv(HttpServletResponse response) throws IOException
	{
		var csvFile = new ClassPathResource("sample.csv");
		
		response.setContentType(MediaType.TEXT_PLAIN_VALUE);
		StreamUtils.copy(csvFile.getInputStream(), response.getOutputStream());
	}
	// http://localhost:8080/filereader/tojson
	@RequestMapping(
			value = "/filereader/tojson", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String toJson() throws IOException
	{
		fileReaderService myFR = new fileReaderService();		
		myFR.readFile("sample.csv");
		return myFR.toJson();
	}
	
	
	//////////////////////////////////////// IMAGE ////////////////////////////////////////
	
	// http://localhost:8080/image	
	@RequestMapping(
			value = "/image", 
			method = RequestMethod.GET, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String imageRoot()
	{
		return myDoc.imageInfo();
	}
	
	// http://localhost:8080/image/show
	@RequestMapping(
			value = "/image/show", 
			method = RequestMethod.GET, 
			produces = MediaType.IMAGE_JPEG_VALUE)
	public void showImage(HttpServletResponse response) throws IOException 
	{
		imageService myImage = new imageService();
		myImage.getImage(response);
	}
	
	
	//////////////////////////////////////// ERROR HANDLER ////////////////////////////////////////
	
	@RequestMapping(
			value = "/error", 
			method = RequestMethod.GET, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String errorHander() 
	{
		return myDoc.errorInfo();
	}
}
