package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class JavaClass {
public static void main(String[] args) throws IOException {
	
	
	File f =  new File("D:\\images\\Ing.txt");
	FileUtils.write(f, "testing");
	
}
}
