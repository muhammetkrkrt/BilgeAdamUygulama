package lesson011;

import java.util.Arrays;

public class Sepet {

	private Product[] products ;
	private int totalprice;
	
	
	
	private  int index =0 ;
		
	
	
	public void sepetiYazdir() {
		System.out.println(toString());
	}

   
	public String toString() {
		return "Sepet [products=" + Arrays.toString(products) + ", totalprice=" + totalprice + "sepette kalan yer"+ (9-index) +"]";
	}



public Sepet(Product[] products, int totalprice) {
		this.products = products;
		this.totalprice = totalprice;
	}



public  Sepet() {
	   this.products = new Product[10];
	   
   }
   


public Product[] getProducts() {
	return products;
}


public void setProducts(Product[] products) {
	this.products = products;
}


public int getTotalprice() {
	return totalprice;
}


public void setTotalprice(int totalprice) {
	this.totalprice = totalprice;
}


public void sepeteUrunEkle(Product product) {
	if(product.getStock()>0) {
	if(index<10) {
	this.products[index] = product ;
	index++;
	this.totalprice += product.getPrice();
	product.setStock(product.getStock()-1);
	if(product.getStock()<=0) {
		product.gosterimdenKaldir(product);
		System.out.println("urun sepete eklendi");
	}
	}else {
		System.out.println("10 dan fazla urun ekleyemezsiniz");
	}}
	else {
		System.out.println("urun stogu bitmistir");
	}
}
public void sepettekiUrunleriYaz() {
	int i = 1 ;
	for (Product product : products) {
		if(product !=  null ) {
			
			System.out.println((i)+ "-" + product.getName());
			i++;
		}
			
	}
	
	
	
}
	   
	   
}
