package lab1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;    

public class labTimer {
	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		Date now = new Date();  
		Date lab1 = formatter.parse("09/28/2022");
	    Date lab2 = formatter.parse("10/26/2022");
	    Date lab3 = formatter.parse("11/23/2022");
	    Date lab4 = formatter.parse("12/07/2022");
	    Date[] dates = {now, lab1, lab2, lab3, lab4}; 
	    
	    
	    System.out.println("Today is " + formatter.format(now));
	    for(int i=1; i<5; i++) {
	    	long diffMilli = dates[i].getTime() - now.getTime();
	    	long diffDay = TimeUnit.MILLISECONDS.toDays(diffMilli);
	    	if(diffDay > 0) {
	    		System.out.println("There is " + diffDay + " day(s) until lab" + i + " is dued");   
	    	}else{
	    		System.out.println("lab" + i + " is dued"); 
	    	}
	    }
	    System.out.println("Keep going!!!!"); 
	}
}
