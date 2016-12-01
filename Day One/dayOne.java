import java.util.Scanner;

public class dayOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dir = 0;
		int dX = 0;
		int dY = 0;
		
		for(int i = 0; i < 150; i++){
			String str = input.next();
			char c = str.charAt(0);
			int num = Character.getNumericValue(str.charAt(1));
			
			if(c == 'L'){
				if(dir == 0){
					dir = 3;
				}
				else{
					dir--;
				}
			}
			else if (c == 'R'){
				if(dir == 3){
					dir = 0;
				}
				else{
					dir++;
				}
			}
			
			switch(dir){
				case 0:
					dY += num;
					break;
				case 1:
					dX += num;
					break;
				case 2:
					dY -= num;
					break;
				case 3:
					dX -= num;
					break;
				default:
					System.out.println("huh?");
					break;
			}
		}
		
		int num = Math.abs(dX) + Math.abs(dY);
		
		System.out.print(num);
	}

}
