public class Task4_HittingGame {

  public static void Hits(){

      // Algorithms for Random number generation between minValue and maxValue is
      //  (int)(Math.random() * (maxValue - minValue) + 1) + minValue;
      
      int playerHits = 0, enemyHits = 0, totalHits = 1;
      int numberOfPlayers = (int)(Math.random() * (10 - 1) + 1) + 1; // Generate random number between 1 and 10
      System.out.println("Total number of pairs in your team is "+numberOfPlayers);

      while (totalHits<=numberOfPlayers){
          System.out.println("Pair of Numbers:");
          int num1 = (int)(Math.random() * 3);            // Generates random number between 0 and 3
          int num2 = (int)(Math.random() * 3);            // Generates random number between 0 and 3
          System.out.println("Number1: "+num1);
          System.out.println("Number2: "+num2);

          if (num1==num2){
              System.out.println("Enemy got hit by your");
              playerHits++;
          } else {
              System.out.println("You got hit by the enemy team!");
              enemyHits++;
          }
          totalHits++;
      }   

      if (playerHits>enemyHits){      /// checking hits player vs enemy
          System.out.println("Game Over! You Won");
      } else if (playerHits<enemyHits){
          System.out.println("Game Over! You Lost");
      } else if (playerHits==enemyHits){
          System.out.println("Game Over! It's a tie");
      }

  }      


  public static void main(String[] args) {

      Hits();

  }     // end of main() method
}        //  end of program