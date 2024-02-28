//public class Addmath{
// public static void main(String[] args){
//     int x = 10;
//     int y =14;
//     System.out.println(x+y);
// }
//}
// public class Addmath {

//     public static void main(String[] args) {
//         int i=8;
//         if (i%2==0) {
//             System.out.println(i + " is an even number");            
//         }
//        // System.out.println(i+2);
//     }
//}
/*public class Addmath {

    public static void main(String[] args) {
        int test1 =79;
        int test2 =23;
        int test3 =90;
        if (test1>75) {
            if (test2>75) {
                if (test3>75) {
                    System.out.println("You passed this grade");
                
                }
            }
            
        } else{
            System.out.println("Don't bother come for the interview lol you failed");
        }
        
    }
}
*/
//public class Addmath {

  /* public static void main(String[] args) {
        int day = 3;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
}*/  

/*public class Addmath {

    public static void main(String[] args) {
        int herAge = 25;
        switch (herAge) {
            case 250:
            System.out.println("her age is" + herAge);
            break;
            case 7:
            System.out.println("not her" + herAge);
                break;
                case 28:
                System.out.println("that is her age" + herAge);
                break;
                
            default:
            System.out.println("Please try again");
                break;
        }
    }
}*/
/*public class Addmath {
    public static void main(String[] args) {
          int Month = 13;
      switch (Month) {
        case 1:
          System.out.println("January");
          break;
        case 2:
          System.out.println("Februaryy");
          break;
        case 3:
          System.out.println("March");
          break;
        case 4:
          System.out.println("April");
          break;
        case 5:
          System.out.println("May");
          break;
        case 6:
          System.out.println("June");
          break;
        case 7:
          System.out.println("July");
          break;
          case 8:
          System.out.println("August");
          break;
          case 9:
          System.out.println("September");
          break;
          case 10:
          System.out.println("October");
          break;
          case 11:
          System.out.println("November");
          break;
          case 12:
          System.out.println("December");
          break;
          default:
          System.out.println("Please enter a valid value between one to twelve");
      }
    }
  }*/
  /*public class Addmath {
  
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){

        System.out.println(+i);
        }
    }
  }*/
  /*public class Addmath {
  
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i=i+2) {
           // if (i % 2 == 0) {
              System.out.println(i);
            }
          }
    }
  //}*/
  /*public class Addmath {
  //using while loop
    public static void main(String[] args) {

      int Top = 10;
      int bottom =13;
   
             while (bottom<Top) {
              System.out.println("Salah!!!!!!!!!!");
              bottom++;
              
             }

    }
  }*/
  /*public class Addmath {
  
    public static void main(String[] args) {
      int Top = 10;
      int bottom = 13;
      do {
        System.out.println("Hire me!!");
        bottom++;
        
      } while (bottom<Top);
    }
  }*/
 // public class Addmath {
  
   /*  public static void main(String[] args) {
      int arr[]= {20,50,22,30,36};
     System.out.println(arr[3]);
    }
  }*/

  //declare arrays for the 12mnths in d yr and let it show the 12mnths using a loop
  /*int[] arr;
  arr = new int[5]
  arr[0]=45
  system.out,println()*/
 /* public class Addmath {
      public static void main(String[] args) {
      String arr[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
       for (int i=0; i <=11;  i++) {
       System.out.println(arr[i]);
     
    }
  }
}*/
/*import java.util.Scanner;
public class Addmath {

  public static void main(String[] args) {
    Scanner blades = new Scanner(System.in);
    System.out.println("What is your name");
    String name = blades.nextLine();
    System.out.println("Welcome "+ name);
    System.out.println("How old are you");
    String age = blades.nextLine();
    System.out.println("What is your Gender");
    String Gender = blades.nextLine();
    System.out.println("What is you Address");
    String Address = blades.nextLine();
    System.out.println("What is your email address");
    String Email = blades.nextLine();
    System.out.println("What is your life goal");
    String Goal = blades.nextLine();
    System.out.println("Hello "+ name + ", You are " + age +" years old," + " You are a " + Gender +" Your address is " + Address + ", And your Email is " + Email + ". Finally your Life goal is to be "+ Goal +". Thank you For using our systems" );

  }
}*/

