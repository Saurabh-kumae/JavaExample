import java.util.List;
import java.util.ArrayList;

public class MoveAllZeroToLast{
	
	public static void main(String[] args){
		
		List<Integer> list = new ArrayList<>();
	    int inputArr[]={10,0,23,56,20,0,40,57,0,36};
		
		int count=0;
		
		for(int data:inputArr){
			if(data!=0){
				list.add(data);
			}else{
				count++;
			}
		}
		for(int i=1;i<=count;i++){
			list.add(0);
		}
		
		Integer outputArray[]= list.toArray(new Integer[list.size()]);
		for(Integer data:outputArray){
			System.out.print(data+" ");
		}
	}
}
