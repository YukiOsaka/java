class lucas {
    public static void main(String args[])
	{
	    //lucas suuretsu(0~100 kou made sansyutsu site, goukei wo hyouzi)
		int lucas = 0;
		////hairetu no suuchi
		int [] F = new int[101];
		////0 koumoku no syokika
		F[0] = 2;
		////1 koumoku no syokika
		F[1] = 1;
		////2~10 kou no keisan
		////2~10 made no ru-pu wo for bun de kaku
		for (int n=2 ; n<=100 ; n++) {
		     F[n] = F[n-1] + F[n-2];
			 //sansyutsu sita atai wo goukei suru
			 lucas = lucas + F[n];
			 //tashita atai wo hyouzi
			 System.out.println(integer.MAX_VALUE);
		}
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