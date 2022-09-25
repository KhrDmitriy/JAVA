package H_W_2;
//
////2. Дана строка sql-запроса "select * from students where ".
////        Сформируйте часть WHERE этого запроса, используя StringBuilder.
////        Данные для фильтрации приведены ниже в виде json строки.
////        Если значение null, то параметр не должен попадать в запрос.
////        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
////        Ответ: "select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'" для приведенного примера
//


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//
public class Java_H_W_2_2 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Projects\\JavaIdeaProjects\\FilesForTest\\hw2database.json.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();

        while (br.ready()) {
            sb.append(br.readLine()).append("\n");
        }

        System.out.println(sb);

        br.close();




    }
}