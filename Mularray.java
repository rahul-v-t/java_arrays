public class Mularray {
	public static void main(String[] args) {
		
		int[][] grid = {
				{3,4,567},
				{4,6},
				{4,7,1}
		};
		System.out.println(grid[2][1]);
		System.out.println(grid[0][2]);
		
		for(int row=0; row<grid.length;row++){
			for(int col=0;col<grid[row].length;col++){
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
	}
}