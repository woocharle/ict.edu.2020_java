package com.ict.edu01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null; 
		String filepath = "c:" + File.separator + "study" + File.separator + "util" + 
				File.separator + "01_java"  + File.separator + "99_Practice_Network" + File.separator + "���ó���.txt";
		File file = new File(filepath);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		
		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection urlc = url.openConnection();
			br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			
			//sb�� �����ϴ� ���� �б�
			InputSource is = new InputSource(new StringReader(sb.toString()));
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(is);
						
			
			// ���Ϸ� �����ϱ�
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			
			//���ϴ� �±׸� ã��.
			StringBuffer sb2 = new StringBuffer();
			NodeList locals = document.getElementsByTagName("local");
			for (int i = 0; i < locals.getLength(); i++) {
				String txt = locals.item(i).getFirstChild().getNodeValue();
				System.out.print(txt + "  ");
				
				// �±�(Element) �Ӽ�(attribute)
				String att1 = ((Element)(locals.item(i))).getAttribute("desc");
				String att2 = ((Element)(locals.item(i))).getAttribute("ta ");
				
				System.out.println(att1 + "\t\t" + att2);
				
				sb2.append(txt + "\t");
				sb2.append(att1 + "\t");
				sb2.append(att2 + "\n");
				
				
			}
			
			bw.write(sb2.toString());
			
			
			//System.out.println(document.toString());

		} catch (Exception e) {
			
			
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				
			} catch (Exception e2) {
				
			}
		}
	}
	
	
}