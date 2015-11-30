package org.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Tericon {

    final static String adress = "http://libstation.ru/Detail/ChapterView?BookID=24&ChapID=51&Page=1#chapterRead";

    
    public static void main(String[] args) throws IOException {
        
        URL url = new URL(adress);
        
        System.out.println(url);
        
        InputStream is = url.openStream();
        
        System.out.println(is.available());
        
        //StringReader sr = new StringReader(is);
        
    }
    
}