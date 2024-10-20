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
                "\nwhat do you think, should you exlore the typhoon (1), go to skull island to find pirates (2) or go to the  Jade lybrary(3)");//jade library = 1
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
                        "\nYou go back to your ship with information and must decide where you go next, do you go to the Emerald Lybrary (1) or try your inside the typhoon, a ship graveyard with treasure(2)?");//emerald lybray is 2
                        response = sc.nextLine();

                        if(response.equals("1")){
                            System.out.println("Your ship enters the golden harbor of the Great Emerald Lybrary, you are amazed that such a center of knoledge exist"+//lybrary 2
                            "\nYou enter the Lybrary and ask the Librarian if they know anything about the ultimate treasure, They tell you they have three scrols about it, but you can only read one."+
                            "\nThe lybrarian presents you with The scroll of maps (1), the scroll of knoledge(2) and the scroll of power.(3) wich one do you chose?");
                            response = sc.nextLine();
                            if(response.equals("1")){
                                System.out.println("You have chosen the scroll of maps"+
                                "\nThe lybrain has a creepy smile on their face as they leed you down a corridor, they annonce 'here it is' "+
                                "\nYou pick up the scrool and feel power flowing though you viens, you exclaim 'this is it, we found it' "+
                                "\nYou head back to your ship with the knowledge of the treasure in mind, you tell everyone to head to turtle island."+
                                "\nYour ship arrive turle island and you order one of the sailors to dig at a specific spot, his shovel hits something hard"+
                                "\nThis is it the treasure is in your grasp, do you share it with the crew (1) or keep it to yourself(2)");//survive
                                response= sc.nextLine();
    
                                if (response.equals("1")){
                                    System.out.println("You invite your crew over and tell them take all that you can, you deserve it"+
                                    "\nCONGRATULATIONS, YOU WON THE GAME.");
                                }
                                else{
                                    System.out.println("you feel that the crew did nothing and that you alone should get the treasure, one of the sailors finds out."+
                                    "\nthe smell of treachery fills the air, At night the crew stabs you repeatidly, your greed led you to your downfall"+
                                    "\nYou died a greedy pirate, good game.");
                                }//survive
                            }
                            else if(response.equals("2")){
                                System.out.println("You have chosen the scroll of knoledge"+
                                "\nThe lybrarian leads you down a creepy corridor and annoces, here it is."+
                                "\n You bend to pick it up and when you open it you feel your brain heating up"+
                                "\nyou drop to your knees and scream. You chose the wrong scrool, you died, good game");//death
                            }
                            else{
                                System.out.println("You have chosen the scroll of power."+
                                "\nThe lybrarian leads you down a creepy corridor and annoces, here it is."+
                                "\n You bend to pick it up and when you open it you feel your brain heating up"+
                                "\nyou drop to your knees and scream. You chose the wrong scrool, you died, good game");//death
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
                    System.out.println("Your ship enters the golden harbor of the Great Jade Lybrary, you are amazed that such a center of knoledge exist"+//lybrary 1
                    "\nYou enter the Lybrary and ask the Librarian if they know anything about the ultimate treasure, They tell you they have three scrols about it, but you can only read one."+
                    "\nThe lybrarian presents you with The scroll of maps (1), the scroll of knoledge(2) and the scroll of power.(3) wich one do you chose?");
                    response = sc.nextLine();
                    if(response.equals("1")){
                        System.out.println("You have chosen the scroll of maps"+
                        "\nThe lybrarian leads you down a creepy corridor and annoces, here it is."+
                        "\n You bend to pick it up and when you open it you feel your brain heating up"+
                        "\nyou drop to your knees and scream. You chose the wrong scrool, you died, good game");//death
                    }
                    else if(response.equals("2")){
                        System.out.println("You have chosen the scroll of knowledge"+
                        "\nThe lybrain has a creepy smile on their face as they leed you down a corridor, they annonce 'here it is'"+
                        "\nYou pick up the scrool and feel power flowing though you viens, you exclaim 'this is it, we found it' "+
                        "\nYou head back to your ship with the knowledge of the treasure in mind, you tell everyone to head to turtle island."+
                        "\nYour ship arrive turle island and you order one of the sailors to dig at a specific spot, his shovel hits something hard"+
                        "\nThis is it the treasure is in your grasp, do you share it with the crew (1) or keep it to yourself(2)");//survive
                        response= sc.nextLine();

                        if (response.equals("1")){
                            System.out.println("You invite your crew over and tell them take all that you can, you deserve it"+
                            "\nCONGRATULATIONS, YOU WON THE GAME.");
                        }
                        else{
                            System.out.println("you feel that the crew did nothing and that you alone should get the treasure, one of the sailors finds out."+
                            "\nthe smell of treachery fills the air, At night the crew stabs you repeatidly, your greed led you to your downfall"+
                            "\nYou died a greedy pirate, good game.");
                        }
                    }
                    else{
                        System.out.println("You have chosen the scroll of power."+
                        "\nThe lybrarian leads you down a creepy corridor and annoces, here it is."+
                        "\n You bend to pick it up and when you open it you feel your brain heating up"+
                        "\nyou drop to your knees and scream. You chose the wrong scrool, you died, good game");//death
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
                    "\nYou go back to your ship with information and must decide where you go next, do you go to the Ruby Lybrary (1) or try your chance at a random island? (2)");//ruby library is num 3
                    response = sc.nextLine();
                    if (response.equals("1")){
                        System.out.println("Your ship enters the golden harbor of the Great Ruby Lybrary, you are amazed that such a center of knowledge exist"+//lybrary 3
                        "\nYou enter the Lybrary and ask the Librarian if they know anything about the ultimate treasure, They tell you they have three scrols about it, but you can only read one."+
                        "\nThe lybrarian presents you with The scroll of maps (1), the scroll of knoledge(2) and the scroll of power.(3) wich one do you chose?");
                        response = sc.nextLine();
                        if(response.equals("1")){
                            System.out.println("You have chosen the scroll of maps"+
                            "\nThe lybrarian leads you down a creepy corridor and annoces, here it is."+
                            "\nYou bend to pick it up and when you open it you feel your brain heating up"+
                            "\nyou drop to your knees and scream. You chose the wrong scrool, you died, good game");//death

                        }
                        else if(response.equals("2")){
                            System.out.println("You have chosen the scroll of knowledge"+
                            "\nThe lybrarian leads you down a creepy corridor and annoces, here it is."+
                            "\n You bend to pick it up and when you open it you feel your brain heating up"+
                            "\nyou drop to your knees and scream. You chose the wrong scrool, you died, good game");//death
                        }
                        else{
                            System.out.println("You have chosen the scroll of power."+
                            "\nThe lybrain has a creepy smile on their face as they leed you down a corridor, they annonce 'here it is' "+
                            "\nYou pick up the scrool and feel power flowing though you viens, you exclaim 'this is it, we found it' "+
                            "\nYou head back to your ship with the knowledge of the treasure in mind, you tell everyone to head to turtle island."+
                            "\nYour ship arrive turle island and you order one of the sailors to dig at a specific spot, his shovel hits something hard"+
                            "\nThis is it the treasure is in your grasp, do you share it with the crew (1) or keep it to yourself(2)");//survive
                            response= sc.nextLine();

                            if (response.equals("1")){
                                System.out.println("You invite your crew over and tell them take all that you can, you deserve it"+
                                "\nCONGRATULATIONS, YOU WON THE GAME.");
                            }
                            else{
                                System.out.println("you feel that the crew did nothing and that you alone should get the treasure, one of the sailors finds out."+
                                "\nthe smell of treachery fills the air, At night the crew stabs you repeatidly, your greed led you to your downfall"+
                                "\nYou died a greedy pirate, good game.");
                            }
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