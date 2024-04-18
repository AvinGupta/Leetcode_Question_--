import java.util.*;
public class Main
{
    public static int avn(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[i]<arr[stk.peek()]){
                stk.pop();
            }
            stk.push(i);
            ans+=stk.size();
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sze=sc.nextInt();
		int[] arr=new int[sze];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		int ans=avn(arr);
		System.out.print(ans);
		sc.close();
	}
}
