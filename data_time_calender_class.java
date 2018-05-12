import java.util.Calendar;
import java.util.Date;









public class data_time_calender_class {
	public static void main(String[] args) {
          //Date date=new Date();
          Calendar cal=Calendar.getInstance();   //Calendar Class is Interface
          int d=cal.get(Calendar.DATE);
          int m=cal.get(Calendar.MONTH);
          int y=cal.get(Calendar.YEAR);
          
          int hr=cal.get(Calendar.HOUR);
          int min=cal.get(Calendar.MINUTE);
          int sc=cal.get(Calendar.SECOND);
          
          System.out.println("\n DATE :"+d+"/"+m+"/"+y);
          System.out.println("\n TIME :"+hr+":"+min+":"+sc);
          
     /*   int d=date.getDate();
        int m=date.getMonth();
        int y=date.getMonth();
        int h=date.getHours();
        int da=date.getDay();
        int mi=date.getMinutes();
        int se=date.getSeconds(); */
        
        
       // System.out.println("DATE : "+d+"/"+m+"/"+y+" TIME :"+h+":"+mi+":"+se+" DAY :"+da);
        
	}

}
