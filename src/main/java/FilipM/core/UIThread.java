package FilipM.core;

import java.time.LocalTime;
import java.util.Map;
import java.util.Scanner;

public class UIThread extends Thread{

    private DataStorage dataStorage;

    public UIThread(DataStorage dataStorage){
        this.dataStorage = dataStorage;
    }

    @Override
    public synchronized void start() {
        System.out.println(getName() + " started at " + LocalTime.now());
        super.start();
    }

    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        String chosenOption = "";

        do {
            System.out.println("----------//////////<FANCY SPACER>//////////----------");
            System.out.println("To start application type '1'");
            System.out.println("To print average speed for all Gdansk vehicles type '2'");
            System.out.println("To print average speed for all Gdansk vehicles grouped by line type '3'");
            System.out.println("To print average speed for given line type '4'");
            System.out.println("To quit application type 'q'");
            chosenOption = scan.nextLine();

            if ("1".equals(chosenOption)){
                System.out.println(dataStorage.getVehicle());
            } else  if ("2".equals(chosenOption)){
                Double avgSpeed = Calculator.avgSpeed(dataStorage.getVehicle());
                System.out.println(avgSpeed);
            }else if ("3".equals(chosenOption)){
                Map<String, Double> avgSpeedByLine = Calculator.avgSpeedByLine(dataStorage.getVehicle());
                System.out.println(avgSpeedByLine);
            }else if ("4".equals(chosenOption)){
                System.out.println("Enter line number");
                String lineNumber = scan.nextLine();
                Calculator.avgSpeedForGivenLine(lineNumber,dataStorage.getVehicle());
            }

        }while (!"q".equals(chosenOption));

     //   super.run();
    }
}
