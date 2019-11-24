public class ExcelReader{
File file =new File("path of the file");
FileInputReader fis=new FileInputReader(file);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet1=wb.getSheetAt(0);
