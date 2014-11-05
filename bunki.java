class bunki {
    public static void main(String args[])
	{
	   // kotae
	   int kotae = 0;
	   // nyuu ryoku : suuchi1,kigou,suuchi2 no junban ni nyuu ryoku
	   System.out.print("suuchi1=");
	   int in0 = new java.util.Scanner(System.in).nextInt();
	   System.out.print("tashizan(+)、hikizan(-)、kakezan(*)、warizan(/)、amari(%)no doreka=");
	   // string gata no hennsuu kigou ni, jouki no kigou wo nyuu ryoku
	   String kigou = new java.util.Scanner(System.in).nextLine();
	   System.out.print("suuchi2=");
       int in1 = new java.util.Scanner(System.in).nextInt();
     
	   // syori : kigou ni ouzite keisan
	   // hinto : kigou ga + ka douka no if bun ha ika no toori
	   //   if (kigou.equals("+"))
	   if (kigou.equals("+"))
	      kotae = in0 + in1;
       if (kigou.equals("-"))
	      kotae = in0 - in1;
	   if (kigou.equals("*"))
	      kotae = in0 * in1;
       if (kigou.equals("/"))
	      kotae = in0 / in1;
	   if (kigou.equals("%"))
	      kotae = in0 % in1;  
	   // syutsu ryoku : keisan kekka wo syutsu ryoku
	   // [suuchi1 keisankigou suuchi2 = kotae]
	   System.out.println("" + in0 + kigou + in1 + "=" + kotae);
	}
}