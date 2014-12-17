    import java.util.Random;
    import java.io.*;

class file {
   public static void main(String args[])
   {
      //0~100 made no ransuu wo 100ko konma kugiri de fairu syutsu ryoku suru.
	  //0~100 made no ransuu wo int gata ni 
	 
	 Random b = new Random();

	 
	try{ 
	File file = new File("tensu.txt");
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    ////PrintWriter pw = new PrintWriter(bw);
	String datas = br.readLine();
	String[] str1Ary = datas.split(" ");
	System.out.println(datas);
	
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
