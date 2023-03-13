package lesson004;

public class Question004 {

	public static void main(String[] args) {
		// elimiizde Java ,SPring,Postgre,React
		
		String list = "Java,Spring,Postgre,React";
		String[] str = list.split(",");
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		
		
		//substring
	    String  stringText ="Java,Spring,Postgre,React";
	    int index=0;
	    for(int i = 0; i <stringText.length(); i++) {
	    	if(stringText.charAt(i) == ',') {
	    		System.out.println(stringText.substring(index , i));
	    		index= i+1;
	    	}
	    	
	    }
	    System.out.println(stringText.substring(index ));
	
	
	
	
	}

}
