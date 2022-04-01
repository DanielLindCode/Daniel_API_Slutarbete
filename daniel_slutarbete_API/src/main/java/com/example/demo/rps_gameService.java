package com.example.demo;

import java.util.Random;

public class rps_gameService {

	rpsMatchBean match = new rpsMatchBean();
	
	public String rpsGame(String playerMove) 
	{
		String[] rps = { "rock", "paper", "scissors" };
		String computerMove = rps[new Random().nextInt(rps.length)];

		if (playerMove.equals(computerMove)) 
		{
			match.addResult("tie");

			return "PLAYER: " + playerMove + "\r\n" + "COMPUTER: " + computerMove + "\r\n" + "THE GAME WAS A TIE!";

		} else if (playerMove.equals("rock")) 
		{
			if (computerMove.equals("paper")) 
			{
				match.addResult("loss");

				return "PLAYER: " + playerMove + "\r\n" + "COMPUTER: " + computerMove + "\r\n" + "YOU LOSE!";

			} else if (computerMove.equals("scissors")) 
			{
				match.addResult("win");

				return "PLAYER: " + playerMove + "\r\n" + "COMPUTER: " + computerMove + "\r\n" + "YOU WIN!";
			}
		} else if (playerMove.equals("paper")) 
		{
			if (computerMove.equals("rock")) 
			{
				match.addResult("win");

				return "PLAYER: " + playerMove + "\r\n" + "COMPUTER: " + computerMove + "\r\n" + "YOU WIN!";

			} else if (computerMove.equals("scissors")) 
			{
				match.addResult("loss");

				return "PLAYER: " + playerMove + "\r\n" + "COMPUTER: " + computerMove + "\r\n" + "YOU LOSE!";
			}
		} else if (playerMove.equals("scissors")) 
		{
			if (computerMove.equals("paper")) 
			{
				match.addResult("win");

				return "PLAYER: " + playerMove + "\r\n" + "COMPUTER: " + computerMove + "\r\n" + "YOU WIN!";

			} else if (computerMove.equals("rock")) 
			{
				match.addResult("loss");

				return "PLAYER: " + playerMove + "\r\n" + "COMPUTER: " + computerMove + "\r\n" + "YOU LOSE!";
			}
		}
		return "Failure! Please check your inputs!";
	}

	public String showMatches() 
	{
		String result = "";

		result += match.toJsonString() + ",";

		if (result.length() > 2) 
		{
			result = result.substring(0, result.length() - 1);
		}

		result = "{ \"Games\":  [" + result + "] }";

		return result;
	}
}
