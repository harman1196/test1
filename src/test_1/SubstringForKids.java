package test_1;

public class SubstringForKids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SUBSTRING FOR KIDS");
		
		
		String output=substringForKids(1,1,"harman");
		System.out.println(output);

		String out=substringForKids(1,4,"harman");
		System.out.println(out);

	}
	
	public static String substringForKids(int i,int j,String sentence) {
		String substring ="";
		String invalid ="invalid input";
		for(int a=i;a<=j;a++){
			if (i==j){
				substring=substring+sentence.charAt(a);
				
				
			}
			
			else if(i<j){
				substring=substring+sentence.charAt(a);
				
			}
			
			else if(i>j ||i<0){
				return invalid;
			}
			
			
			
			}
	
		return substring;
	}
	

}
