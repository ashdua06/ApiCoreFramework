package com.avis.constants;

import com.avis.reporting.dataObjects.APIStatusTimeDTO;

import java.util.HashMap;
import java.util.Map;

public class AvisConstants {
    //Env variables
    public static String Default_Viewport="";
    public static String Default_environment="qa";
    public static String Default_platform="windows";
    public static String Default_Brand="Avis";
    public static String Default_domain="US";
    public static String Default_language="";
    public static String Default_incognito="";
    public static String Default_browser="";
    public static String Default_UILiteFlag="";


    //Global Variables
    public static String REPORT_BASE_PATH="./Reports/";
    public static boolean FLAG_REMOVE_RETRIEDTESTS=true;
    public static boolean FLAG_UPDATE_SCREENSHOTS=true;
    public static String FILE_NAME_REPORT="AvisPerf.html";
    public static String REPORT_TITLE="AVIS Automation";
    public static Map<String, APIStatusTimeDTO> API_STATUS_TIME_DTOMAP = new HashMap<>();
}
