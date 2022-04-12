package com.confiruration.reader;

import java.io.IOException;

public class File_reader_manager {
	
	 private File_reader_manager() {
		
	}
	 public static  File_reader_manager get_instance_FRM() {
		 File_reader_manager frm=new File_reader_manager();
		 return frm;
		
	}

	public Configuration_data get_instance_CD() throws Throwable {
		Configuration_data cd=new Configuration_data();
		return cd;
	}
}
