/*
Rajpreet Judge
CSE 223
04/14/2020
Nick Macias

This class plays with even integers and performs mathematical arithmatic if an odd number is inputed
the program will just add 1 to make it even (round up). should perform basic arithmatic (+, - , / , *)
it performs these by calling methods associated to those expression. 

The indepth descriptions will be provided below along side and above methods/accessors
*/

public class Even {
  
  private int value = 0; //I have declared value as a private int so the user of this class has no access to value that could potentially break the code

  public Even(int arg) { // Here we have our Even constructor
    if(arg%2 == 0)  // we check the arguement passed to the constructor to see if its even by checking the remainder of arg modulo 2
      value = arg; // if its even then we store arg into value
    else
      value = arg + 1; // Here we add 1 to the odd valued arg to make it even
  }

  /*
  Here we have out addition method
  we pass it an arguement "y" and it will perform the addition
  and check for Evenness. We return a created Even object containing
  the added value
  */

  public Even add(Even y) { 
    Even result = new Even(value + y.toInt()); //we call the constructor and pass it the sum of value and y, then store those in the created Even result;
    return result;  // we just return that created Even called result
  }

  /*
  This is the subtraction method that is passed an a value "y"
  y is already checked to see if its even or odd.  
  we create a new object that is passed the sum of the two subtracted numbers
  then an object is created called result and stored inside result
  */

  public Even sub(Even y) { 
    Even result = new Even(value - y.toInt()); //here is where we is perform the subtraction and pass that value to the created Even object
    return result; // we return that Even object
  }

  /*
  Here is the multiplication method and like the pervious methods we perform the multiplication 
  and store that sum in the result. There is nothing different from this method when compared to the
  addition and subtraction methods other than the type of math being performed.
  */

  public Even mul(Even y) { //method is passed a type Even
    Even result = new Even(value * y.toInt()); //same call to the constructor and pass the sum
    return result; //return the object called result
  }

  /*
  This is the division method and this is where we face the first possible issue,
  we all know division by zero is not possible so if we pass a 0 value expect to get a surprise
  we take the passed value and divide by the value stored inside of value.
  if we get an odd result we will make it even when we call the constructor
  */

  public Even div(Even y) { //division method with the value y
    Even result = new Even(value / y.toInt());  //call to the constructor and here is where the check for 0 and odd is also performed.
    return result; //returned that stored value inside the result object
  }

  /*
  This is an accessor, since we have value as private we need a way for the user to interact with the class
  here the person using this class and see the number assigned to value. the accessor doesnt have any info
  passed to it and it returns an Int.
  */

  public int toInt() {
    return value; //return whats stored in value
  }

  /*
  This is a toString method, Since we want the output to be printed as a String of chars we need to 
  convert the int to a string. We do that by concatenating the number to an empty string, this allows us
  to access individual chars and analyze what the string output should be. I created an array of strings that contain all 
  possible output Strings and we utilize a switch statement for all the possiblities inside a for loop.
  once we find the correct case we concatenate the string to the output string and move on down to the 
  next digit and repeat until we reach the end.
  */

  public String toString() {

    String temp = "" + value;  //Concatenating the number value to an empty string
    String[] words = {"Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ",
		      "Seven ", "Eight ", "Nine ", "Negative "}; //this is where we have the array of strings of all
   								//possible output strings
    String output = ""; //this is the output string that is initialized to a NULL string

    for(int i = 0; i < temp.length(); i++) { //start of the for loop 
      switch(temp.charAt(i)) { // switch condition that is the character stored in temp at the given index

        case '-': //case for negative sign
          output = output + words[10]; //we concatenate the word negative
          break;

        case '0': //case of zero 
          output = output + words[0]; //we concatenate the word zero
          break;

        case '1': // if one is the case
          output = output + words[1]; //concatenate the word one to the output string
          break;

        case '2': //case for the number two
          output = output + words[2]; //concatenate the word two to the output string
          break;

        case '3': //case for number three 
          output = output + words[3]; //concatenate the word three to the output string
          break;

        case '4': //case for the input of four
          output = output + words[4]; //concatenate the word four to the output string
          break;

        case '5': //case for input of five
          output = output + words[5]; //concatenate the word five to the output string
          break;

        case '6': //case for input of six
          output = output + words[6]; //concatenate the word six to the output string
          break;

        case '7': //case of input being seven 
          output = output + words[7]; //concatenate the word seven to the output string
          break;

        case '8': //case for number eight
          output = output + words[8]; //concatenate the word eight to the output string
          break;

        case '9': //case for the number nine
          output = output + words[9]; //concatenate the word nine to the output string
          break;
      }    
    }  
    return output; // here we return the output string
  }

  		

}
