//package H_W_2;
//////1. Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
//////        1 Расширение файла: txt
//////        2 Расширение файла: pdf
//////        3 Расширение файла:
//////        4 Расширение файла: jpg
////
////
////
//import javax.annotation.processing.FilerException;
//import java.io.*;
//import java.io.IOException;
//
//public class Java_H_W_2_1 {
//_____________________________________________________________________________________________________________________
//    public static void main(String[] args) {
//        File folder1 = new File("AAA");         // Создание папки
//        folder1.mkdirs();
//    }
//_____________________________________________________________________________________________________________________
//    public static void main(String[] args) {                  // Создание файлов в папке
//        File folder1 = new File("AAA");
//
////        File file1 = new File(folder1, "a.doc");            // Создание файла внутри папки ААА (folder1)
////        File file2 = new File(folder1, "a.txt");            // Создание адреса для файла.
////        File file3 = new File(folder1, "c.pdf");            // Создание адреса для файла.
//        File file4 = new File(folder1, "d.jpg");            // Создание адреса для файла.
//
//        try {
//            file1.createNewFile();                      // Заисывая файл меняю file1/file2/file3/file4
//            file2.createNewFile();
//            file3.createNewFile();
//            file4.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();                        // Вывод на экран сообщения об ошибке.
//        }
//    }
//_____________________________________________________________________________________________________________________
//    public static String FileExtension(String str) {
//        int index = str.lastIndexOf(".");
//        return str.substring(index);
//    }

////_____________________________________________________________________________________________________________________
//    public static void main(String[] args) {        // Метод просмотра содержимого в папке.
////
//        File workFolder = new File("AAA");
//        File [] files = workFolder.listFiles();     //  Возвращает массив файлов и подкаталогов, которые находятся в
//                                                    //  определённом каталоге(папке).
//        for (int i = 0; i < files.length; i++) {    // Цикл для вывода всех элементов массива.
//            System.out.println("Файл: "+ files[i]);           // Вывод массива
//
//        }
//        System.out.println();
//        System.out.print("Количество файлов: "+ files.length);
//        System.out.println();
//
//        int count = 0;
//        for(File f: files) {
//            String substr = FileExtension(f.toString());
//            count++;
//            System.out.printf("%d расширение файла: %s %n", count, substr);
//        }
//
//
//    }
////_____________________________________________________________________________________________________________________
//
//}
