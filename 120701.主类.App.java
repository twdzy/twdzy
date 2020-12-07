package pac;

public class App {
public static void main(String[] args) {
	int array2d[ ][ ]={
			{1,2,3,4,5,6},
			{7,8,9,10,0,12},
			{8,8,9,10,11,12},
			{7,8,3,10,11,12},
			{88,66,92,102,151,999}
			};
	new Find().finalizero(array2d);
	new Find().R_left(array2d);
	new Find().R_righ(array2d);
	new Find().R_up(array2d);
	new Find().R_down(array2d);
	}
}
