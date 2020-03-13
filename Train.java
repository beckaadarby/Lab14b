import java.awt.*;
import java.util.ArrayList;
import java.applet.*;

public class Train{

  private int xPos;
  private int yPos;
  private String type;
  private Color color;
  ArrayList<RailCar> train;

  public Train (int xPos, int yPos){
    train = new ArrayList<RailCar>();
    this.xPos = xPos;
    this.yPos = yPos;
    //System.out.println("Train Constructed");
  }

  public void addCar(String type, Color color){


    if(type== "Locomotive"){
      train.add(new Locomotive(color,(xPos*(train.size()+1)), yPos));
    }else if(type=="PassengerCar"){
      RailCar passengerCar = new PassengerCar(color, xPos*(train.size()+ 1)+(75*train.size()), yPos);
      train.add(passengerCar);
    }else if(type=="FreightCar"){
      RailCar freightCar = new FreightCar(color, xPos*(train.size()+1)+(75*train.size()), yPos);
      train.add(freightCar);
    }else if(type=="Caboose"){
      RailCar caboose = new Caboose(color, xPos*(train.size()+1)+(75*train.size()), yPos);
      train.add(caboose);
    }

    //System.out.println("Car Added");
  }


  public  void showCars(Graphics g){
    for(int x=0;x<train.size();x++){
      train.get(x).drawCar(g);
    }
    //System.out.println("Cars Shown");
  }


}
