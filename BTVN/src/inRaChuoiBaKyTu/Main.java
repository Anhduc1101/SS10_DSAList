package inRaChuoiBaKyTu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        B1: tạo 1 String có giá trị là: “Rekkei Academy để nông dân biết code”
        String str="Rikkei Academy để nông dân biết code";

//        B2: tạo List có kdl là String.
//        List<String> string=new ArrayList<>();
//        String[] strArr=str.split("\\s+");
//        hoặc
        List<String> string=new ArrayList<>(Arrays.asList(str.split("\\s+")));

//        B3: convert string ở bước 1 thành List string rồi gán vào Lits đc tạo ở b2.
//        for (String word:strArr) {
//        string.add(word);
//        }
//        hoặc
        Collections.addAll(string,str);

//        B4: duyệt list trên và in ra các phần tử có nhiều hơn 3 ký tự
        for (String item:string) {
            if(item.length()>3){
            System.out.println(item);
            }
        }
    }
}
