public class Bill3 {
public static void main(String[] args) {
int value = Integer.parseInt(args[3]);
double roundValue = Math.ceil(value/3.0);
System.out.println("Dear " + args[2] + "," + " " + args[1] + " and " + args[0] + ": pay " + roundValue + " " + "Shekels each.");
}    
}

   
	