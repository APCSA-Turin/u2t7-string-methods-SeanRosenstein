package U2T7;
import java.util.Scanner;

public class a {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Ello there mate, tell me something, anything, would ya?\n");
String yap1 = scan.nextLine();
int yap1len = yap1.length();

System.out.println("\nAlright that's great and all, now tell me something a bit more interesting before I fall asleep.\n");
String yap2 = scan.nextLine();
int yap2len = yap2.length();


if (yap1len>yap2len){
    System.out.println("\nWell you sure did yap more that first time around.\n");
}else if(yap2len>yap1len){
    System.out.println("\nWell you sure did yap more that second time around.\n");
}else{
    System.out.println("\nWell you just wasted my time with your yapping, but good job! At least you were consistent with the length of your yap!\n");
}


String yap1first = yap1.substring(0,yap1len/2);
String yap1second= yap1.substring(yap1len/2);

String yap2first = yap2.substring(0,yap2len/2);
String yap2second= yap2.substring(yap2len/2);

System.out.println("The first half of your first yap was " + yap1first);
System.out.println("The second half was " + yap1second);

System.out.println("The first half of your second yap was " + yap2first);
System.out.println("The second half was " + yap2second + "\n");

if(yap1.indexOf(yap2)!=-1){
System.out.println(yap2 + " is found in " + yap1 + " at index " + yap1.indexOf(yap2));
}else{
    System.out.println(yap2 + " is NOT found in " + yap1);
}

scan.close();
    }
}