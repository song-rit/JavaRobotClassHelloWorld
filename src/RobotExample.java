import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotExample {
	
	private static Robot robot;
	
	 public static void main(String[] args) {
		 
		 
		 try {
			robot = new Robot();
			RobotExample robotEx = new RobotExample();
			robotEx.test2();
		} catch (AWTException e) {
			e.printStackTrace();
		}

	 }
	 
	 public void test1() {
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_W);	 
        robot.keyPress(KeyEvent.VK_O);	 
        robot.keyPress(KeyEvent.VK_R);	 
        robot.keyPress(KeyEvent.VK_L);	 
        robot.keyPress(KeyEvent.VK_D);	

	 }
	 
	 public void test2() {
		 robot.setAutoDelay(40);
		    robot.setAutoWaitForIdle(true);
		    
		    robot.delay(4000);
		    robot.mouseMove(40, 130);
		    robot.delay(500);

		    leftClick();
		    robot.delay(500);
		    leftClick();

		    robot.delay(500);
		    type("Hello world");

//		    robot.mouseMove(40, 160);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.delay(500);

		    leftClick();
		    robot.delay(500);
		    leftClick();
		    
		    robot.delay(500);
		    type("Now I'm Testing for Robot class");
		    
		    robot.delay(50);
//		    type(KeyEvent.VK_DOWN);
		    robot.keyPress(KeyEvent.VK_ENTER);

		    
		    robot.delay(1000);
		    type("OK ...");

		    robot.delay(1000);
		    System.exit(0); 
	 }
	 
	 
	 private void leftClick()
	  {
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    robot.delay(200);
	  }
	  
	  private void type(int i)
	  {
	    robot.delay(40);
	    robot.keyPress(i);
	    robot.keyRelease(i);
	  }

	  private void type(String s)
	  {
	    byte[] bytes = s.getBytes();
	    for (byte b : bytes)
	    {
	      int code = b;
	      // keycode only handles [A-Z] (which is ASCII decimal [65-90])
	      if (code > 96 && code < 123) code = code - 32;
	      robot.delay(40);
	      robot.keyPress(code);
	      robot.keyRelease(code);
	    }
	  }

}
