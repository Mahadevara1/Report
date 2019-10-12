package com.resources;




import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Base {
	public static WebDriver driver;

	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\EcomDomain\\src\\lib\\chromedriver.exe");
		//ChromeOptions ap = new ChromeOptions();
		//ChromeOptions ad=ap.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(9000, TimeUnit.MILLISECONDS);

		

		return driver;

	}

	public static void loadUrl(String url) {

		driver.get(url);
	}

	
	
	
	
	
	
	
	
	public static void fill(WebElement e, String s) {
		
		e.sendKeys(s);

	}

	

	public static void btnClick(WebElement w) {
		w.click();
	}

	public static void quitBrowser() {
		driver.quit();
	}
	
	
	public static void mouseHover(WebElement e) {
		Actions acc=new Actions(driver);
		acc.moveToElement(e).perform();
	}
	public static void scrollUp(WebElement e) {
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(false)",e);
		
		
	}

	public static void scrollDown(WebElement e) {
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true)",e);
		}
	public static void jsClick(WebElement e) {
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].click()",e);
	}
	
	public static List<HashMap<String, String>>  valuefromExcelSheet()
	{
		List<HashMap<String, String>> mapDatasList=new ArrayList<HashMap<String,String>>();
		try {
			File excelLocation=new File("C:\\Users\\HP\\eclipse-workspace\\EcomDomain\\testdata\\Ecommdata.xlsx");
			
			FileInputStream f=new FileInputStream(excelLocation);
			Workbook w=new XSSFWorkbook(f);
			Sheet sheet=w.getSheet("Sheet1");
			Row headerRow=sheet.getRow(0);
			for (int i =0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row currentRow=sheet.getRow(i);
				HashMap<String, String> mapDatas=new HashMap<String, String>();
				for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
					Cell currentCell=currentRow.getCell(j);
					
						switch(currentCell.getCellType()) {
						
							case Cell.CELL_TYPE_STRING:
							mapDatas.put(headerRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
							break;
							
							case Cell.CELL_TYPE_NUMERIC:
							mapDatas.put(headerRow.getCell(j).getStringCellValue(), String.valueOf(currentCell.getNumericCellValue()));
							break;
					}
					
				}
				mapDatasList.add(mapDatas);
			}
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		
		return mapDatasList;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
