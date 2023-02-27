package day07_practices;

public class CrewAndPassenger {
    public static void main(String[] args) {

       int numOfPeople= 25;

       String result="Any other number of people on the ship is not valid ";

       if (numOfPeople==50 || numOfPeople==75 || numOfPeople==100){

           if(numOfPeople==50){
               result= "20 crew , 30 passenger";
           }else if(numOfPeople==75){
               result= "25 crew , 50 passenger";
           }{
               result= "30 crew , 70 passenger";
           }

       }

        System.out.println(result);


    }
}
