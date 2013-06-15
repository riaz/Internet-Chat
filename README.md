MyChat  Chat Application - Beta
======================================================================

This is a demo chat application programmed using the Java FrameWork.

Features Used:
----------------
1. Threads
2. Java Sockets
3. Swing

The Chat Application may be run in both console mode or in the GUI mode.

Files:
----------------
Message.java
ServerGUI.java
ClientGUI.java
Server.java
Client.java


Description:
------------------

Class => Message.java

This classes represents the message format that is exchanged between the 
server and the client.Which acts as the protocol for messaging on the either side.

In this class we send a java object as a message, instead of making the Client/Server to typically count bytes and wait for a line-feed, indicating the end of frame.

Note: The Objects sent of the sockets need to be Serializable.



