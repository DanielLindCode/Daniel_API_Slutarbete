package com.example.demo;

public class documentationClass {

	private String rootDoc()
	{
		String infoText = 
						"\r\n"
						+ "  _____              _      _            _____ _____ \r\n"
						+ " |  __ \\            (_)    | |     /\\   |  __ \\_   _|\r\n"
						+ " | |  | | __ _ _ __  _  ___| |    /  \\  | |__) || |  \r\n"
						+ " | |  | |/ _` | '_ \\| |/ _ \\ |   / /\\ \\ |  ___/ | |  \r\n"
						+ " | |__| | (_| | | | | |  __/ |  / ____ \\| |    _| |_ \r\n"
						+ " |_____/ \\__,_|_| |_|_|\\___|_| /_/    \\_\\_|   |_____|\r\n"
						+ "                                                     \r\n"
						+ "                                                     \r\n"
						+ "\r\n"
						+ "\r\n"
						+ "[GET] / is the root of this API"
						+ "\r\n"
						+ "This API as four function groups: "
						+ "\r\n"
						+ " * Calculator - [GET] /calc"
						+ "\r\n"
						+ " * Rock, paper, scissors Game - [GET] /rps"
						+ "\r\n"
						+ " * Display random image - [GET] /image"
						+ "\r\n"
						+ " * File reader - [GET] /filereader"
						+ "\r\n"
						+ "All group roots have a description";
		
		return infoText;
	}
	
	private String calcDoc()
	{
		String infoText =
						"\r\n"
						+ "   _____      _            _       _                _____                 _          \r\n"
						+ "  / ____|    | |          | |     | |              / ____|               (_)         \r\n"
						+ " | |     __ _| | ___ _   _| | __ _| |_ ___  _ __  | (___   ___ _ ____   ___  ___ ___ \r\n"
						+ " | |    / _` | |/ __| | | | |/ _` | __/ _ \\| '__|  \\___ \\ / _ \\ '__\\ \\ / / |/ __/ _ \\\r\n"
						+ " | |___| (_| | | (__| |_| | | (_| | || (_) | |     ____) |  __/ |   \\ V /| | (_|  __/\r\n"
						+ "  \\_____\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|    |_____/ \\___|_|    \\_/ |_|\\___\\___|\r\n"
						+ "                                                                                     \r\n"
						+ "                                                                                     \r\n"						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "[GET] /calc takes in three parameters."
						+ "\r\n"
						+ "URL: /calc/[operator]/[numberInput1]/[numberInput2]"
						+ "\r\n"
						+ "Availible operators are PLUS, MINUS, DIVIDE and TIMES"
						+ "\r\n"
						+ "This application does basic calculations";
		
		return infoText;
	}
	
	private String imageDoc()
	{
		String infoText =
						"\r\n"
						+ "  _____                               _____                 _          \r\n"
						+ " |_   _|                             / ____|               (_)         \r\n"
						+ "   | |  _ __ ___   __ _  __ _  ___  | (___   ___ _ ____   ___  ___ ___ \r\n"
						+ "   | | | '_ ` _ \\ / _` |/ _` |/ _ \\  \\___ \\ / _ \\ '__\\ \\ / / |/ __/ _ \\\r\n"
						+ "  _| |_| | | | | | (_| | (_| |  __/  ____) |  __/ |   \\ V /| | (_|  __/\r\n"
						+ " |_____|_| |_| |_|\\__,_|\\__, |\\___| |_____/ \\___|_|    \\_/ |_|\\___\\___|\r\n"
						+ "                         __/ |                                         \r\n"
						+ "                        |___/                                          \r\n"
						+ "\r\n"
						+ "\r\n"
						+ "[GET] /image  takes in one parameters."
						+ "\r\n"
						+ "URL: /image/show"
						+ "\r\n"
						+ "This application shows a random picture when run.";
	
		return infoText;
	}
	
	private String fileReaderDoc()
	{
		String infoText = 
						"\r\n"
						+ "  ______ _ _        _____                _           \r\n"
						+ " |  ____(_) |      |  __ \\              | |          \r\n"
						+ " | |__   _| | ___  | |__) |___  __ _  __| | ___ _ __ \r\n"
						+ " |  __| | | |/ _ \\ |  _  // _ \\/ _` |/ _` |/ _ \\ '__|\r\n"
						+ " | |    | | |  __/ | | \\ \\  __/ (_| | (_| |  __/ |   \r\n"
						+ " |_|    |_|_|\\___| |_|  \\_\\___|\\__,_|\\__,_|\\___|_|   \r\n"
						+ "                                                     \r\n"
						+ "                                                     \r\n"
						+ "\r\n"
						+ "\r\n"
						+ "[GET] /filereader takes in one parameter"
						+ "\r\n"
						+ " URL: /filereader/showfile"
						+ "\r\n"
						+ "This application shows a random picture when run.";

		return infoText;
	}
	
	private String rpsDoc() 
	{
		String infoText = 
						"\r\n"
						+ "  _____            _        _____                         _____      _                    \r\n"
						+ " |  __ \\          | |      |  __ \\                       / ____|    (_)                   \r\n"
						+ " | |__) |___   ___| | __   | |__) |_ _ _ __   ___ _ __  | (___   ___ _ ___ ___  ___  _ __ \r\n"
						+ " |  _  // _ \\ / __| |/ /   |  ___/ _` | '_ \\ / _ \\ '__|  \\___ \\ / __| / __/ __|/ _ \\| '__|\r\n"
						+ " | | \\ \\ (_) | (__|   < _  | |  | (_| | |_) |  __/ |_    ____) | (__| \\__ \\__ \\ (_) | |   \r\n"
						+ " |_|  \\_\\___/ \\___|_|\\_( ) |_|   \\__,_| .__/ \\___|_( )  |_____/ \\___|_|___/___/\\___/|_|   \r\n"
						+ "                       |/             | |          |/                                     \r\n"
						+ "                                      |_|                                                 \r\n"
						+ "" 
						+ "\r\n"
						+ " URL: /rps/[playerMove]"
						+ "\r\n" 
						+ " /rps [GET] takes in one parameter. ";
		
		return infoText;
	}
	
	private String errorDoc() 
	{
		String infoText = 
						"\r\n"
						+ "  ______                     \r\n"
						+ " |  ____|                    \r\n"
						+ " | |__   _ __ _ __ ___  _ __ \r\n"
						+ " |  __| | '__| '__/ _ \\| '__|\r\n"
						+ " | |____| |  | | | (_) | |   \r\n"
						+ " |______|_|  |_|  \\___/|_|   \r\n"
						+ "                             \r\n"
						+ "                             \r\n"
						+ "\r\n"
						+ "\r\n"
						+ "You are tryin to acces an unsupported URL"
						+ "\r\n" 
						+ "Please read the API documentation at:"
						+ "\r\n"
						+ "www.danielsAPIdocumentation.nu";
		
		return infoText;
	}
	
	public String rootInfo() 
	{
		return rootDoc();
	}
	public String calcInfo() 
	{
		return calcDoc();
	}
	public String rspInfo() 
	{
		return rpsDoc();
	}
	public String imageInfo() 
	{
		return imageDoc();
	}
	public String fileReaderInfo() 
	{
		return fileReaderDoc();
	}
	public String errorInfo() 
	{
		return errorDoc();
	}
}
