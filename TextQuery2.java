//输入一个字符串query，匹配test中的字符，求出
//query中连续出现在test中最长的字符的个数
//TextQuery1的简化一点的版本
import java.util.*;
class Query{
//l1是query，是小的。l2是test 大的
	public static int Check(String str1,String str2){
		int l1 = str1.length();
		int l2  = str2.length();
		int a[][] = new int[l2][l1];
		for(int i=0;i<l2;i++){//先循环行
			for(int j=0;j<l1;j++){//循环列
				if(str2.charAt(i)==str1.charAt(j)){
					a[i][j] = 1;
				}
			}
		}
		System.out.println("\na array--->: ");
		print2(a);
		int max = 0;	
		for(int i=l1-1;i>=0;i--){
			int temp = 0;//注意它的位置！！！！！！！
			int k = i;//也注意它的位置！！！！！！！
			for(int j=0;j<l1-i;j++){
				if(k<l1 && a[j][k] == 1) {
					temp ++;
					k++;
				}else{
					if(temp>max){
						max = temp;
					}
				}					
			}	
		}
		for(int i=1;i<l2;i++){
			int w = l2-i>=l1?l1-1:l2-i;
			int temp = 0;
			int k = i;
			for(int j=0;j<=w;j++){
				if(k<l2 && a[k][j]==1){
					temp ++;
					k ++;
				}else{
					if(temp>max){
						max = temp;
					}
				}	
			}
		}
		return max;
	}
	public static void print2(int k[][]){
		for(int i=0;i<k.length;i++){//外层循环行
			for(int j=0;j<k[i].length;j++){
				System.out.print("a"+i+j+ " = " + k[i][j] + ",");
			}
			System.out.println();
		}
	}
	public static void print3(String k){
		System.out.println("\ninput array--->");
		for(int i=0;i<k.length();i++){
			System.out.print(k.charAt(i) + ",");
		}
	}
};
public class TextQuery2{
	public static void main(String args[]){
		Query t = new Query();
		String str1 = "acbac";
		t.print3(str1);
		String str2 = "acaccbabb";
		t.print3(str2);
		System.out.println("\nlongest query--->" + t.Check(str1,str2));
		
	}
};