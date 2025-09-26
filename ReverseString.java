class ReverseString{
	public static void main(String arg[]){
		String str1="Hello";
		
		//Approach 1
		char[] arr=str1.toCharArray();
		for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("");
		
		//Approach 2
		for(int i=str1.length()-1; i>=0; i--){
			System.out.print(str1.charAt(i)+" ");
		}
		
		System.out.println("");
		
		//Approach 3
		StringBuffer sb1=new StringBuffer(str1);
		System.out.print(sb1.reverse());
		
		System.out.println("");
		
		//Approach 4
		StringBuilder sbl=new StringBuilder(str1);
		System.out.print(sbl.reverse());
	}
}

