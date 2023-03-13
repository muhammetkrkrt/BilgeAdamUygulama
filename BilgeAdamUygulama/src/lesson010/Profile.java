package lesson010;

import java.util.Arrays;

public class Profile {

	     //post olusturma metodu
		//profilIsminiGuncelle method
		//gelen istegi kabul et
	public String userName ;
	public String name;
	public String photo;
	public int takipciSayisi;
	public int takipSayisi;
	public boolean maviTik;
	public String[] posts = new String[10];
	public int postSayisi = posts.length;
	
	
	public String postOlustur(String posts) {
	  String metin = name + "Post olusturuldu/";
	  this.posts[0] = posts ;
	  
	  return metin ;
	}
	public  void profilIsminiGuncelle(String name) {
	       this.name = name ;
	      
	}
	public  void gelenIstegiKabulEt( ) {
		 this.takipciSayisi += 1 ;
		 maviTik();
	}
	public  void kullaniciSil( ) {
		 this.takipciSayisi -= 1 ;
		 maviTik();
	}
	private boolean maviTik() {
		if(this.takipciSayisi > 5) {
	      this.maviTik = true ;
		}else {
			this.maviTik = false ;
		}
		return this.maviTik ;
	}

	public String bilgileriGoster() {
		return "Profile [name=" + name + ", takipciSayisi="
				+ takipciSayisi +  ", maviTik=" + maviTik +  ", postSayisi=" + postSayisi + "]";
	}
	
	
	
	
}
