
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class MainPanel extends JPanel implements ActionListener{
    
    private ButtonPanel button;
    private IntroPanel intro;
    private GamePanel game;
    private CreditsPanel credits;
    
    private int PaneDisplayed;
    private Player Player;
    private Room Lobby;
    private Room IST201;
    private Room IST202;
    private Room IST203;
    private Room IST205;
    private Room IST206;
    private Room IST208;
    private Room IST210;
    private Professor professor;
    private int menuValue;
    
    MainPanel(){
        super();
        setBackground(Color.gray);		
        setLayout(new BorderLayout());
        
            Lobby = new Room("Lobby", 0);
            IST201 = new Room("IST201", 201);
            IST202 = new Room("IST202", 202);
            IST203 = new Room("IST203", 203);
            IST205 = new Room("IST205", 205);
            IST206 = new Room("IST206", 206);
            IST208 = new Room("IST208", 208);
            IST210 = new Room("IST210", 210);
            Lobby.addRoom(IST201);
            Lobby.addRoom(IST202);
            Lobby.addRoom(IST203);
            Lobby.addRoom(IST205);
            Lobby.addRoom(IST206);
            Lobby.addRoom(IST208);
            Lobby.addRoom(IST210);
            IST210.addRoom(Lobby);
            IST208.addRoom(Lobby);
            IST201.addRoom(Lobby);
            IST202.addRoom(Lobby);
            IST203.addRoom(Lobby);
            IST205.addRoom(Lobby);
            IST206.addRoom(Lobby);
            professor = new Professor("Dr.Rimland", "Male", Lobby, false, true);
            menuValue = 1;
        
            
        intro = new IntroPanel();
        game = new GamePanel();
        credits = new CreditsPanel();
        
        button = new ButtonPanel();
        
        add(intro, BorderLayout.CENTER);
        PaneDisplayed = 1;
        
        add(button, BorderLayout.SOUTH);
        button.ActionButton.addActionListener(this);
}
    public void clearPanel(){
        remove(intro);
        remove(game);
        revalidate();
        repaint();
        }
    public void printRoomOptions(){
        Room currentRoom = Player.getLocation();
        game.PrintToGameText("WHAT WOULD YOU LIKE TO DO?" + System.lineSeparator());
        ArrayList optionsList = currentRoom.getRoomOptions();
        for (int i = 0; i < optionsList.size(); i++){
            int optionNumber = i + 1;
            game.PrintToGameText(optionNumber + ".)" + optionsList.get(i) + System.lineSeparator() );
        }
            game.PrintToGameText(System.lineSeparator());
            int menuValue = 1;
    }
    public String printLocation(){
        Room currentRoom = Player.getLocation();
        if(currentRoom.getName().equals("Lobby")){
            return("You are in the " + currentRoom.getName() + System.lineSeparator());
        }else{
        return ("You are in " + currentRoom.getName() + System.lineSeparator());
            }
    }
    public Player CreatePlayer(String Name, String Gender, Boolean isPlayer, Room StartingLocation){
        return new Player(Name, Gender, isPlayer, StartingLocation);
    }
    public String PrintNeighboringRooms(ArrayList<Room> NeighboringRooms){
        String stringToPrint = ("WHAT ROOM WOULD YOU LIKE TO MOVE TO?" + System.lineSeparator());
            for(int i = 0; i < NeighboringRooms.size(); i++){
                Room tempRoom = NeighboringRooms.get(i);
                int displayNumber = i + 1;
                stringToPrint = (stringToPrint + displayNumber + (".)") + tempRoom.getName() + System.lineSeparator());
            }
        
             return stringToPrint;   
    }
    public void changeRooms(int userSelection){
            Room currentRoom = Player.getLocation();
            currentRoom.removePerson();
            Room roomToGoTo = currentRoom.getSingleRoom(userSelection);
            Player.setLocation(roomToGoTo);
            currentRoom = Player.getLocation();
            currentRoom.addPerson(Player);
            printLocation();
            game.PrintToGameText(printLocation());
            printRoomOptions();
            
    }
    public void printMenu3(){
            game.PrintToGameText("Would you like to turn in your homework to " + professor.getName() + "?" + System.lineSeparator() + "1.)Yes" +System.lineSeparator() + "2.)No");
            menuValue = 3;
        }   
    public void checkForProfessor(){
        Room CurrentRoom = Player.getLocation();
        boolean hasProfessor = CurrentRoom.getHasProfessor();
        
        if(hasProfessor == true){
            game.PrintToGameText("Your professor is in the room!" + System.lineSeparator());
             printMenu3();
           
        }else{
            game.PrintToGameText("Your proffessor doesn't seem to be here" + System.lineSeparator());
            printRoomOptions();
        }
    }
    public void printIntro(){
        game.PrintToGameText("You are walking to the IST building running a little late for class. You walk up the Stairs and into the lobby. Now you must find your professor and turn in your homework. Good luck remembering what room he's in." + System.lineSeparator() + System.lineSeparator());
    }
    
    public void addProfessorToRandomRoom()
    {
        int[] roomNums = {201,202,203,205,206,208,210};
        Random rand = new Random();
        int randomRoom = roomNums[rand.nextInt(roomNums.length)];
        
        if (randomRoom == 201)
        {
            IST201.addPerson(professor);
            professor.setLocation(IST201);
        }
        else if (randomRoom == 202)
        {
            IST202.addPerson(professor);
            professor.setLocation(IST202);
        }
        else if (randomRoom == 203)
        {
            IST203.addPerson(professor);
            professor.setLocation(IST203);
        }
        else if (randomRoom == 205)
        {
            IST205.addPerson(professor);
            professor.setLocation(IST205);
        }
        else if (randomRoom == 206)
        {
            IST206.addPerson(professor);
            professor.setLocation(IST206);
        }
        else if (randomRoom == 208)
        {
            IST208.addPerson(professor);
            professor.setLocation(IST208);
        }
        else if (randomRoom == 210)
        {
            IST210.addPerson(professor);
            professor.setLocation(IST210);
        }
    }
    //Refactor - Extract Method - Adam
    public int TransitionIntroToGame(){
        clearPanel();
            add(game);
            printIntro();
            game.PrintToGameText(printLocation());
            button.setTextEnter();
            printRoomOptions();
            game.setUserSelectionModelMain();
            return PaneDisplayed = 2;
    }
    //Refactor - Extract Method - Adam 
    public void TransitionGameToCredits(){
        clearPanel();
        remove(button);
        add(credits, BorderLayout.CENTER);
    }
    //Refactor - Extract Method - Adam
    public void PrintSwitchRoomMenu(){
        Room CurrentRoom = Player.getLocation();
        ArrayList RoomList = CurrentRoom.getNeighboringRooms();
        game.PrintToGameText(PrintNeighboringRooms(RoomList));
        if(CurrentRoom.equals(Lobby)){
            game.setUserSelectionModelLobby();
        }else{
            game.setUserSelectionModelClassroom();
        }
        menuValue = 2;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(PaneDisplayed == 1){
            Player = CreatePlayer(intro.getName(), intro.getGender(), true, Lobby);
            addProfessorToRandomRoom();
            Lobby.addPerson(Player);
            PaneDisplayed = TransitionIntroToGame();
            
        }else{
          
            int userSelection = game.getUserSelectionNumber();
            boolean usedAMenu = false;
            
            if (menuValue == 2){ 
                userSelection = userSelection - 1;   
                changeRooms(userSelection);
                menuValue = 1;
                game.setUserSelectionModelMain();
                usedAMenu = true;
                
           }
           
            if (menuValue == 1 && usedAMenu == false){
               
                if(userSelection == 2){
                   checkForProfessor();
               }else{
                   PrintSwitchRoomMenu();
                }usedAMenu = true;
                
           }if (menuValue == 3 && usedAMenu == false ){
               if(userSelection == 1){
                   TransitionGameToCredits();
               }else{
                   printRoomOptions();
               }
               
           }
           
        }
    }
    }