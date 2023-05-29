import java.io.*;

public class TestIOTest {
     static File file = new File("list_song.txt");

    public static void main(String[] args) {
            String[] arraySong={"Hello","we dont talk animal","nắng ấm sa giần","em của ngày hôm qua","bảy tình"};
        writeDataToFileWithFileWriter (arraySong);
        readDataToFileWithFileReader();
        }

    public static void writeDataToFileWithFileWriter (String[] arraySong){
        try {
            FileWriter writer = new FileWriter(file);

            for (String song : arraySong) {
                writer.write(song + "\n");
            }
            writer.close();

            System.out.println(" thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi ");
        }
    }
    public static void readDataToFileWithFileReader(){
        try{
            FileReader reader=new FileReader(file);
            int c=reader.read();
            while(c!=-1){
                System.out.println((char)c);
                c=reader.read();
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("lỗi chết mày");
        }
    }
    private static void writeDataToFileWithBufferedWriter(String[] arraySong){
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);
            for (String song : arraySong) {
            bufferedWriter.write(song);
            bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException e){
            System.out.println("hehehe");
        }
    }
    private static void readDataToFileWithBufferedReader(){
        try{FileReader reader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(reader);}
        catch (IOException e){
            

        }
    }

}
