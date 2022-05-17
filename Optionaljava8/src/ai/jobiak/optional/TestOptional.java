package ai.jobiak.optional;
import java.util.Optional;

public class TestOptional {
	
	static void method(String input) {
		if(input!=null)
		System.out.println(input.length());
	}

	public static void main(String[] args) {
		
		
		String str=null;
		//System.out.println(str.length());
		String str2 = new String("hello");
		//System.out.println(str2.length());
		///  method(str);
		
		//Optional optional1 = Optional.of(str);
		//Optional optional1 = Optional.of(str2);
		//System.out.println(optional1.get());
		
	//	Optional optional = Optional.ofNullable(str);
		//System.out.println(optional1.get());
		
		
		//Optional optional1 = Optional.ofNullable(str2);
		//	if(optional1.isPresent())
			//	System.out.println(optional1.get());
		
			
    	Optional optional1= Optional.ofNullable(str);
    	System.out.println(optional1.orElse("Alternate String"));
    	
    	
    	Optional optional2= Optional.ofNullable(str2);
    	System.out.println(optional2.orElse("Alternate String"));
		
		
	}

}
