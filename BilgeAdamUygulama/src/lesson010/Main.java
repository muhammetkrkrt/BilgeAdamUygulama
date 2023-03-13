package lesson010;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Profile profil1 = new Profile();
		profil1.photo = "resim.png";
		profil1.name = "Ahmet";
		profil1.userName ="ahmet123";
		System.out.println(profil1.name);
		
		profil1.profilIsminiGuncelle("Muhammet");
		System.out.println(profil1.name);
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.gelenIstegiKabulEt();
		profil1.posts[0] = "resim3";
		profil1.posts[1] = "resim1";
		profil1.posts[2] = "resim2";
		profil1.posts[3] = "resim4";
		profil1.posts[4] = "resim5";
		
		System.out.println(profil1.bilgileriGoster());
		
		for (int i = 0; i < profil1.posts.length; i++) {
			System.out.println((i+1) + ". post  " + profil1.posts[i]);
		}
	}

}
