

public class ExcelReader{
File file =new File("path of the file");
FileInputReader fis=new FileInputReader(file);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet1=wb.getSheetAt(0);
  WebDriver driver; 
  
//second attempt 
  @DataProvider(name="testData")
  public object[][] readExcel(){
  File file = new File("path");
  FileInputStream fis = new FileInputStream(file);
  XSSFWorkbook wb = new XSSFWorkbook(fis);
  XSSFSheet sheet1 = wb.getSheetAt(0);
  int rowCount = sheet1.getLastRowNum();
  int colCount = sheet1.getRow(0).getLastCellNum();
  Object[][] data = new Object[rowCount][colCount];
  for (int i=0;i<rowCount;i++)
  {
    for (int j=0;j<colCount;j++)
    {
      data[i][j]=sheet1.getRow(i+1).getColNum(j).toString();
    }
  }
    wb.close();
  }
  
  @Test(dataProvider="testData")
  public void readData(String userName, String passWord){
   driver = new ChromeDriver();
  System.SetProperty("webdriver.chrome.driver","path of webdriver exe file");
  driver.get("url of website");
    driver.findElement.(By.id("get id by inspecting")).sendkeys(userName);
    driver.findElement.(By.className("get classname by inspecting")).sendKeys(passWord));
    driver.findElement>(By.Xpath("//tagname[@attribute='attribute value']")).click();
  }
}
    
    
                                   
