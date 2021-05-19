class ArrayDemo{
	
	public static void main(String []args){
		
		int evenNumbers[] = {2, 4, 6, 8, 10, 12, 14};
		System.out.println(evenNumbers[6]);
		
		System.out.println("Size of evenNumbers " +evenNumbers.length);
		
		int oddNumbers[] = new int[10];
		System.out.println("Size of oddNumbers " +oddNumbers.length);
		System.out.println(oddNumbers[0]);
		oddNumbers[0]=1;
		
		for(int i=0; i<evenNumbers.length; i++){
			
			System.out.println(evenNumbers[i]);
		}
	}
}