package com.hitoo.config;

public class ConfigFilePath {
	private static final boolean isProject = true;
	
	public static String COMMON_PARAMETER_FILE_PATH ;
	public static String COMMON_PARA_FILE_OUT_PATH;
	//filePath.properties文件位置
	public static String FILEPATH_PROPERTIES_FILE_PATH;
	//client_paramter.properties文件位置
	public static String CLIENT_PARAMTER_FILE_PATH;
	
	private static final String UI_PROJECT_PATH = "/home/xsh/eclipse-workspace/autocode-parent/autocode-ui/";
	private static final String PROJ_COMMON_PARAMETER_FILE_PATH = UI_PROJECT_PATH+"src/main/resources/common-parameter.xml";
	private static final String PROJ_COMMON_PARA_FILE_OUT_PATH = UI_PROJECT_PATH+"src/main/resources/common-parameter.xml";
	private static final String PROJ_CLIENT_PARAMTER_FILE_PATH = "classpath:client_paramter.properties";
	private static final String PROJ_FILEPATH_PROPERTIES_FILE_PATH = "classpath:filePath.properties";
	
	

	static {
		if(isProject) {
			COMMON_PARAMETER_FILE_PATH = PROJ_COMMON_PARAMETER_FILE_PATH;
			COMMON_PARA_FILE_OUT_PATH = PROJ_COMMON_PARA_FILE_OUT_PATH;
			FILEPATH_PROPERTIES_FILE_PATH = PROJ_FILEPATH_PROPERTIES_FILE_PATH;
			CLIENT_PARAMTER_FILE_PATH = PROJ_CLIENT_PARAMTER_FILE_PATH;
		}else {
			
		}
	}
}