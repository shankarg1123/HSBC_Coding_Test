package com.test;

import java.io.*;
import java.util.*;
  
public class LineReverse { 

public static String reversString(String str){
     StringBuilder sb = new StringBuilder();
     //System.out.println("Input String : "+str);
try {
   if(str==null)
   throw new IllegalArgumentException("String is null");
   char[] chars = str.toCharArray();
   for(int i = chars.length -1; i >=0; i--){
    sb.append(chars[i]);
   }
} catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
}
//System.out.println("In Revers String Method : "+sb.toString());
    return sb.toString();
}
public static void main(String[] args) throws IOException { 
  File inputFile = new File("DataFile.txt"); 
  File outputFile = new File("ReverseDataFile.txt");
   
  FileReader in = new FileReader(inputFile);
  FileWriter out = new FileWriter(outputFile);
  
  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile)));
  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile)));
  ArrayList al = new ArrayList(0);
  String s = "";
  while ((s = br.readLine()) !=null) {
al.add(s);
}
  String lines[] = new String[al.size()];
 
  for (int j = (lines.length - 1); j >= 0; j--) {
  lines[j] = (String)al.get(al.size()-(j+1));
//System.out.println(lines[j]);
}
for (int j = (lines.length-1); j >= 0; j--) {
System.out.println("Revers : "+reversString(lines[j]));
  bw.write(reversString(lines[j]));
  bw.write ("\n");
}
bw.flush();
bw.close();
}
}
