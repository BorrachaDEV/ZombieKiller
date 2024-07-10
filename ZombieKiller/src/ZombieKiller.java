import java.util.Random;
import java.util.Scanner;

public class ZombieKiller {

    public static void main(String[]args){
        System.out.println("WELCOME TO KILLERZOMBIE");
        String dd = "You are Dead!";



        Scanner scan = new Scanner(System.in);System.out.println("whats your Low Range Gun?");
        String lowRangeGun = scan.nextLine();

        System.out.println("whats your Middle Range Gun?");
        String middleRangeGun =scan.nextLine();

        System.out.println("whats your Long Range Gun?");
        String longRangeGun =scan.nextLine();System.out.println("This is your guns");

        System.out.println(lowRangeGun);
        System.out.println(middleRangeGun);
        System.out.println(longRangeGun);


        System.out.println("Now is time to kill some Zombies");


        System.out.println("For Close Zombies your gonna use your "+lowRangeGun);
        System.out.println(" For medium distance zombies your gonna use "+middleRangeGun);
        System.out.println(" an for last, for distance zombie you gonna use "+longRangeGun);
        System.out.println(" GOOD LUCK AN GOOD NIGHT(PRESS ENTER TO START)");
        String start =scan.nextLine();

        String [] arr = {"Close Zombie", "Medium Range Zombie", "Long Range Zombie"};
        Random ran = new Random();
        int score=0;
        int life = 3;

        for (int i=0;i<100000;i++){
            int select = ran.nextInt(arr.length);
            String selectedZombie = arr[select];
            System.out.println(selectedZombie+", What gun you gonna use?");
            String gunToUse = scan.nextLine();

            if (selectedZombie.equals("Close Zombie") && gunToUse.equalsIgnoreCase(lowRangeGun)){
                score++;
                System.out.println("You kill the zombie using a"+lowRangeGun+" score is: "+score);
            }
            else if (selectedZombie.equals("Medium Range Zombie") && gunToUse.equalsIgnoreCase(middleRangeGun)){
                score++;
                System.out.println("You kill the zombie using a"+middleRangeGun+" score is: "+score);
            }
            else if (selectedZombie.equals("Long Range Zombie") && gunToUse.equalsIgnoreCase(longRangeGun)){
                score++;
                System.out.println("You kill the zombie using a"+longRangeGun+" score is: "+score);
            }
            else if (life <=0){
                System.out.println("you killed "+score+" zombies, you fight well soldier, but now your wife and kids are dead:(");
                break;}
            else {
                score --;
                life --;
                System.out.println("you missed now your score is: "+score+" you  life is : "+life+"/3");
                continue;
            }
        }

    }


}


