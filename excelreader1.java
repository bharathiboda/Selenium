public class readerExcel{
WebDriver driver;
File file;
  @DataProvider(name = 'testData')
public Object[][] excelReader(){
/*FileInputStream fis = new FileInputStream(file);
XSSFWorkbook wb = XSSFWorkbook(file);
XSSFSheet sheet1 = wb.getSheetAt(0);*/

  //do it again 
  FileInputStream fis = new FileInputStream(file);
  XSSFWorkbook wb = new XSSFWorkbook(file);
  XSSFSheet sheet1 = wb.getSheetAt(0);
  //int rowCount = sheet1.getLastRowNum();
  //int colCount =sheet1.getRow(0).getLastellNum();
  int rowCount =sheet1.getLastrowNum();
  int cellCount = sheet1.getRow(0).getLastcellNum();
  Object[][] data = new Object[rowCount][cellCount];
  for (int i = 0; i<rowCount;i++)
  {
    for (int j=0;j<cellCount;j++)
    {
      data[i][j]=sheet1.getRow(i+1).getCell(j).toString();
    }
    return data;
    wb.close();
  }
  @Test(Dataprovider= "testData")
  public void getData(String uName, String password){
    driver = new ChromeDriver();
    System.SetProperty("webdriver.chome.driver","path of the driver exe file");
    driver.get("url of the website");
    driver.findElement(By.id("get id from the website by inspecting")).click();
    driver.findElement(By.className
                       By.name(
                         By.xpath("//tagname[@attribute='attribute value']")
                         By.xpath("//tagname[@attribute='attribute value']")
                         By.CSSSelctor("tagname[attribute='value'])  
                         By.CSSSelector("tagname[attribute='value']")
                                       By.linkedText
                                       By.partialLinkedText 
                                       By.tagName
                                       
  
 
                                   
 
