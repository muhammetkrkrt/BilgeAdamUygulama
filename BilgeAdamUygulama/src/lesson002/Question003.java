package lesson002;

import java.util.Scanner;

public class Question003 {

	public static void main(String[] args) {
		// telefona ve maile bir kod gelicek bu kodları biz tanımlayacagız
		//kullanıcıdan maile ve telefona gelen kodu isteyecegiz
		//eğer onun mailine ve telefonuna giden kod uyuşuyorsa
		//sisteme kayıt oldunuz
		//ya maili hatalıdır yada telefonu yada ikiside
		//kullanıcıya bildirecegiz
		
		int mailKod = 125 ;
		int telKod = 456 ;
        
	    Scanner scanner =new Scanner(System.in);
	    
	    System.out.println("lütfen mail'e gelen kodu yazınız:");
	    int kMailKod = scanner.nextInt();
	    System.out.println("lütfen tel'e gelen kodu yazınız:");
	    int kTelKod = scanner.nextInt();
	    
	    if ( mailKod == kMailKod && telKod == kTelKod ) 
	    {
	    	System.out.println("Sisteme Kayıt Oldunuz..");
	    }
	    else if(mailKod == kMailKod && telKod != kTelKod  )
	    {
	    	System.out.println("telefon kodunuz hatalıdır..");
	    }
	    else if((mailKod != kMailKod) && (telKod == kTelKod))
	    {
	    	System.out.println("Mail kodunuz hatalıdır.."); 
	    	}
	    else {
	    	System.out.println("İki kodunuzda hatalıdır..");
	    }

	}

}
