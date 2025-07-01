class Netflix{

	static String  movie1 = "kgf";
	static String  movie2 = "kantara";
	static String  movie3 = "kiccha";


		
	static String []    kannadaMovies ={movie1,movie2,movie3,"ulidavaru kandante","kariya","om","premaloka","sp sangliyana","sahasa simha","bangarada manushya"};
	/*static String []	tamilMovies  ={"asuran","master","bigil","autoraja","maari","dragon","karnan","vada chennai","mahaan","raayan"};
	static String []	teluguMovies ={"RRR","bahubali","pushpa","guntur kaaram","surya","Dj","hit","saripodha sanivaram",dasara",sarrainudu"};
	static String []	malayalamMovies={"marco","Arm","salute","kali","kurup","king of kotha","lucky baskar",sitaramam",charlie","o kadhal"};
	static String []	hindiMovies ={"chhaava","sam bahadur","sardar udham","3 ediots","sanju","dangal","lagaan","sikandar","pathan"}; */

   public static void main(String args[]){
   
   System.out.println("kannada Movies are");
   
   for( String kannadaMovie : kannadaMovies ){
   System.out.println(kannadaMovie);
   }
   
		
}
}
