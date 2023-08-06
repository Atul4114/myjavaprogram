package atul;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("Welcoem to java");
           int a,b,c;
           a=10;
           b=20;
           c=30;
           System.out.println(+a);
        
           // sirthmstc opertators
           System.out.println("sum of numbers:"+(a+b));
           System.out.println("diff of numbers:"+(a-b));
           System.out.println("div of numbers:"+(a/b));
           System.out.println("mul of numbers:"+(a*b));
           System.out.println("sum of numbers:"+(a%b));
        
           
           // Resltion comparison operators <= , >=, ==, <, >, !=
           //  operator returns boolean values (true or false)
           System.out.println(a>b);
           System.out.println(a<b);
           a=20;
           System.out.println(a==b);
           System.out.println(a!=b);
           System.out.println(a>=b);
           System.out.println(a<=b);
       
           // Logical operator and or not &&, ||, ! use between two or more  boolean values (true and false)
           //always return boolean values
           boolean x=true, y=true;
           System.out.println(x&&y);//true
           System.out.println(x||y);//true
           System.out.println(!x);//false
           
           boolean b1=10>20;//false
           boolean b2=20>10;//true
           System.out.println(b1 && b2); //AND false
           System.out.println(b1 || b2); //OR  true
           
           
           // increment operator ++,post and pre increment
           // post
           int h=10;
           // h=h+1;
           // Sceanrio 1 there is no difference
           //  ++h; //pre
          // h++; //post  
           //System.out.println(+h); //11
           
           //Scenario 2 
           int respost =h++; // h value assign to repost and then do increment so h value =11
           System.out.println(respost);
           int respre =++h; // h value first make increment and then assign to respre =12 
           System.out.println(respre);
           
           // Decrement operator Scenario 1
           int g=20;
          // g--;
           //System.out.println(g); //19
         //  --g;
          // System.out.println(g); //19
           
           //Scenario 2
           
          // int decpre=--g;
         //  System.out.println(decpre);
          // System.out.println(g);
           
           int decpost=g--;
           System.out.println(decpost);
           System.out.println(g);
           
           
           // Assignment operator =, +=, -=, *=, /=, %=
           
           // increment more values += 
           int q=10;
           q+=5;
           System.out.println(q);
           
           
           
           // decfeemnt more values -=
           
           
           
           // Conditonal opertator 
           // var=exp ? result 1 : result 2;
           int m=100, n=200, p;
           p= m>n? m: n;
           System.out.println(p);
            
            
            
           
           
           
	}

}
