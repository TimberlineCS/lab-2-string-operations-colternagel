//Colter Nagel
//AP CS 1
//8-31-20


public class Lab2StringOperations{

  public static void main(String args[]){

    /*CHALLENGE 1
    This challenge prints the following words with the last part of the word in the front
    */
    String s = "Scissors";
    String firstS = s.substring(0, 4);
    String lastS = s.substring(4);
    System.out.println(lastS + firstS.toLowerCase() );

    String p = "Picture";
    String firstP = p.substring(0, 3);
    String lastP = p.substring(3);
    System.out.println(lastP + firstP.toLowerCase() );

    String c = "Computer";
    String firstC = c.substring(0, 4);
    String lastC = c.substring(4);
    System.out.println(lastC + firstC.toLowerCase() );


    /*CHALLENGE 2
    This challenge prints an ASCII dog to the screen
    */
    System.out.println();
    System.out.println();
    System.out.println();
    //Line 1
    System.out.println("     __");
    //Line 2
    System.out.println("(___()'`;");
    //Line 3
    System.out.println("/,    /'");
    //Line 4
    System.out.print("\\");
    System.out.print("\\\"--");
    System.out.println("\\\\");



  }



}