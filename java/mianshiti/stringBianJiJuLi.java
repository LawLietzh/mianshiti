package mianshiti;


/*
* 字符串 编辑距离
* 首先定义这样一个函数——edit(i, j)，它表示第一个字符串的长度为i的子串到第二个字符串的长度为j的子串的编辑距离。

显然可以有如下动态规划公式：

if i == 0 且 j == 0，edit(i, j) = 0
if i == 0 且 j > 0，edit(i, j) = j
if i > 0 且j == 0，edit(i, j) = i
if i ≥ 1  且 j ≥ 1 ，edit(i, j) == min{ edit(i-1, j) + 1, edit(i, j-1) + 1, edit(i-1, j-1) + f(i, j) }，
当第一个字符串的第i个字符不等于第二个字符串的第j个字符时，f(i, j) = 1；否则，f(i, j) = 0。
*/
public class stringBianJiJuLi 
{
	public void getResult(String A,String B)
	{
		if(A.equals(B))
		{
			System.out.println(0);
			return;
		}

		int[][] dp = new int[A.length() + 1][B.length() + 1];
		
		for(int  i=1;i<=A.length();i++)
		{
			dp[i][0] = i;
		}
		for(int j = 1;j<=B.length();j++)
		{
			dp[0][j] = j;
		}
		for(int i =1;i<=A.length();i++)
		{
			for(int j=1;j<=B.length();j++)
			{
				if(A.charAt(i-1) == B.charAt(j-1))
				{
					dp[i][j] = dp[i-1][j-1];
				}else{
					 dp[i][j] = Math.min(dp[i - 1][j] + 1,Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + 1));
				}
				
			}
		}
		
		System.out.println(dp[A.length()][B.length()]);
        return;
		
		
	}
	
	
	public static void main(String[] args)
	{
		stringBianJiJuLi sb = new stringBianJiJuLi();
		String A = "ALGORITHM";
        String B = "ALTRUISTIC";
        sb.getResult(A, B);
	}

}
