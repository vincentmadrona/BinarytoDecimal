/******************************************************************
 * Program 1: Conversion from binary to decimal representation
 * Programmer: Write your name here
 * 
 * Class: IT 121        Instructor: 
 *        
 * Pledge: I have neither given nor received unauthorized aid
 * on this program.     (signature on file)
 *
 * Description: This program converts a binary number to decimal.
 *
 * Input: Binary number
 *
 * Output: Decimal number
 *
 ******************************************************************/

// Imported packages
   import javax.swing.*;
    public class Binary
   {
   // Main method
       public static void main(String[] args)
      {
      	
      	// Request 6-bit binary number
         String binaryString=JOptionPane.showInputDialog("Enter a 6-bit binary number");
      	
      	// Convert from String to integer type
         int binary=Integer.parseInt(binaryString);
      	
      	// Declaration of output value
         int decimal=0;
      
      	// Declaration of variable to hold the current bit
         int bit;
         
       	//////////////////////////////////////
      	// ADD YOUR CODE HERE
      	// FOLLOW THE EXAMPLE PROVIDED
      	// FOR THE LAST BIT, THE 6th
      	//////////////////////////////////////
/*      				
         bit=binary%10;//get the last bit (6th)
         decimal=decimal+bit*1;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 6th bit, now the 5th bit is last
      	
         bit=binary%10;//get the last bit (5th)
         decimal=decimal+bit*2;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 5th bit, now the 4th bit is last
      	
         bit=binary%10;//get the last bit (4th)
         decimal=decimal+bit*4;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 4th bit, now the 3rd bit is last
      	
         bit=binary%10;//get the last bit (3rd)
         decimal=decimal+bit*8;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 3rd bit, now the 2nd bit is last
      	
         bit=binary%10;//get the last bit (2nd)
         decimal=decimal+bit*16;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 2nd bit, now the 1st bit is last 
      	
         bit=binary%10;//get the last bit (1st)
         decimal=decimal+bit*32;//add it, multiplied by the corresponding power of 2
*/    
    int d=0;
    int power1=1;
    int len=binaryString.length();
 	while (d<len) {
         bit=binary%10;//get the last bit (6th)
         decimal=decimal+bit*power1;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 6th bit, now the 5th bit is last
         power1*=2;
 		d++;
 	}	
         
	int g=0;
	int power2=1;
	int len1=binaryString.length();
	while (g<len1) {
		bit=binary%10;//get the last bit (5th)
		decimal=decimal+bit*power2;//add it, multiplied by the corresponding power of 2
		binary=binary/10;//get rid of the 5th bit, now the 4th bit is last
		power2*=2;
		g++;
	}
	
	int i=0;
	int power4=1;
	int len2=binaryString.length();
	while (i<len2) {
		bit=binary%10;//get the last bit (4th)
		decimal=decimal+bit*power4;//add it, multiplied by the corresponding power of 2
		binary=binary/10;//get rid of the 4th bit, now the 3th bit is last
		power4*=2;
		i++;
	}
	
	int l=0;
	int power8=1;
	int len3=binaryString.length();
	while (l<len3) {
		bit=binary%10;//get the last bit (3rd)
		decimal=decimal+bit*power8;//add it, multiplied by the corresponding power of 2
		binary=binary/10;//get rid of the 3th bit, now the 2th bit is last
		power8*=2;
		l++;
	}	
	
	int n=0;
	int power16=1;
	int len4=binaryString.length();
	while (n<len4) {
		bit=binary%10;//get the last bit (2nd)
		decimal=decimal+bit*power16;//add it, multiplied by the corresponding power of 2
		binary=binary/10;//get rid of the 2th bit, now the 1th bit is last
		power16*=2;
		n++;
	}
	
	int p=0;
	int power32=1;
	int len5=binaryString.length();
	while (p<len5) {
		bit=binary%10;//get the last bit (1st)
		decimal=decimal+bit*power32;//add it, multiplied by the corresponding power of 2
		binary=binary/10;
		power32*=2;
		p++;
	}
      	// Format output String
         String binaryOutput="Binary: " + binaryString;
         String decimalOutput="Decimal: " + decimal;
      	
      	// Output message
         JOptionPane.showMessageDialog(null, binaryOutput + "\n" + decimalOutput,
            "Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);
      		
      	// Exit
         System.exit(0);
        }
}