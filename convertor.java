Package Currency;
import java.util.*;
import java.text.DecimalFormat;
class CurrencyConvertor
{
	double rupee,dollar,euro,yen;
	Scanner,sc=new Scanner(System.in);
	DecimalFormat f=new DecunakFormat("##.##");
 public void convertlnrToEuro()
 {
	System.out.println("Enter amount in rupees");
	rupee=sc.nextFloat();
	euro=rupee/80;
	System.out.print("Euro:"+f.format(euro));
 }
 public void convertEuroTolnr()
 {
 	System.outprintln("Enter amount in Euro");
	euro=sc.nextFloat();
	rupee=euro*80;
	System.out.println("Rupees:"+f.format(rupee));
 }
 public void convertlnToDollar()
 {
	System.out.println("Enter amount in rupees");
	rupee=sc.nextFloat();
	dollar=rupee/66;
	System.out.println("Dollar:"+f.format(dollar);
 }
 public void convertDollarTolnr()
 {
	System.out.println("Enter amount in Dollar");
	dollar=sc.nextFloat();
	rupee=dollar*66;
	System.out.println("Rupees:"+f.format(rupee));
 }
 public void convertlnrToYen()
 {
	System.out.println("Enter amount in rupees");
	rupee=sc.next/0.62;
	System.out.println("Yen:"+f.format(yen));
 }
 public void convertYenTolnr()
 {
	System.out.println("Enter amount in Yen");
	yen=sc.nextFloat();
	rupee=yen*0.61;
	System.out.println("Rupees:"+f.format(rupee));
 }
}
Package distance;
import java.util.*;
import java.text.DecemialFormat;
class DistanceConvertor
{
	double meter,km,miles;
	Scanner sc=new Scanner(System.in);
	DecimalFormat f=new DecimalFormat("##.###");
 public void convertKmToMeter()
 {
 	System.out.print("Enter the meter");
 	meter=sc.nextFloat();
 	km=meter*0.001;
 	System.out.println("Kilometer:"+f.format(km));
 }
 public void convertKmTometer()
 {
 	System.out.println("Enter the Kilometer");
 	km=sc.nextFloat();
 	meter=km/0.001;
 	System.out.println("Meter:"+f.format(meter));
 }
 public void convertMilesToKm()
 {
 	System.out.println("Enter the miles");
 	miles+SC.nextFloat();
 	km=miles*1.6093;
 	System.out.println("Kilometer:"+f.format(km));
 }
 public void convertKmToMiles()
 {
 	System.out.println("Enter the Kilometer");
 	km=sc.next/1.6093;
 	System.ou.println("Miles:"+f.format(miles));
 }
}
Package time;
import java util.*;
import java.text.DecimalFormat;
class TimeConvertor
{
	double hour,minute,second;
	Scannersc=new Scanner(System.in);
	DecimalFormat f=new DecimalFormat("##.###);
 public convertHourTominute()
 {
 	System.out.println("Enter the Hour"):
 	hour=sc.nextFloat();
 	minute=hour*60;
 	System.out.println("Minutes:"+f.format(minute));
 }
 public void convertMinuteToHour()
 {
 	System.out.println("Enter the Minute);
 	minute=sc.nextFloat();
 	hour=minute/60;
 	System.out.println("Hours:"+f.format(hour));
 }
 public void converHoursToSeconds()
 {
 	System.out.println("Enter the Hour");
 	hour=sc.nextFloat();
 	second=hour*3600;
 	System.out.println("Seconds:"+f.format(hour));
 }
 public void convertSecondsToHour()
 {
 	System.out.println("Enter the Seconds");
 	second=sc.nextFloat();
 	hour=second/3600;
 	System.out.println("Hours:"+f.format(hour));
 }
}
import currency.*;
import distance.*; 
import time.*;\
import java.util.Scanner;
public class Convertor
{
 public static void main(String[]args)
 {
 	int code,currency_code,distance_code,time_code;
 	Scanner sc=new Scanner(System.in);
 	
 	System.out.println("Enter the code1:Currency\n2:Distance\n3:Time");
 	code=sc.nextlnt();
 	if(currency_code==10
 	{
 	  cc.convertlnrToEuro();
 	  cc.convertEuroTolnr();
 	}
 	else if (currency_code==2)
 	{
 	  cc.convertlnrToDollar();
 	  cc.convertDollarTolnr();
 	}
 	else if (currency_code==3)
 	{ 
 	  cc.convertlnrToYen();
 	  cc.convertYenTolne();
        }
        else
        {
          System.out.println("Invalid Code");
        }
       }
       else if(code==2)
       {
         DistanceConvertor dc=new DistanceConvertor();
         System.out.println("Enter the Distance code 1:Meter\n2:miles");
         distance_code=sc.nextlnt();
         
         if(distance_code==1)
         {
            dc.convertMeterToKm();
            dc.convertKmToMeter();
         }
         else
         {
            System.out.println("Invaild Code");
         }
        }
        else if(code==3)
        {
          TimeConvertortc =new TimeConvertor();
          System.out.println("Enter tje Time code1:Minutes\n2:Seconds");
          time-code=sc.nextln();
          if(time_code==1)
          {
            tc.convertHourToMinute();
            Tc.convertMinuteToHour();
          }
          else if(time_code==2)
          {
            tc.convertHourToSeconds();
            tc.convertSecondsToHour();
          }
          else
          {
            System.out.println("Invalid Code");
          }
         }
         else
         {
           System.out.println("Invalid Code");
           }
          }
         }
          
            
         
          
 	

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

