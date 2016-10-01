import java.net.*; 
import java.io.*; 
import java.util.*;
public class test { 

	public static void main(String[] args) throws Exception { 
		try { 

			Socket socket = new Socket("www.antel.com",80); 

			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))); 
			out.println("GET /index.html HTTP/1.0"); 
			out.println(); 
			out.flush(); 

			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 

			String inputLine; 
			int count = 0; 

			while ((inputLine = in.readLine()) != null) { 
			count++; 
			System.out.println(count); 
			System.out.println(inputLine); 
			} 

			in.close(); 
			System.out.println("PRINTING HERE!!!"); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 
}
