package genericity.charstream;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharBufferedStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\PMD\\Test\\Dome\\files\\hello.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\PMD\\Test\\Dome\\files\\hello1.txt"));

        String s = br.readLine();
        String[] strs=s.split(" ");

        Stream<String> stream=Stream.of(strs);
        List<Integer> list = stream.map(str -> Integer.parseInt(str))
                .sorted()
                .collect(Collectors.toList());

        String s1 = list.toString();
        s1=s1.substring(1,s1.length()-1);
        s1=s1.replace(","," ");
        bw.write(s1);
        System.out.println(s1);
        bw.close();
    }
}
