package Lecture2;

public class IfElse {
    public static void main(String[] args) {

    // if else

    boolean primeSubs = false;

    if(primeSubs == true)
    {
      System.out.println("Purchased");
    }
      else
      {
        System.out.println("Not Purchased");
      }

      int num  = 10;

      //If

      if(num < 8)
      {
        System.out.println("It is a Negative Number");
      }

      System.out.println("Now if you are outside the if block");

      //if else if..... else

      //0 -> no subs
      //1 -> super
      //2 -> premium

      //'N' -> no subs
      //'S' -> super
      //'P' -> premium

      int hotstarsubs = 1;
      if(hotstarsubs == 0)
      {
        System.out.println("Now is a good time to get a hotstar subscription");
      }
      else if(hotstarsubs == 1)
      {
        System.out.println("Why don't you upgrade to premium subs");
      }
       else if(hotstarsubs == 2) 
       {
        System.out.println("Welcome to Hotstar premium ");
       }
      else
      {
        System.out.println("This looks like an invalid input");
      }


    // Nested if else

    String movie  = "line of duty";

    boolean primesubs = true;
    boolean acorn = true;
    boolean amc = false;

    
    if(primesubs){
        if(acorn || amc){
        System.out.println("You Can Enjoy Your Movie" + movie);
        }
      else {
        System.out.println("You Can Buy A Acorn Membership or Amc Membership To play Movie");
      }
    }
      else {
        System.out.println("You Don't Have Subscription To Watch Movie");
      }

    }
}


// boolean test = false;    
// if
//     if(test == true){
//         System.out.println("WE HAVE A TEST");
//     }

// if else
//     if(test){
//         System.out.println("WE GOING TO SCHOOL");
//     }else{
//         System.out.println("WE NOT GOING TO SCHOOL");
//     }

// if else if else
// System.out.print("Enter the Marks : ");
// int marks = input.nextInt();
//         if(marks >= 90){
//             System.out.println("Topper Of The Class");
//         }else if(marks >= 60){
//             System.out.println("Average Student");
//         }else if(marks >= 30){
//             System.out.println("Just Passed");
//         }else{
//             System.out.println("Failed Student");
//         }


// Nested if
//     boolean wifi = false;
//     boolean tenda = true;
//     boolean prime = false;

//     if(wifi){
//         if(tenda || prime){
//             System.out.println("Enjoy Your Services");
//         }else{
//             System.out.println("You Have TO Buy A Minimum One Membership To Access A Plan");
//         }
//     }else{
//         System.out.println("You Don't Have Any Membership");
//     }