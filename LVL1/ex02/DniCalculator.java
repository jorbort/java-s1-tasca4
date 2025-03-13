package LVL1.ex02;

public class DniCalculator {
	
	public DniCalculator(){

	}
	public String getDniLetter(int dni){
		String[] letters = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		return letters[dni%23];
	} 
}
