public class readFromTextFile{
  File file = new File("path of the file");
  file.CreateNewFile();
  FileWriter fw = new FileWriter(file);
  BufferedWriter bw = new BufferedWriter(fw);
  //this is to write content to the file
  bw.write("this is my first line");
  bw.newLine();
  bw.write("this is my second line");
  bw.close();
  // this is to read from the file 
  FileReader fr = new FileReader(file);
  BufferedReader br = new BufferedReader(fr);
  String content = " ";
  while ((content = br.readLine())!=null){
    system.out.println(content);
  }
  br.close();
}

//do it again 
public class readFromTxt{
  File file  = new File("path of it");
  file.CreateNewFile();
  FileWriter fw = new FileWriter(file);
  BufferedWriter bw = new BufferedWriter (fw);
  bw.write("this is my second attemt");
  bw.newLine();
  bw.write("this is my second attempt second line");
  bw.close();
  FileReader fr = new FileReader(file);
  BufferedReader br = new BufferedReader(fr);
  String content = " ";
  while((content = br.readLine())!=null){
    system.out.println(content);
  }
  br.close();
 
}


    
  
