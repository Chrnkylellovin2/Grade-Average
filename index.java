# Grade-Average
package Grade Average;

import java.util.Scanner;

public class Kyle1 {

public static void main(String[] args) {

// TODO Auto-generated method stub

//INPUTS//

Scanner english = new Scanner(System.in);

System.out.print("Enter English Grade :");

int G1 = english.nextInt();

Scanner math = new Scanner(System.in);

System.out.print("Enter Math Grade :");

int G2 = math.nextInt();

Scanner science = new Scanner(System.in);

System.out.print("Enter Science Grade :");

int G3 = science.nextInt();

Scanner filipino = new Scanner(System.in);

System.out.print("Enter Filipino Grade :");

int G4 = filipino.nextInt();

Scanner pe = new Scanner(System.in);

System.out.print("Enter PE Grade :");

int G5 = pe.nextInt();

//STRINGS//

String English = ("Englis GRADE:" + G1);

String Math = ("Math GRADE:" + G2);

String Science = ("Science GRADE:" + G3);

String Filipino = ("Filipino GRADE:" + G4);

String Pe = ("PE GRADE:" + G5);

//Condition//

if (G1 >=101) {

System.out.println(English + " Invalid");

}else if (G1 >=97) {

System.out.println(English + " Highest Honor");

}else if (G1 >= 95) {

System.out.println(English + " High Honor");

}else if (G1 >= 90) {

System.out.println(English + " With Honor");

}else if (G1 >= 85) {

System.out.println(English + " Excellent");

}else if (G1 >= 75) {

System.out.println(English + " Passed");

}else {

System.out.println(English + " Failed");

}

if (G2 >=101) {

System.out.println(Math + " Invalid");

}else if (G2 >=97) {

System.out.println(Math + " Highest Honor");

}else if (G2 >= 95) {

System.out.println(Math + " High Honor");

}else if (G2 >= 90) {

System.out.println(Math + " With Honor");

}else if (G2 >= 85) {

System.out.println(Math + " Excellent");

}else if (G2 >= 75) {

System.out.println(Math + " assed");

}else {

System.out.println(Math + " Failed");

}

if (G3 >=101) {

System.out.println(Science + " Invalid");

}else if (G3 >=97) {

System.out.println(Science + " Highest Honor");

}else if (G3 >= 95) {

System.out.println(Science + " High Honor");

}else if (G3 >= 90) {

System.out.println(Science + " With Honor");

}else if (G3 >= 85) {

System.out.println(Science + " Excellent");

}else if (G3 >= 75) {

System.out.println(Science + " Passed");

}else {

System.out.println(Science + " Failed");

}

if (G4 >=101) {System.out.println(Filipino + " Invalid");}
else if (G4 >=97) {System.out.println(Filipino + " Highest Honor");}
else if (G4 >= 95) {System.out.println(Filipino + " High Honor");}
else if (G4 >= 90) {System.out.println(Filipino + " With Honor");}
else if (G4 >= 85) {System.out.println(Filipino + " Excellent");}
else if (G4 >= 75) {System.out.println(Filipino + " Passed");

}else {System.out.println(Filipino + " Failed");}

if (G5 >=101) {

System.out.println(Pe + " Invalid");

}else if (G5 >=97) {

System.out.println(Pe + " Highest Honor");

}else if (G5 >= 95) {

System.out.println(Pe + " High Honor");

}else if (G5 >= 90) {

System.out.println(Pe + " With Honor");

}else if (G5 >= 85) {

System.out.println(Pe + " Excellent");

}else if (G5 >= 75) {

System.out.println(Pe + " Passed");

}else {

System.out.println(Pe + " Failed");

}

}

}
