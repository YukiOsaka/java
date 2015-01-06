    import java.util.Random;
    import java.io.*;

class sum {
   public static void main(String args[])
   {
      //0~100 made no ransuu wo 100ko konma kugiri de fairu syutsu ryoku suru.
	  //0~100 made no ransuu wo int gata ni 
	 
	 ////Random b = new Random();

	 
	try{ 
	File file = new File("tensu.csv");
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    ////PrintWriter pw = new PrintWriter(bw);
	String datas = br.readLine();
	String[] str1Ary = datas.split(",");
	int [] idatas=new int[str1Ary.length];
	////bunkatsu sareta mozi retsu no hyouzi
	for(int i=0; i<=str1Ary.length; i++){
	    //idatas[i] ni, str1Ary[i] wo int gata ni kyasuto site dainyuu
		idatas[i]=Integer.valueOf(str1Ary[i]).intValue();

	    System.out.println(str1Ary[i]);
	}
	
	////System.out.println(datas);
	br.close();
	
	//100ko wansuu wo fairu ni kakidasu
	////for(int i=1; i<=100; i++)
	////{
	    //rannsuu wo seisei
	    ////int a = b.nextInt(101);
	    //fairu ni atai wo kakikomu
	    ////System.out.print(a+",");
		//System.out.print(a);
		
		//tasizan...
		
	////}
	 //fairu wo toziru
	 }catch(Exception e)
	 {
	    System.out.println(e.toString());
	 }
   }
}
