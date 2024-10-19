import java.util.Scanner;
public class Adventure{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        
        System.out.println("You are an adventurous pirate captain and the latest lord of the sea has just died,"+//intro
        "\nit is now your life mission to find the treasure and bring your fammily glory, to chose options chose between 1 or 2");
            
        
        System.out.println("now where do you want to go, The bar island(1) or skull island(2)?");//first choice
        String response = sc.nextLine();

       // while(true){    
            if(response.equals("1")){
                
                System.out.println("You head to the bar island." +
                "\nAn old man tells you the tale of his grandfather, he heard the treasure was located near the typhoon."+
                "\nwhat do you think, should you exlore the typhoon (1), go to skull island to find pirates (2) or go to the lybrary(3)");
                response = sc.nextLine();
                
                if(response.equals("1")){
                    System.out.println("you Listen to the old man and head in the typhoon"+
                    "\nYour ship enters the typhoon, large waves rock the ship  soon water floods."+
                    "\nin the distace you spot a golden light with an island of gold, that visoion disipates as your body hits the water"+
                    "\nThe old man lured you to your death, good game, you died.");//deah path
                
                }
                else if(response.equals("2")){
                    System.out.println("you head to the skull island, with the thought of the old man."+ //skull island 2
                    "\nOn the skull island there are dangerous pirates and they ask you for a toll"+
                    "\nYou and your crew think, should you give them the toll (1) or ignore the demand and ask them about the treasure (2).");
                    response = sc.nextLine();
                    if(response.equals("1")){
                        System.out.println("You give the pirates a toll and they laugh, they say 'Your the first one to give us money, the rest died'"+
                        "\nYou ask kindly if they have info about the secret treasure and they say that you should look at the lybrary."+
                        "\nYou go back to your ship with information and must decide where you go next, do you go to the Lybrary (1) or try your inside the typhoon, a ship graveyard with treasure(2)?");
                        response = sc.nextLine();

                        if(response.equals("1")){
                            System.out.println("Your ship enters the golden harbor of the Great Lybrary, you are amazed that such a center of knoledge exist"+//lybrary 2
                            "\nYou enter the Lybrary and ask the Librarian if they know anything about the ultimate treasure, They tell you they have three scrols about it, but you can only read one."+
                            "\nThe lybrarian presents you with The scroll of maps (1), the scroll of knoledge(2) and the scroll of power.(3) wich one do you chose?");
                            response = sc.nextLine();
                            if(response.equals("1")){
                                System.out.println("You have chosen the scroll of maps");//survive
                            }
                            else if(response.equals("2")){
                                System.out.println("You have chosen the scroll of knoledge");//death
                            }
                            else{
                                System.out.println("You have chosen the scroll of power.");//death
                            }
                        }
                        else{
                            System.out.println("you dont listen to the pirates and head in the typhoon"+
                            "\nYour ship enters the typhoon, large waves rock the ship  soon water floods."+
                            "\nin the distace you spot a golden light with an island of gold, that visoion disipates as your body hits the water"+
                            "\nThe old man lured you to your death, good game, you died.");//deah path
                        }
                    }
                    else if (response.equals("2")){
                        System.out.println("the pirates visibly angered by your nerve attack your ship and you perish, good game and try again");//death path
                    }
                }
                else{
                    System.out.println("Your ship enters the golden harbor of the Great Lybrary, you are amazed that such a center of knoledge exist"+//lybrary 1
                    "\nYou enter the Lybrary and ask the Librarian if they know anything about the ultimate treasure, They tell you they have three scrols about it, but you can only read one."+
                    "\nThe lybrarian presents you with The scroll of maps (1), the scroll of knoledge(2) and the scroll of power.(3) wich one do you chose?");
                    response = sc.nextLine();
                    if(response.equals("1")){
                        System.out.println("You have chosen the scroll of maps");//death
                    }
                    else if(response.equals("2")){
                        System.out.println("You have chosen the scroll of knoledge");//survive
                    }
                    else{
                        System.out.println("You have chosen the scroll of power.");//death
                    }
                }
            }
            else if (response.equals("2")) {
                
                System.out.println("You head to the skull island."+
                "\nOn the skull island there are dangerous pirates and they ask you for a toll"+//skull island 1
                "\nYou and your crew think, should you give them the toll (1) or ignore the demand and ask them about the treasure (2).");
                response = sc.nextLine();
                if(response.equals("1")){
                    System.out.println("You give the pirates a toll and they laugh, they say 'Your the first one to give us money, the rest died'"+
                    "\nYou ask kindly if they have info about the secret treasure and they say that you should look at the lybrary."+
                    "\nYou go back to your ship with information and must decide where you go next, do you go to the Lybrary (1) or try your chance at a random island? (2)");
                    response = sc.nextLine();
                    if (response.equals("1")){
                        System.out.println("Your ship enters the golden harbor of the Great Lybrary, you are amazed that such a center of knoledge exist"+//lybrary 3
                        "\nYou enter the Lybrary and ask the Librarian if they know anything about the ultimate treasure, They tell you they have three scrols about it, but you can only read one."+
                        "\nThe lybrarian presents you with The scroll of maps (1), the scroll of knoledge(2) and the scroll of power.(3) wich one do you chose?");
                        response = sc.nextLine();
                        if(response.equals("1")){
                            System.out.println("You have chosen the scroll of maps");//death
                        }
                        else if(response.equals("2")){
                            System.out.println("You have chosen the scroll of knoledge");//death
                        }
                        else{
                            System.out.println("You have chosen the scroll of power.");//survive
                        }
                    }
                    else{
                        System.out.println("You head to what you think is a random island but is in fact a British navy ambush."+
                        "\nThey take control of your ship and tell you, 'you will be hanged for piracy'. This sends shivers down your spine"+
                        "\nThe next day they bring you and your crew to the gallows and place the ropes around your necks. one by one they kick the bucket"+
                        "\nIt is now your turn, you look at the crowd, think of the treasure and then they kick your bucket. You died, good game.");//deathpath
                    }
                    
                }
                else if (response.equals("2")){
                    System.out.println("the pirates visibly angered by your nerve attack your ship and you perish, good game and try again");//death path
                }
            }
       // }

    sc.close();
    }
}
