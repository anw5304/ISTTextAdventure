/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author az060_001
 */
/*
public class RoomTest {
    
    public RoomTest() {
        Room IST210 = new Room("IST210",210);
        Room IST208 = new Room("IST208", 208);
        Person joe = new Person("Joe","Schmoe",IST210);
        Person arthur = new Person("Arthur","Zhang",IST210);
        ArrayList<Person> PeopleInRoom = new ArrayList<Person>();
        ArrayList<Room> NeighboringRooms = new ArrayList<Room>();
        ArrayList<String> RoomOptions = new ArrayList<String>();
        PeopleInRoom.add(joe);
        PeopleInRoom.add(joe);
        NeighboringRooms.add(IST208);
        RoomOptions.add("Change Rooms");
        RoomOptions.add("Check For Professor");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Room.
     */
/*
    @Test
    public void testGetName() {
        System.out.println("getName");
        Room IST210 = new Room("IST210",210);
        String expResult = "IST210";
        String result = IST210.getName();
        assertEquals(expResult, result);
    }
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        Room instance = new Room("IST210",210);
        int expResult = 210;
        int result = instance.getRoomNumber();
        assertEquals(expResult, result);
    }
    @Test
    /**
     * Test of getPeopleInRoom method, of class Room.
     */
/*
    public void testGetPeopleInRoom() {
        System.out.println("getPeopleInRoom");
        Room IST210 = new Room("IST210",210);
        Person Joe = new Person("Joe","Schmoe",IST210);
        Person Arthur = new Person("Arthur","Zhang",IST210);
        ArrayList<Person> expResult = new ArrayList<>();
        expResult.add(Joe);
        expResult.add(Arthur);
        ArrayList<Person> result = IST210.getPeopleInRoom();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetNeighboringRooms() {
        System.out.println("getPeopleInRoom");
        Room IST208 = new Room("IST208",208);
        Room IST210 = new Room("IST210",210);
        ArrayList<Room> expResult = new ArrayList<>();
        expResult.add(IST208);
        ArrayList<Room> result = IST210.getNeighboringRooms();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Room.
     */
/*
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Room instance = new Room("IST210",210);
        instance.setName(name);
    }

    /**
     * Test of setRoomNumber method, of class Room.
     */
/*
    @Test
    public void testSetRoomNumber() {
        System.out.println("setRoomNumber");
        int roomNumber = 210;
        Room instance = new Room("IST210",roomNumber);
        instance.setRoomNumber(roomNumber);
    }

    /**
     * Test of addPerson method, of class Room.
     */
/*
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        Room instance = new Room("IST210",210);
        Person personToAdd = new Person("Arthur","Zhang",instance);
        instance.addPerson(personToAdd);
    }

    /**
     * Test of addProfessor method, of class Room.
     */
/*
    @Test
    public void testAddProfessor() {
        System.out.println("addProfessor");
        Room instance = new Room("IST210",210);
        Professor professorToAdd = new Professor("Arthurn Zhang",);
        instance.addPerson(professorToAdd);
    }

    /**
     * Test of getHasProfessor method, of class Room.
     */
/*
    @Test
    public void testGetHasProfessor() {
        System.out.println("getHasProfessor");
        Room instance = new Room("IST210",210);
        Professor professorToAdd = new Professor("Arthur","Zhang",true,instance);
        instance.addPerson(professorToAdd);
        Boolean expResult = true;
        Boolean result = instance.getHasProfessor();
        assertEquals(expResult, result);
    }

    /**
     * Test of addRoom method, of class Room.
     */
/*
    @Test
    public void testAddRoom() {
        System.out.println("addRoom");
        Room roomToAdd = null;
        Room instance = null;
        instance.addRoom(roomToAdd);
    }

    /**
     * Test of getSingleRoom method, of class Room.
     */
/*
    @Test
    public void testGetSingleRoom() {
        System.out.println("getSingleRoom");
        int userSelection = 0;
        Room instance = null;
        Room expResult = null;
        Room result = instance.getSingleRoom(userSelection);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePerson method, of class Room.
     */
/*
    @Test
    public void testRemovePerson() {
        System.out.println("removePerson");
        Room instance = new Room("IST208",208);
        Person Joe = new Person("Joe","Schmoe",false,instance);
        Person Arthur = new Person("Arthur","Zhang",true,instance);
        ArrayList<Person> expResult = new ArrayList<>();
        expResult.add(Joe);
        ArrayList<Person> result = new ArrayList<>();
        expResult.add(Joe);
        expResult.add(Arthur);
        instance.removePerson();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomOptions method, of class Room.
     */
/*
    @Test
    public void testGetRoomOptions() {
        System.out.println("getRoomOptions");
        Room instance = new Room("IST208",208);
        ArrayList<String> RoomOptions = new ArrayList();
        RoomOptions.add("Change Rooms");
        RoomOptions.add("Check For Professor");
        ArrayList<String> expResult = new ArrayList();
        expResult.add("Change Rooms");
        expResult.add("Check For Professor");
        ArrayList<String> result = instance.getRoomOptions();
        assertEquals(expResult, result);
    }
}
*/