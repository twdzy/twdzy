package pac;
public class Find {
	void finalizero(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_zero("+column+","+row+")");
					
				}
			}
		}
	}
	void R_left(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_left("+(column-1)+","+row+")");
				}
			}
		}
	}
	void R_righ(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_right("+(column+1)+","+row+")");
				}
			}
		}
	}
	void R_up(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_up("+column+","+(row-1)+")");
				}
			}
		}
	}
	void R_down(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d[0].length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_down("+column+","+(row+1)+")");
				}
			}
		}
	}
}
