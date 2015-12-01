package org.web;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Tericon {

    private static final String END_PAGINATION = "<!--END PAGINATION-->";
    private static final String END_PAGINATION2 = "<!-- Pagination";
	
    //final static String adress = "http://libstation.ru/Detail/ChapterView?BookID=24&ChapID=51&Page=1#chapterRead";

    
    public static void main(String[] args) throws IOException {
        
    	File file = new File("/home/ablinov/popados5_2.html");
    	file.createNewFile();
    	FileWriter writer = new FileWriter(file);
    	
    	URL url = new URL("http://libstation.ru/Account/Login?UserName=spacer&Password=aleks01&amp;");
    	//URLConnection con = url.openConnection();
    	//con.connect();
    	
    	HttpURLConnection con = (HttpURLConnection)url.openConnection();
    	con.connect();
    	//String cookie = con.getHeaderField("Set-Cookie");
    	List<String> cookies = con.getHeaderFields().get("Set-Cookie");
    	con.disconnect();
    	
    	
    	
        for (int index = 1; index <= 1; index++) { //46
			String page = loadPage(cookies, index);
			writer.write(page + "<div>Next Page</div>");
		}
        
        writer.flush();
        
    }
    
    private static String loadPage(List<String> cookies, int number) throws IOException {
    	//URL url = new URL("http://libstation.ru/Detail/ChapterView?BookID=24&ChapID=51&Page=" + number + "#chapterRead");
    	
    	URL url = new URL("http://libstation.ru/Detail/ChapterView?BookID=24&ChapID=52&Page=" + number + "#chapterRead");
    	
    	HttpURLConnection con = (HttpURLConnection)url.openConnection();
    	con.disconnect();
    	
    	for (String cookie : cookies) {
    	    con.addRequestProperty("Cookie", cookie);
    	}
    	
    	con.connect();
    	
    	String s1 = con.getHeaderField("Set-Cookie");
    	String s2 = con.getHeaderField("Cookie");
    	
        InputStream is = con.getInputStream();
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        copy(is, out);
        is.close();
        String html = out.toString();
        
        int start = html.indexOf(END_PAGINATION, 0);
        int end   = html.indexOf(END_PAGINATION2, start + 1);
        
        return html.substring(start + END_PAGINATION.length(), end);
    }
    
    private static void copy(InputStream is, OutputStream os) throws IOException {
        byte[] buff = new byte[2048];
        int size;

        while ((size = is.read(buff)) > 0) {
        	os.write(buff, 0, size);
        }

        os.flush();
    }
    
}