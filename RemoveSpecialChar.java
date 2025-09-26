class RemoveSpecialChar{
	public static void main(String arg[]){
		String s= "J#%^&a@&^v&*a/";
		
		//Approach 1
		//By using replaceAll() 
		String planStr=s.replaceAll("[^a-z0-9A-Z]", "");
		System.out.println(planStr);
	}
}
