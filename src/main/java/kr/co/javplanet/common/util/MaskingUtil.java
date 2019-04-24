package kr.co.javplanet.common.util;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaskingUtil {
	public static void main(String[] args) {
		System.out.println(maskingIp("192.168.0.1"));
	}
	
	public static String maskingPhoneNum(String str) {
		String replaceString = str;
		
		Matcher matcher = Pattern.compile("^(\\d{3})-?(\\d{3,4})-?(\\d{4})$").matcher(str);
	
		if(matcher.matches()) {
			replaceString = "";
			
			boolean isHyphen = false;
			if(str.indexOf("-") > -1) {
				isHyphen = true;
			}
			
			for(int i=1;i<=matcher.groupCount();i++) {
				String replaceTarget = matcher.group(i);
				if(i == 2) {
					char[] c = new char[replaceTarget.length()];
					Arrays.fill(c, '*');
					
					replaceString = replaceString + String.valueOf(c);	
				} else {
					replaceString = replaceString + replaceTarget;
				}
				
				if(isHyphen && i < matcher.groupCount()) {
					replaceString = replaceString + "-";
				}
			}
		}
		
		return replaceString;
	}
	
	public static String maskingName(String str) {
		String replaceString = str;
		
		String pattern = "";
		if(str.length() == 2) {
			pattern = "^(.)(.+)$";
		} else {
			pattern = "^(.)(.+)(.)$";
		}
		
		Matcher matcher = Pattern.compile(pattern).matcher(str);
	
		if(matcher.matches()) {
			replaceString = "";
			
			for(int i=1;i<=matcher.groupCount();i++) {
				String replaceTarget = matcher.group(i);
				if(i == 2) {
					char[] c = new char[replaceTarget.length()];
					Arrays.fill(c, '*');
					
					replaceString = replaceString + String.valueOf(c);
				} else {
					replaceString = replaceString + replaceTarget;
				}
				
			}
		}
		
		return replaceString;
	}
	
	public static String maskingEmail(String str) {
		String replaceString = str;
		
		Matcher matcher = Pattern.compile("^(..)(.*)([@]{1})(.*)$").matcher(str);
		
		if(matcher.matches()) {
			replaceString = "";
			
			for(int i=1;i<=matcher.groupCount();i++) {
				String replaceTarget = matcher.group(i);
				if(i == 2) {
					char[] c = new char[replaceTarget.length()];
					Arrays.fill(c, '*');
					
					replaceString = replaceString + String.valueOf(c);
				} else {
					replaceString = replaceString + replaceTarget;
				}
			}
			
		}
		
		return replaceString;
	}
	
	public static String maskingIp(String str) {
		if (str == null || str == "") {
			return str;
		}
		
		String replaceString = str;
		Matcher matcher = Pattern.compile("^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$").matcher(str);
		
		if(matcher.matches()) {
			replaceString = "";
			
			for(int i=1;i<=matcher.groupCount();i++) {
				String replaceTarget = matcher.group(i);
				if(i == 3) {
					char[] c = new char[replaceTarget.length()];
					Arrays.fill(c, '*');
					
					replaceString = replaceString + String.valueOf(c);
				} else {
					replaceString = replaceString + replaceTarget;
				}
				if(i < matcher.groupCount()) {
					replaceString =replaceString + "."; 
				}
			}
		}
		
		return replaceString;
	}

}
