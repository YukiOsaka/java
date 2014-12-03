class lucas {
    
	import java.util.BigInteger;
	import java.io.*;
	
	public static void main(String args[])
	{
	    //lucas suuretsu(0~100 kou made sansyutsu site, goukei wo hyouzi)
		BigInteger lucas = new BigInteger("0");
		////hairetu no suuchi
		BigInteger [] F = new BigInteger[101];
		////0 koumoku no syokika
		F[0] = new BigInteger("2");
		////1 koumoku no syokika
		F[1] = new BigInteger("1");
		////2~10 kou no keisan
		////2~10 made no ru-pu wo for bun de kaku
		//public static void main(String[] args); {
        //   int max = 99;
        for(int i=2; i<=100; i++){
		// yaritai koto n = n ; one;
           F[i] = F[i-1].add(F[i-2]);
		   
		   lucas = lucas + F[i];
		   
		   System.out.println(lucas);
        }
        //}
		
		////for (BigInteger n=2 ; n<=100 ; n++) {
		////     F[n] = F[n-1] + F[n-2];
		////	 //sansyutsu sita atai wo goukei suru
		////	 lucas = lucas + F[n];
		////	 //tashita atai wo hyouzi
		//// System.out.println(BigInteger.MAX_VALUE);
	    //}
		//// 1~10 kou made wo hyouji
		////for (int n=1 ; n<=10 ; n++) {
		    //// System.out.println(F[n]);
		////}
		
	
	
	
	
	    ////for (int i=5 ; i<=8 ; i++) {
        ////System.out.println(i);
        ////}
        ////int [] hai = new int[10];
        ////hai[0] = 0;
        ////hai[1] = 10;
        ////hai[2] = 100;
        ////System.out.println(hai[0]+","+hai[1]+","+hai[2]);
        ////for (int i=0 ; i<=9 ; i++) {
        ////hai[i] = i*2;
        ////}
        ////for (int i=0 ; i<=9 ; i++) {
        ////System.out.println(hai[i]);
        ////}
	}
}