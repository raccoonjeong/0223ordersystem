package org.zerock;

        import java.io.*;
        import java.util.ArrayList;
        import java.util.Arrays;

public class FileRead{

    ArrayList<Menu> menus;

    public FileRead() {
        this.menus = new ArrayList<>();
    }

    public ArrayList<Menu> menuList(){
        ArrayList<Menu> menus = new ArrayList<>();
        try{
            File file = new File("C:\\zzz\\CK1.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line = "";
            while((line=bufReader.readLine())!=null){
                String[] str = line.split(",");
                menus.add(new Menu(Integer.valueOf(str[0]),str[1],Integer.valueOf(str[2])));
            }
            bufReader.close();
            

        }catch (FileNotFoundException e){

        }catch (IOException io){

        }

        return menus;
    }

    public void showMenu() {
    	System.out.println(menuList());
    }
    
  
   
}
