import java.io.*;

/**
*	Project Name : Internet Chat
*	Program Name : Message.java
*   Author       : Munshi Riaz 
**/

public class Message implements Serializable
{
	//Message Types and their Semantics
    //WHOIS   to receive a list of users connected to the server
	//MESSAGE an ordinary message 
	//LOGOUT  to disconnect from the Server
	
	static final int WHOIS = 0,MESSAGE = 1,LOGOUT =2;
	private int type;
	private String message;
	
	//constructor
	Message(int type,String message)
	{
		this.type = type;
		this.message = message;
	}
		
	int getType()	
	{
		return type;
	}
	
	String getMessage()
	{
		return message;
	}
}