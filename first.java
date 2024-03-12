class First {
   
	public static void main(String[] args) {
	
	  int num = 1234;
	  int rev = 0;
	  for(;num!=0;){
	      
                 int num1 = num%10;
		 rev = rev*10 + num1;
		  num = num/10;
	  }

	System.out.println(rev);  
	}
}
