package com.PropertiesFile;

import java.io.IOException;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public static File_Reader_Manager getinstance() {

		File_Reader_Manager helper = new File_Reader_Manager();
		
		return helper;
	}
	
	public static Configuration_Reader getinstanceCR() throws IOException {

		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}

}
