import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    //System.out.println(totalScore);
    //System.out.println(totalScore.size());

    double total = 0;
    for(int score : totalScore){
      total+= score;
    }
    double average = total / totalScore.size();
    System.out.println("Average: " + average);
  

  int lowest = 0; // > 600
  int low = 0; //600-800
  int ave = 0; // 800-1000
  int higher = 0; //1100-1300;
  int highest = 0; //1400-1599;
  int perfect = 0; //1600
  

  for(int score : totalScore){
    if(score < 600){
      lowest ++;
    } else if (score < 800){
      low++;
    } else if (score < 1100){
      ave ++;
    } else if (score < 1300){
      higher ++;
    } else if (score <= 1600){
      highest ++;
    } else if (score == 1600){
      perfect ++;
    }
  }

System.out.println("\nScores:\nBelow 600: " + lowest + "\n600-800: "+low+"\n800-1000: " + ave + "\n1000-1300: " +higher + "\n1300-1599: " + highest + "\nPerfect Score: " + perfect);
  }
}