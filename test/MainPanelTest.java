/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arthur
 */
public class MainPanelTest {
    
    public MainPanelTest() {
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
     * Test of clearPanel method, of class MainPanel.
     */
    @Test
    public void testClearPanel() {
        System.out.println("clearPanel");
        MainPanel instance = new MainPanel();
        instance.clearPanel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printRoomOptions method, of class MainPanel.
     */
    @Test
    public void testPrintRoomOptions() {
        System.out.println("printRoomOptions");
        MainPanel instance = new MainPanel();
        instance.printRoomOptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printLocation method, of class MainPanel.
     */
    @Test
    public void testPrintLocation() {
        System.out.println("printLocation");
        MainPanel instance = new MainPanel();
        String expResult = "";
        String result = instance.printLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreatePlayer method, of class MainPanel.
     */
    @Test
    public void testCreatePlayer() {
        System.out.println("CreatePlayer");
        String Name = "";
        String Gender = "";
        Boolean isPlayer = null;
        Room StartingLocation = null;
        MainPanel instance = new MainPanel();
        Person expResult = null;
        Person result = instance.CreatePlayer(Name, Gender, isPlayer, StartingLocation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PrintNeighboringRooms method, of class MainPanel.
     */
    @Test
    public void testPrintNeighboringRooms() {
        System.out.println("PrintNeighboringRooms");
        ArrayList<Room> NeighboringRooms = null;
        MainPanel instance = new MainPanel();
        String expResult = "";
        String result = instance.PrintNeighboringRooms(NeighboringRooms);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeRooms method, of class MainPanel.
     */
    @Test
    public void testChangeRooms() {
        System.out.println("changeRooms");
        int userSelection = 0;
        MainPanel instance = new MainPanel();
        instance.changeRooms(userSelection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMenu3 method, of class MainPanel.
     */
    @Test
    public void testPrintMenu3() {
        System.out.println("printMenu3");
        MainPanel instance = new MainPanel();
        instance.printMenu3();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkForProfessor method, of class MainPanel.
     */
    @Test
    public void testCheckForProfessor() {
        System.out.println("checkForProfessor");
        MainPanel instance = new MainPanel();
        instance.checkForProfessor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printIntro method, of class MainPanel.
     */
    @Test
    public void testPrintIntro() {
        System.out.println("printIntro");
        MainPanel instance = new MainPanel();
        instance.printIntro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProfessorToRandomRoom method, of class MainPanel.
     */
    @Test
    public void testAddProfessorToRandomRoom() {
        System.out.println("addProfessorToRandomRoom");
        MainPanel instance = new MainPanel();
        instance.addProfessorToRandomRoom();
    }

    /**
     * Test of actionPerformed method, of class MainPanel.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        MainPanel instance = new MainPanel();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
