package package1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import package1.FlexWebDriver;

public class FlexTest {

	public static void main(String[] args) throws InterruptedException {

		/*System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();*/

		System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Eclipse/Workspace/SelFlexDemoApp/bin/selben.html");


		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(8000);



		FlexWebDriver flashApp = new FlexWebDriver(driver,"selben");

	

/*
		flashApp.click("ButtonBarButton19");

		Thread.sleep(2000);

		flashApp.alertResponse("OK");


		flashApp.click("LinkButton61");

		Thread.sleep(2000);

		flashApp.alertResponse("OK");

		flashApp.click("button");
		flashApp.click("button");
		flashApp.click("button");



		flashApp.FlexType("num","40");

		flashApp.click("checkBox");

		flashApp.click("radioButton1");

		System.out.println(flashApp.getFlexText("radioBoxLabel"));

		System.out.println(flashApp.getFlexDataGridRowCount("dataGrid"));

		flashApp.selectDataGridRow("dataGrid","2");

		//flashApp.getFlexDataGridCellElement("dataGrid","3","2","1","1");

		flashApp.FlexType("TextInput97","10/03/2017");



		flashApp.getFlexDataGridCell("dataGrid", "1", "1");


		flashApp.FlexSelectComboByLabel("combo","grape");

		flashApp.getSelectionIndex("combo");

		System.out.println(flashApp.getGridValue("dataGrid", "1","1"));

		//flashApp.ClickDataGridCell("dataGrid", "1","yellow");


		flashApp.click("Tab129");



		Thread.sleep(5000);

		flashApp.FlexType("num1","40");

		flashApp.FlexType("factorVal","40");




		flashApp.ClickAccordionControl("acco","Pane 2");



		Thread.sleep(2000);

		flashApp.click("Pink");


		flashApp.alertResponse("CANCEL");

		Thread.sleep(2000);

		//select a particular tab
		flashApp.FlexSelectIndex("tabs", "1");


		Thread.sleep(2000);

		flashApp.click("Cheddar");

		Thread.sleep(2000);

		flashApp.ClickAccordionControl("acco","Pane 1");

		flashApp.click("Tab133");



		Thread.sleep(2000);


		String Texboxname= flashApp.getFlexDataGridCellElement("personDataGrid","5","5","1","3");

		flashApp.FlexType(Texboxname,"40");

		Texboxname= flashApp.getFlexDataGridCellElement("personDataGrid","5","5","2","3");

		flashApp.FlexType(Texboxname,"100");


		Texboxname= flashApp.getFlexDataGridCellElement("personDataGrid","5","5","4","4");

		flashApp.click(Texboxname);

		flashApp.selectDataGridRow("personDataGrid","2");

		//flashApp.click("DataGridItemRenderer391");
*/
		flashApp.click("Tab131");

		flashApp.getObjectType("myTree");

		Thread.sleep(2000);

		flashApp.selectTreeItem("myTree","Kushal","2");

		//flashApp.FlexSelectIndex("myTree","2");


		

	}
}