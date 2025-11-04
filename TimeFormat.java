public class TimeFormat {
    public static void main(String[] args) {

        String input = args[0];

       
        int hours24 = Integer.parseInt("" + input.charAt(0) + input.charAt(1));
        int minutesString = Integer.parseInt("" + input.charAt(3) + input.charAt(4));

      
        int hours12;
        String suffix;

        
        if (hours24 == 0) {
            
            hours12 = 0;
            suffix = "AM";
        } else if (hours24 >= 1 && hours24 <= 11) {
            
            hours12 = hours24;
            suffix = "AM";
        } else if (hours24 == 12) {
            
            hours12 = 12;
            suffix = "PM";
        } else { 
            hours12 = hours24 - 12;
            suffix = "PM";
        }

        
        
        
        System.out.print(hours12);
        
        
        System.out.print(":");
        
        System.out.print(minutesString);
        
        
        System.out.print(" ");
        System.out.println(suffix);
    }
}