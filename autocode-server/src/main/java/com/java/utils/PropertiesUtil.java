package com.java.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesUtil {
	public final static String PARAMTER_PATH="../../../paramter.properties";
	
	static Properties p=null;
	static InputStream in=null;
	
	public static String getValue(String path,String key){
	    p=new Properties();
		in=new PropertiesUtil().getClass().getResourceAsStream(path);
		
		try {
			p.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p.getProperty(key);
	}
	
	/**
	 * 设置对应properties中对应键名的值
	 * @param name properties文件名
	 * @param key  键名
	 * @param value 键值
	 * @return
	 * @throws Exception 
	 */
	public static String setValue(String name,String key,String value) throws Exception{
		Properties p=new Properties();
		InputStream in=new PropertiesUtil().getClass().getResourceAsStream(name);
		//从输入流中读取属性列表（键和元素对） 
		 p.load(in);
		//调用 Hashtable 的方法 put。使用 getProperty 方法提供并行性。  
		//强制要求为属性的键和值使用字符串。返回值是 Hashtable 调用 put 的结果。
		 String outPath=new PropertiesUtil().getClass().getResource(name).getPath();
		OutputStream out = new FileOutputStream(outPath);
		p.setProperty(key, value);
		//以适合使用 load 方法加载到 Properties 表中的格式，  
		//将此 Properties 表中的属性列表（键和元素对）写入输出流  
		p.store(out, "Update " + key + " name");
		return value;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(PropertiesUtil.getValue(PropertiesUtil.PARAMTER_PATH, "esurl"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
