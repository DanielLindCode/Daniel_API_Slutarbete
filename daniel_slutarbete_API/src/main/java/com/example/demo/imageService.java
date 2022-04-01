package com.example.demo;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;

public class imageService {

	public void getImage(HttpServletResponse response) throws IOException
	{

		var imgFile = new ClassPathResource("blue.jpg");
		if (Math.random() < 0.5) {
			imgFile = new ClassPathResource("red.jpg");
		}

		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
	}
}
