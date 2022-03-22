class Rectangle{
			int l,b;
			Rectangle(int length,int breadth)
			{
			 	this.l=length;
			 	this.b=breadth;
			}
	public static void main(String args[]){
			Rectangle r1=new Rectangle(2,2);
			Rectangle r2=new Rectangle(4,4);
			int a1=r1.l*r1.b;
			int a2=r2.l*r2.b;
			System.out.println("Area 1:"+a1+"Area2:"+a2);
				
	}
}


