 import java.util.*;
 
 class product
  	{
  		int code;
  		String name;
  		int price; 
  		product(int pcode,String pname,int pprice)
  		 {
			this.code=pcode;
			this.name=pname;
			this.price=pprice;
		 }		
	}
 class productmain
  	{
  		public static void main(String args[])
  		 {
  		 	product rtx= new product(1,"hari",1000);
  		 	product gtx=new product(2,"Ram",11111);
  		 	product gt=new product(3,"Mam",111111);
  		 	if(rtx.price<gtx.price && rtx.price<gt.price)
  		 		{
  		 			System.out.println("Product with lowest price:"+rtx.name);
  		 		}
  		 	else if(gtx.price<rtx.price && gtx.price<gt.price)
  		 		{
  		 			System.out.println("Product with lowest price:"+gtx.name);
  		 		}
  		 		
  		 	else 
  		 		{
  		 			System.out.println("Product with lowest price:"+gt.name);
  		 			
  		 		}
  		 }
  	}