/*import java.util.Scanner;

public class Addmath{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of candidates: ");
        int numCandidates = scanner.nextInt();

        int selectedCandidates = 0;
        int rejectedCandidates = 0;

        for (int i = 1; i <= numCandidates; i++) {
            System.out.println("\nCandidate " + i + ":");
            int test1Score, test2Score, test3Score;

            System.out.print("Enter Test 1 score: ");
            test1Score = scanner.nextInt();

            System.out.print("Enter Test 2 score: ");
            test2Score = scanner.nextInt();

            System.out.print("Enter Test 3 score: ");
            test3Score = scanner.nextInt();

            double averageScore = (test1Score + test2Score + test3Score) / 3.0;

            if (test1Score < 75 && test2Score > 75 && test3Score > 75 && averageScore >= 80) {
                System.out.println("Candidate is selected!");
                selectedCandidates++;
            } else {
                System.out.println("Candidate is rejected.");
                rejectedCandidates++;
            }
        }

        System.out.println("\nSelected Candidates: " + selectedCandidates);
        System.out.println("Rejected Candidates: " + rejectedCandidates);

        if (selectedCandidates > 0) {
            System.out.println("\nMessage for sending call letters to the selected candidates: ");
            System.out.println("Dear Candidate, Congratulations! You have been selected for the interview.");
        }
        scanner.close();
    }
}*/
/*import java.util.Scanner;

public class Addmath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char cChoice = 'Y';
        int nTest1, nTest2, nTest3, nAverage;
        int nTotSelect = 0, nTotReject = 0;

        while (cChoice == 'Y' || cChoice == 'y') { // while loop
            System.out.print("Enter test1 score: ");
            nTest1 = scanner.nextInt();
            if (nTest1<=75) {
              continue;
            }
            System.out.print("Enter test2 score: ");
            nTest2 = scanner.nextInt();
            if (nTest2<=75) {
              continue;
            }
            System.out.print("Enter test3 score: ");
            nTest3 = scanner.nextInt();
            if (nTest3<=75) {
              continue;
            }
            nAverage = (nTest1 + nTest2 + nTest3) / 3;

            if (nAverage >= 80 && nTest1 > 75 && nTest2 > 75 && nTest3 > 75) {
                nTotSelect++;
            } else {
                nTotReject++;
            }

            System.out.print("Any more candidates (Y/N)? ");
            cChoice = scanner.next().charAt(0);
        }

        System.out.println("Number of candidates selected: " + nTotSelect);
        System.out.println("Number of candidates rejected: " + nTotReject);
        System.out.println("Send call letters to the selected candidates");
    }
}*/
// import java.util.Scanner;

// public class Addmath {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String choice;
//         int selectedCandidate = 0;
//         int rejectedCandidate = 0;

//         do {
//             System.out.println("Enter your Score: ");
//             int score = scan.nextInt();
//             if ((score >= 75) && (score<=100)) {
//                 System.out.println("Enter Your Second Score");
//                 int secondScore = scan.nextInt();
//                 if ((secondScore >= 75)&& (secondScore<=100)) {
//                     System.out.println("Enter Your Third Score");
//                     int thirdScore = scan.nextInt();
//                     if ((thirdScore>=75) && (thirdScore<100)) {
//                       System.out.println();
//                       continue;
//                     }
//                     double averageScore = (score + secondScore + thirdScore) / 3.0;
//                     if (averageScore >= 80) {
//                         System.out.println("You've been chosen");
//                         selectedCandidate++;
//                     } else {
//                         System.out.println("Try again later");
//                         rejectedCandidate++;
//                     }
//                 } else {
//                     System.out.println("You've been Rejected");
//                     rejectedCandidate++;
//                 }
//             } else {
//                 System.out.println("You've been rejected");
//                 rejectedCandidate++;
//             }

//             System.out.println("Do you want to continue? (Yes/No)");
//             choice = scan.next();
//         } while (choice.equalsIgnoreCase("Yes"));

