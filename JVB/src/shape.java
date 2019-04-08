
 class shape {
	 void draw()
	 {
		 System.out.println("This is a shape");
	 }

	 class circle extends shape
	 {
		 void draw()
		 {
			 System.out.println("This is a circle inherited from shape");
		 }
	 }
	 class rectangle extends shape
	 {
		 void draw()
		 {
			 System.out.println("This is a rectangle inherited from shape");
		 }
	 }
 

		public static void main(String[] args) {
			shape s;
			s=new shape();
	        s.draw();


		}	 
 }



