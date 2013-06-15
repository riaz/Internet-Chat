import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
*	Project Name : Internet Chat
*	Program Name : Server.java
*   Author       : Munshi Riaz 
**/

public class Server{

	//an unique id for each connection
	private static int uniqueId;
	
	//an arraylist for keep a list of clients
	private ArrayList<ClientThread> al;
	
	//if in server GUI mode
	private ServerGUI sg;
	
	//to display time
	private SimpleTimeFormat sdf;
	
	//port number to listen to client
	private int port;
	
	//server stop flag
	private boolean halt;
	
	//constructor 1
	public Server(int port){
		this(port,null);
	}
	
	//constructor 2
	public Server(int port;ServerGUI sg)
	{
		//GUI or not;
		this.sg = sg;
		//the port
		this.port = port;
		//to display hh:mm:ss
		sdf = new SimpleDateFormat("HH:mm:ss");
		
		//ArrayList for the Client List
		al = new ArrayList<Client Thread>();
	}
	
	//thread entry point
	public void start()	{
		stop = false;
		/* create server sockets and wait for connection requests */
		try
		{
			//the socket used by the server
			ServerSocket serverSocket = new ServerSocket(port);
			
			Socket socket = serverSocket.accept(); //accept connection
			
			

	}