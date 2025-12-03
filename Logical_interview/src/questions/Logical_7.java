package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Logical_7 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("SHiVaM");
		list.add("kArAd");
		list.add("SHiVKaNYa");
		list.add("wElcOmE tO rAmEshwAr");
		
		list.stream()
		.map(new Converter10())
		.forEach((i)->{System.out.println(i);});
		
	}

}
class Converter10 implements Function<String,String>{

	@Override
	public String apply(String str) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
			{
				sb.append(Character.valueOf(str.charAt(i)).toString().toUpperCase());
			}
			else if(str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U') 
			{
				sb.append(Character.valueOf(str.charAt(i)).toString().toLowerCase());
			}
			else
			{
			    sb.append(str.charAt(i));	
			}
			
		}
		return sb.toString();
	}
}
	