//         System.out.println("Total selected candidates: " + selectedCandidate);
//         System.out.println("Total rejected candidates: " + rejectedCandidate);
//     }
// }
/*import java.util.Scanner;

public class Addmath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice;
        int selectedCandidate = 0;
        int rejectedCandidate = 0;

        do {
            System.out.println("Enter your Score: ");
            int score = scan.nextInt();
            if ((score >= 75) && (score<=100)) {
                System.out.println("Enter Your Second Score");
                int secondScore = scan.nextInt();
                if ((secondScore >= 75)&& (secondScore<=100)) {
                    System.out.println("Enter Your Third Score");
                    int thirdScore = scan.nextInt();
                    if ((thirdScore>=75) && (thirdScore<100)) {
                        double averageScore = (score + secondScore + thirdScore) / 3.0;
                        if (averageScore >= 80) {
                            System.out.println("You've been chosen");
                            selectedCandidate++;
                        } else {
                            System.out.println("Try again later");
                            rejectedCandidate++;
                        }
                    } else {
                        System.out.println("You've been Rejected");
                        rejectedCandidate++;
                    }
                } else {
                    System.out.println("You've been Rejected");
                    rejectedCandidate++;
                }
            } else {
                System.out.println("You've been rejected");
                rejectedCandidate++;
            }

            System.out.println("Do you want to continue? (Yes/No)");
            choice = scan.next();
        } while (choice.equalsIgnoreCase("Yes"));

        System.out.println("Total selected candidates: " + selectedCandidate);
        System.out.println("Total rejected candidates: " + rejectedCandidate);
    }
}*/
/*public class Addmath {

  public static void main(String[] args) {
    int arr[] []= {{10,7,8}, {11,3,6},{9,1,4}};
    // for(int i=0; i<3; i++){
    //   for (int j=0; j<3; j++){
         System.out.println(arr[1][0] + " ");
    //   }
    //   System.out.println();
    // }
  //System.out.println(arr[1][0]);
  }
}*/
      /*public class Addmath {

        public static void main(String[] args) {
          int rows = 4;
          int columns = 4;
          int array[][] = new int[rows][columns];
          int value = 1;
               for(int i=0; i < rows; i++){
             for (int j=0; j<columns; j++){
               array[i][j]= value;
               value++ ;
           }
           }
           for (int i = 0;  i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
            }
        }
      }*/
      // 3 dimensional arrays
           /*
              /*public class Addmath {

        public static void main(String[] args) {
          int rows = 4;
          int columns = 4;
          int array[][] = new int[rows][columns];
          int value = 1;
               for(int i=0; i < rows; i++){
             for (int j=0; j<columns; j++){
               array[i][j]= value;
               value++ ;
           }
           }
           for (int i = 0;  i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
            }
        }
      }*/
      /*public class Addmath {
        public static void main(String[] args) {
                     int arr[][][] = {{{10, 7, 8}, {11, 3, 6}}, {{9, 1, 4}, {20, 30, 40}}};
                     
                     // Use for loop to print out all the values in the array
                     for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                             for (int k = 0; k < 3; k++) {
                                 System.out.print(arr[i][j][k] + " ");
                             }
                             System.out.println();
                         }
                         System.out.println();
                     }
                   }
                 }
                 /*public class Addmath {
                          public static void main(String[] args) {
          int rows = 4;
          int columns = 4;
          int array[][][] = {{{10, 7, 8}, {11, 3, 6}}, {{9, 1, 4}, {20, 30, 40}}};;
          int value = 1;
               for(int i=0; i < 2; i++){
             for (int j=0; j<2; j++){
              for (int k=0; k<2; k++){
               array[i][j]= value;
               value++ ;
           }
           }
          }
           for (int i = 0;  i < 2; i++) {
            for (int j = 0; j < 2; j++) {
              for (int k=0; k < 2; k++) {
                System.out.print(array[i][j]+" ");
            }
          }
            System.out.println();
            }
        }*/

// import java.util.ArrayList;
// import java.util.List;

// public class Addmath {
        
//           public static void main(String[] args) {
//             //int num1=2;
//             //int num2=2;
//             //string string1 = new string("Peter");
//             //String string2 = new String("Peter");
//             //if (string1 .equals(string2)) {
//             //  System.out.println("the string are the same");
              
//             //}else
//             //System.out.println( "The string are not the same");
//             //}
//             List<Integer> arrayList = new ArrayList<Integer>(5);
//             for(int i=1; i <= 5; i++){
//               arrayList.add(i);
//             }
//             System.out.println(arrayList);
//             arrayList.remove(3);
//             System.out.println(arrayList);

//             for(int i = 0; i < arrayList.size(); i++){
//               System.out.print(arrayList.get(i)+ " ");
//             }
//             System.out.println();

//             for (int i: arrayList){
//               System.out.print(i + " ");
//             }
//           }
//         }
enum Mango{Carrie(10), Fairchild(9), Haden(12);
private int price;
Mango (int p)
{
  price = p;
}
int getPrice()
{
  return price;
}
class EnumTest{
  public static void main(String[] args) {
    Mango p = Mango.Carrie;
    System.out.println(p.getPrice());
  }
}
}

/*enum Mango{
  Carrie(10),
  Fairchild(9),
  Haden(12);

  private final int price;

  Mango(int p) {
    price = p;
  }

  int getPrice() {
    return price;
  }
}

class EnumTest{
  public static void main(String[] args) {
    Mango p = Mango.Carrie;
    System.out.println(p.getPrice());
  }
}*/
