package phone;

import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

public class MyPhone {

	public static PhoneNumberUtil pUtil = PhoneNumberUtil.getInstance();
	public static final String EMPTY="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number ");
		Scanner in= new Scanner(System.in);
		String inputNumber= in.nextLine();
		PhoneNumber result= convertToE164Number(inputNumber);
		if(result==null)
			System.out.println("Number is invalid");
		else
		{
			System.out.println("Number in International format: "+pUtil.format(result, PhoneNumberFormat.INTERNATIONAL));
			System.out.println("Number in National format: "+pUtil.format(result, PhoneNumberFormat.NATIONAL));
			System.out.println("Number in E164 format: "+pUtil.format(result, PhoneNumberFormat.E164));
		}
		
	}
	
	private static PhoneNumber convertToE164Number(String input){		
		String region = "US";
		PhoneNumber number=null;
		try {
			number= pUtil.parse(input, region);
		} catch (NumberParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		String regex="(?:\\+?1[-. ]?)?\\(?([0-9]{3})\\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})";
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher= pattern.matcher(input);
		if(matcher.matches())
			return input;
		*/
		
		return number;
		
	}

}

