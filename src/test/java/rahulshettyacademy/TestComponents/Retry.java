package rahulshettyacademy.TestComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry  implements IRetryAnalyzer{
	int count = 0;
	int maxTry = 1;


	//Tsting testing 123
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
	
		if(count<maxTry) {
			
			count++;
		return true;
		}
		return false;
		//error new
		
	}

}
