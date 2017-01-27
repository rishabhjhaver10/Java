// Group 17
// Name: Sidharth Mehra UTA Id: 1001246532
// Name: Aishwarya Jagath Naik UTA Id: 1001171557
// Name: Rishabh Sandeep Jhaveri UTA Id: 1001235720

import java.util.Scanner;
public class IncomeTax{
  public static void main(String[] args){
    //Scanner declaration
    Scanner src=new Scanner(System.in);

    //Initial Variables Declaration
    int filingStatus;
    double income=0.0;
    double tax=0;

    //Accept input from User
    System.out.println("Enter your Filing Status");
    System.out.println("1. Single");
    System.out.println("2. Married Filing Jointly");
    System.out.println("3. Married Filing Separately");
    System.out.println("4. Head of Household");
    filingStatus=src.nextInt();

    switch(filingStatus){
      case 1:
        System.out.println("Enter your Taxable Income");
        income=src.nextDouble();
        if(income > 0 && income <= 8350)
          tax+=income*0.10;
        else if(income >8350 && income<=33950){
          tax+=8350*0.10;
          tax+=(income-8350)*0.15;
        }
        else if(income >33950 && income<=82250){
          tax+=8350*0.10;
          tax+=(33950-8350)*0.15;
          tax+=(income-33950)*0.25;
        }
        else if(income >82250 && income<=171550){
          tax+=8350*0.10;
          tax+=(33950-8350)*0.15;
          tax+=(82250-33950)*0.25;
          tax+=(income-82250)*0.28;
        }
        else if(income >171550 && income<=372950){
          tax+=8350*0.10;
          tax+=(33950-8350)*0.15;
          tax+=(82250-33950)*0.25;
          tax+=(171550-82250)*0.28;
          tax+=(income-171550)*0.33;
        }
        else if(income >372950){
          tax+=8350*0.10;
          tax+=(33950-8350)*0.15;
          tax+=(82250-33950)*0.25;
          tax+=(171550-82250)*0.28;
          tax+=(372950-171550)*0.33;
          tax+=(income-372950)*0.35;
        }
        break;
      case 2:
        System.out.println("Enter your Taxable Income");
        income=src.nextDouble();
        if(income > 0 && income <= 16700)
          tax+=income*0.10;
        else if(income >16700 && income<=67900){
          tax+=16700*0.10;
          tax+=(income-16700)*0.15;
        }
        else if(income >67900 && income<=137050){
          tax+=16700*0.10;
          tax+=(67900-16700)*0.15;
          tax+=(income-67900)*0.25;
        }
        else if(income >137050 && income<=208850){
          tax+=16700*0.10;
          tax+=(67900-16700)*0.15;
          tax+=(137050-67900)*0.25;
          tax+=(income-137050)*0.28;
        }
        else if(income >208850 && income<=372950){
          tax+=16700*0.10;
          tax+=(67900-16700)*0.15;
          tax+=(137050-67900)*0.25;
          tax+=(208850-137050)*0.28;
          tax+=(income-208850)*0.33;
        }
        else if(income >372950){
          tax+=16700*0.10;
          tax+=(67900-16700)*0.15;
          tax+=(137050-67900)*0.25;
          tax+=(208850-137050)*0.28;
          tax+=(372950-208850)*0.33;
          tax+=(income-372950)*0.35;
        }
        break;
      case 3:
        System.out.println("Enter your Taxable Income");
        income=src.nextDouble();
        if(income > 0 && income <= 8350)
          tax+=income*0.10;
        else if(income >8350 && income<=33950){
          tax+=8350*0.10;
          tax+=(income-8350)*0.15;
        }
        else if(income >33950 && income<=68525){
          tax+=8340*0.10;
          tax+=(33950-8350)*0.15;
          tax+=(income-33950)*0.25;
        }
        else if(income >68525 && income<=104425){
          tax+=8350*0.10;
          tax+=(33950-8350)*0.15;
          tax+=(68525-33950)*0.25;
          tax+=(income-68525)*0.28;
        }
        else if(income >104425 && income<=186475){
          tax+=8350*0.10;
          tax+=(33950-8350)*0.15;
          tax+=(68525-33950)*0.25;
          tax+=(104425-68525)*0.28;
          tax+=(income-104425)*0.33;
        }
        else if(income >186475){
          tax+=8350*0.10;
          tax+=(33950-8350)*0.15;
          tax+=(68525-33950)*0.25;
          tax+=(104425-68525)*0.28;
          tax+=(186475-104425)*0.33;
          tax+=(income-186475)*0.35;
        }
        break;
      case 4:
        System.out.println("Enter your Taxable Income");
        income=src.nextDouble();
        if(income > 0 && income <= 11950)
          tax+=income*0.10;
        else if(income >11950 && income<=45500){
          tax+=11950*0.10;
          tax+=(income-11950)*0.15;
        }
        else if(income >45500 && income<=117450){
          tax+=11950*0.10;
          tax+=(45500-11950)*0.15;
          tax+=(income-117450)*0.25;
        }
        else if(income >117450 && income<=190200){
          tax+=11950*0.10;
          tax+=(45500-11950)*0.15;
          tax+=(117450-45500)*0.25;
          tax+=(income-117450)*0.28;
        }
        else if(income >190200 && income<=372950){
          tax+=11950*0.10;
          tax+=(45500-11950)*0.15;
          tax+=(117450-45500)*0.25;
          tax+=(190200-117450)*0.28;
          tax+=(income-190200)*0.33;
        }
        else if(income >372950){
          tax+=11950*0.10;
          tax+=(45500-11950)*0.15;
          tax+=(117450-45500)*0.25;
          tax+=(190200-117450)*0.28;
          tax+=(372950-190200)*0.33;
          tax+=(income-372950)*0.35;
        }
        break;
      default:
        System.out.println("Invalid Filing Status");
        break;
    }
    System.out.printf("The tax for the individual is " + tax+"\n");
  }
}
