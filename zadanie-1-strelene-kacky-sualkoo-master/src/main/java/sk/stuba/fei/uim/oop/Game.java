package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    public void game() {

        /*System.out.println("Zadaj pocet hracov: ");
        int numOfPlayers = KeyInput.readInt();
        String name;
        List<Player> players = new ArrayList<>();
        Player player;
        Player player2;
        Property property;

        //nacitavanie hracov do listu
        for (int i = 0; i < numOfPlayers; i++){
            System.out.println("Meno " + (i+1) + ". hraca:");
            name = KeyInput.readString();
            players.add(new Player(name, 100000, 0, true,false));
        }

        //vytvorenie pola s nehnutelnostami
        Property[] gameArray = new Property[24];
        for (int j = 0; j < gameArray.length;j++){
            gameArray[j] = new Property(j,(j+1)*1000, false, null, (j+1)*100);
        }

        Chance chance = new Chance();

        Random rand = new Random();
        int dice;
        int i = 0;
        int start;
        int playersStillPlaying = numOfPlayers;

        //cyklus hry
        while(playersStillPlaying > 1){

            player = players.get(i);

            if (player.isPlaying()){
                //väzenie
                if(player.isPrison()) {
                    System.out.println("Si vo väzeni");
                    player.setPrison(false);
                }
                else {
                    dice = rand.nextInt(6) + 1;

                    //prechod startom
                    start = player.getPosition() + dice;
                    if (start > 23) {
                        System.out.println("Presiel si startom, ziskavas 10000");
                        player.setMoney(player.getMoney() + 10000);
                    }

                    player.setPosition(start);

                    System.out.println();
                    System.out.println("____________________________________");
                    System.out.println("Hrac: " + player.getName());
                    System.out.println("Stav uctu: " + player.getMoney());
                    System.out.println("Hod kockou: " + dice);
                    System.out.println("------------------------------------");
                    System.out.println();

                    property = gameArray[player.getPosition()];

                    //swtich na jednotlive policka hracej plochy
                    switch (player.getPosition()) {
                        case 0:
                            System.out.println("Si na Starte");
                            break;
                        case 6:
                            System.out.println("Navsteva väzenia");
                            break;
                        case 12:
                            System.out.println("Zaplat dan!");
                            player.setMoney(player.getMoney() - 10000);
                            break;
                        case 18:
                            System.out.println("Ides do väzenia!");
                            player.setPrison(true);
                            break;
                        case 3:
                        case 9:
                        case 15:
                        case 21:
                            System.out.println("Sanca");
                            chance.chance(player);
                            break;
                        default:
                            System.out.println("Cena nehnutelnosti: " + property.getPrice());
                            if (!property.isOwned())
                                System.out.println("Vlastnik: Bez vlastnika");
                            else
                                System.out.println("Vlastnik: " + property.getOwner().getName());
                            System.out.println("Dan: " + property.getTax());

                            //kupa nehnutelnosti / platba dane
                            if (!property.isOwned()) {
                                char flag;
                                if (player.getMoney() >= property.getPrice()) {
                                    System.out.println("Chces kupit nehnutelnost ?  (Y/N)");
                                    flag = KeyInput.readChar();
                                    if (flag == 'y') {
                                        property.setOwner(player);
                                        property.setOwned(true);
                                        player.setMoney(player.getMoney() - property.getPrice());
                                    }
                                } else
                                    System.out.println("Nemas dostatok financii!");
                            } else {
                                player.setMoney(player.getMoney() - property.getTax());
                                player2 = property.getOwner();
                                player2.setMoney(player.getMoney() + property.getTax());
                            }
                    }
                }
            }
            else
                playersStillPlaying -= 1;

            i++;
            if (i == numOfPlayers) {
                i = 0;
            }

        }*/
    }
}
