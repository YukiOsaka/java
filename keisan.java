class keisan {
    public static void main(String args[])
	{
	   // nyuu ryoku : 2tsu no suuchi wo nyuu ryoku
	   int in0 = new java.util.Scanner(System.in).nextInt();
       int in1 = new java.util.Scanner(System.in).nextInt();
       System.out.println(in0+","+in1);
	   // syori : tashizan
	   int add = in0+in1;
	   // syori : hikizan
	   int sub = in0-in1;
	   // syori : kakezan
	   int mul = in0*in1;
	   // syori : warizan
	   int div = in0/in1;
	   // syori : amari
	   int rem = in0%in1;
	   
	   // keisan kekka wo syutu ryoku
	   System.out.println("tasizan:"+add);
	   System.out.println("hikizan:"+sub);
	   System.out.println("kakezan:"+mul);
	   System.out.println("warizan:"+div);
	   System.out.println("amari:"+rem);
	}
}