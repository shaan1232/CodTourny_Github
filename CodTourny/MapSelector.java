import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class MapSelector{

  private ArrayList<String> chosenMaps;

  public MapSelector(int nMaps){
    String[] toWord = {"Aisle_9","Atrium","Bazaar","Cargo","Docks","Gulag","Hill","King","LiveStock","Pine","Rust","Shipment","SpeedBall","Stack","Trench","Verdansk_Stadium"};


    chosenMaps = new ArrayList<String>();


    Scanner input = new Scanner(System.in);
    int playerChoice;


    printMapList();
    for (int i = 0; i < nMaps; i++){
      System.out.println("Enter map digit for choice #"+(i+1));
      playerChoice = input.nextInt();
//      System.out.println("Added map '"+printMapList(playerChoice)+" to tournament.'\n");
      chosenMaps.add(toWord[playerChoice]);
    }
  }

  private void printMapList(){
    String[] toWord = {"Aisle_9","Atrium","Bazaar","Cargo","Docks","Gulag","Hill","King","LiveStock","Pine","Rust","Shipment","SpeedBall","Stack","Trench","Verdansk_Stadium"};

    for (int i = 0; i < 16; i++){
      System.out.println("CODE:"+i+" MAP: "+toWord[i]);
    }
  }

  public String getCurrentMap(int i){
    return chosenMaps.get(i);
  }

}
