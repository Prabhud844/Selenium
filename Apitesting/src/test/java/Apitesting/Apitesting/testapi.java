package Apitesting.Apitesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;



public class testapi {
	

	public static void main(String[] args) throws IOException {
		
		testapi concex =  new testapi();
		//concex.getmethodex();
		concex.postmethod();
	}
	
	public void getmethodex() throws IOException{
		
		//String 	getlink ="https://gorest.co.in/public/v1/users/46";
		
		String getlink ="http://api.datumbox.com/1.0/AdultContentDetection.json";
		try {
			URL url = new URL(getlink);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
			con.connect();
			int Satatuscode = con.getResponseCode();
			
			System.out.println("Status code" +Satatuscode);
			
			String Message  = con.getResponseMessage();
			System.out.println("Message"+ Message);
			
			InputStream inpstr = con.getInputStream();
			InputStreamReader inpread = new InputStreamReader(inpstr);
			
			BufferedReader bufferred = new BufferedReader(inpread);
			
			String line  = bufferred.readLine();
			StringBuffer  strbuff = new StringBuffer();
			
			while (line != null) {
			strbuff.append(line);
				
			}
		System.out.println(strbuff);
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void  postmethod() throws IOException{
		
		String u = "https://gorest.co.in/public/v1/users";
		URL url = new URL(u);
		HttpURLConnection con =(HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("POST");
		con.setRequestProperty("content-Type", "application/json");
		con.setDoInput(true);
		
		//String jsonbody = "{\"property\" : [\"Sites\"], \"report_type\" : [\"ALL\"]}";
		String jsonbody ="{\"name\":\"prabhu\",\"email\":\"prabhud844@gmail.com\",\"gender\":\"male\",\"status\":\"active\"}";
		byte [] inputJson =jsonbody.getBytes();;
		
		OutputStream outstr =con.getOutputStream();
		
		outstr.write(inputJson);
		System.out.println("Response code "+con.getResponseCode());
		System.out.println("Response code "+con.getResponseMessage());
		
		
		InputStream inpstr = con.getInputStream();
		
		InputStreamReader instrre = new InputStreamReader(inpstr);
		
		BufferedReader buff = new BufferedReader(instrre);
		
		String line = buff.readLine();
		
		StringBuffer  strbuf = new StringBuffer();
		
		while(line!=null){
			strbuf.append(line);
		}
		
		System.out.println(strbuf);
	}

}
