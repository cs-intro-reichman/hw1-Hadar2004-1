public class TimeFormat {
    public static void main(String[] args) {

        String input = args[0];

       
        int hourDigits = Integer.parseInt("" + input.charAt(0) + input.charAt(1));
        int minDigits = Integer.parseInt("" + input.charAt(2) + input.charAt(3));

       
        int newFormatHour = hourDigits % 12;
        if (newFormatHour == 0) {
            newFormatHour = 12;
        }

       
        String newFormatMin;
        if (minDigits < 10) {
            newFormatMin = "0" + minDigits;
        } else {
            newFormatMin = "" + minDigits;
        }

		
        if (hourDigits < 12) {
            System.out.println(newFormatHour + ":" + newFormatMin + " AM");
        } else {
            System.out.println(newFormatHour + ":" + newFormatMin + " PM");
        }
    }
}