import java.util.*;
public class Bagels {

public static void main(String[] args) {

System.out.println("How to play Bagels:\nTry to figure out what the secret code is.\nThe code is made up of three different numbers.");
System.out.println("For every guess you get a hint.\n\"bagels\" - none of the numbers are in the code\n\"pico\"   - a number in your guess is in the code");
System.out.println("           but in a different position.\n\"fermi\"  - a number in your guess is in the code\n           and in the correct spot"); 

Scanner scan = new Scanner(System.in);
String code = "";
int[] randarr = {0, 0, 0};

while (randarr[0]==randarr[1] || randarr[0]==randarr[2] || randarr[1]==randarr[2]) {
for (int i = 0; i < 3; i++)
randarr[i] = (int)(Math.random()*10);
}

code += "" + randarr[0] + randarr[1] + randarr[2];

String guess = "";
char[] guessarr = new char[3];
String output = "";

while (!guess.equals(code)) {

System.out.print("Guess: ");
guess = scan.next();
guess = guess.trim();

if (guess.charAt(0) == guess.charAt(1) || guess.charAt(0) == guess.charAt(2) || guess.charAt(1) == guess.charAt(2)){
System.out.println("The code contains all different numbers. Guess again.");

}else if(guess.length() > 3 || guess.length() < 3){
System.out.println("The code contains only three numbers. Guess again.");

}else{

for (int i = 0; i < 3; i++)
guessarr[i] = guess.charAt(i);

for (int i = 0; i < 3; i++){

if (code.charAt(i)==(guessarr[i])){
output += "fermi ";

}else if (code.contains("" + guessarr[i])) {
output += "pico ";
} 

}

if (!code.contains("" + guessarr[0]) && !code.contains("" + guessarr[1]) && !code.contains("" + guessarr[2]))
System.out.print("bagels");

if(output.equals("fermi fermi fermi ")) {
System.out.println(output);
System.out.println("Congratulations! You discovered the secret code!");
System.out.println("created by: Natalia Gilbertson*");

}else{
System.out.println(output);
output = "";

}

}
}


}

}
