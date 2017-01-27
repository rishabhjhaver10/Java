// Group 17
// Name: Sidharth Mehra UTA Id: 1001246532
// Name: Aishwarya Jagath Naik UTA Id: 1001171557
// Name: Rishabh Sandeep Jhaveri UTA Id: 1001235720
import java.lang.Math;
public class CompoundInterest{
  public static void main(String[] args){
    //Initial Variables Declaration
    int principal=1000;
    double amount=0.0;
    System.out.printf("\n%4s%11s%11s%11s%11s%11s%12s\n","Year","Amount(5%)","Amount(6%)","Amount(7%)","Amount(8%)","Amount(9%)","Amount(10%)");
    //outer loop for year
    for(int i=1;i<=10;i++){
      //inner loop for rate
      System.out.printf("%3d",i);
      for(double j=5;j<=10;j++){
        amount=principal * Math.pow((1.0+j/100),i);
        System.out.printf("%11.2f",amount);
      }
      System.out.println();
    }
  }
}
