package Testing;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.Rule;
import org.junit.Assert;

public class JUnit_Test 
{
   @Rule
   public ErrorCollector ec= new ErrorCollector();
   @Test
   public void Beginner_Test()
   {
	   Main junitTest= new Main ();
	   String actual_result = junitTest.();
	   String expected_result = "Non matey";
	   try{
		   Assert.assertEquals( expected_result, actual_result);
	   }catch(Throwable t)
	   {
		   System.out.println("Caught and Error");
		   ec.addError(t);
	   }
	   System.out.println("Comparison Done");
   }
   @Test
   public void Intermediate_Test()
   {
	   Main junit = new Main();
	   String actual_result = JUnit_Test.Intermediate();
	   String expected_result = " ";
	   try{
		   Assert.assertEquals( expected_result, actual_result);
	   }catch(Throwable t)
	   {
		   System.out.println("Caught an Error");
		   ec.addError(t);
	   }
	   System.out.println("Comparison Done");
    }
   @Test
   public void Hard_Difficulty()
   {
	   Main junit = new Main();
	   String actual_result = JUnit_Test.Hard();
	   
   }
}
