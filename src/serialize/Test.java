package serialize;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student("1","2",true,4);
        Student student2 = new Student("2","2",false,5);



        try {
            FileOutputStream fileOut = new FileOutputStream("Student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student1);
            out.writeObject(student2);
            fileOut.close();
            out.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Student studentOne;
        Student studentTwo;

        try{
            FileInputStream fileIn = new FileInputStream("Student.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            studentOne = (Student) in.readObject();
            studentTwo = (Student) in.readObject();

            fileIn.close();
            in.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(studentOne);
        System.out.println(studentTwo);


    }
}
