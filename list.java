public class listExcercise{
  public static void main(String[] args){
    WebDriver driver = new geckoDriver();
    WebDriver driver1 = new ieDriver();
    WebDriver driver2 = new ChromeDriver();
    System.SetProperty("webdriver.chrome.driver","path of the exe file of chrome driver");
    System.SetProperty("webdriver.gecko.driver","path of the exe file of gecko driver");
    System.SetProperty("webdriver.ie.driver","path of the exe file of ie driver");
    driver.get("the website url");
    WebElement ele = driver.findElements(By.id("path"));
    Select sel = new Select(ele)
      sel.selectByValue("value");
      sel.SelectByVisibleText("visibletext");
      sel.SelectByIndex(i);
    String data="";
    for (int i=0;i<=ele.size();i++){
      data = ele.get(i).getText();
    }
  }

     
