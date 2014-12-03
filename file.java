class file {

    import java.util.Rundam;
	import java.io.*;

   public static void main(String args[])
   {
      //0~100 made no ransuu wo 100ko konma kugiri de fairu syutsu ryoku suru.
	  //0~100 made no ransuu wo int gata ni 
	 
	 Random b = new Random();
	 int a = b.nextInt(101);
	 System.out.print(a);
	 
	try{ 
	 File file = new File(tensu.txt);
	 FileWriter fw = new FileWriter(file);
	 BufferedWriter bw = new BufferedWriter(fw);
	 PrintWriter pw = new PrintWriter(bw);
	 pw.println(a);
	 pw.close();
	 }catch(Exception e)
	 {
	    System.out.printlm();
	 }
	  
   }
}
