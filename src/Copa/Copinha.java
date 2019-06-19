package Copa;

import javax.swing.JOptionPane;

class Copinha {

	public static void main(String[] args) 
	{
		int N;
		int M;
		int X;
		int[] album = new int[105];

		N = Integer.parseInt(JOptionPane.showInputDialog(""));
		M = Integer.parseInt(JOptionPane.showInputDialog(""));
		for (int i = 1; i <= N;i++)
		{
			album[i] = 0;
		}
		for (int i = 0;i < M;i++)
		{
			X = Integer.parseInt(JOptionPane.showInputDialog(""));
			album[X] = 1;
		}
		int R = 0;
		for (int i = 1; i <= N; i++)
		{
			if (album[i] == 0)
			{
				R++;
			}
		}
		JOptionPane.showMessageDialog(null, R);
		System.out.print(R);
		System.out.print("\n");
	}
}