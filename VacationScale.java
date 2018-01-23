public class VacationScale {

int[] vacationDays = new int[7];

public void setVacationDays(){

   vacationDays[0]= 10;
   vacationDays[1]= 10;
   vacationDays[2]= 15;
   vacationDays[3]= 15;
   vacationDays[4]= 20;
   vacationDays[5]= 20;
   vacationDays[6]= 25;




}

public void displayVacationDays(int yearsOfService){

   setVacationDays();

      System.out.println("Your vacation is: " + vacationDays[yearsOfService]);
 
   if(yearsOfService > 6){

      System.out.println("Your vacation is " + vacationDays[6]);

}
}








}