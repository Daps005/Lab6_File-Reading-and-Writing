import java.io.*;


public class Main {
    public static void main(String[] args) {
        // Path: directory of the file location
        // 2 types Path: relative path, absolute path

        // Absolute path:C:\Users\herit\Documents\FileIO\src\input.txt

        // Practical Scenario
        // Verify if a file exists in a directory? If not create the file.
        // Open a file if exists and write contents
        // Open a file if exists and read line by line
        String file_name = "C:\\Users\\herit\\Documents\\FileIO\\src\\input.txt";
        File f = new File(file_name);



        try {
//            if (f.createNewFile()) {
//                System.out.println("File is successfully created");
//
//            } else {
//                System.out.println("File already exists");
//            }
            // Write to input.txt
//            FileWriter fw = new FileWriter(f);
//            FileWriter fw = new FileWriter(f, true);
//            FileWriter fw = new FileWriter(file_name, true);
//            fw.write("\nThis is second appended content\n");
//            fw.write("We are on 11th week \n");
//            fw.write("This is COSC 113");
//            fw.close();
            FileReader fr = new FileReader(f);
//            int val;
//            while((val = fr.read()) != -1){
//                System.out.print((char) val);


//            val = fr.read();
//            System.out.println((char)val);
//
//            val = fr.read();
//            System.out.println((char)val);
            BufferedReader br = new BufferedReader(fr);
            String str;

            double cgp;
            double maxCGPA = Double.NEGATIVE_INFINITY;
            String topStudent = "";

            while ((str = br.readLine()) != null) {
                System.out.println(str);

                String[] info = str.trim().split("\\s+");

                System.out.println(info[0]);
                System.out.println(info[1]);

                cgp = Double.parseDouble(info[1]);

                if (cgp > maxCGPA) {
                    maxCGPA = cgp;
                    topStudent = info[0];
                }

            }
            System.out.println("Maximum CGPA: " + maxCGPA);
            System.out.println("Student: " + topStudent);
            // Java converts string to double


            fr.close();
            br.close();
        }

        catch(IOException e){
                System.out.println("IO Exception happened");


            }


//        try {
//            // Attempt to execute the code
//        } catch (){
//            // Catch the issue: What went wrong in trying to execute the code
//        }




    }
}