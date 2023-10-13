package timCHuoiNganNhatTrongDoanVan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        B1: tạo sẵn 1 string = 1 câu hoặc một đoạn văn
        String str = "Rikkei Academy để nông dân biết code";
//        B2: convert string đó thành list các string
        List<String> listString = new ArrayList<>(Arrays.asList(str.trim().split("\\s+")));
//        B3: tạo thêm một List có kdl là String để lưu trữ những phần tử đc tìm thấy
        Collections.addAll(listString,str);
//        B4: duyệt list trên bằng vòng lặp để tìm ra các phần tử có length nhỏ nhất.
        String shortestWord=listString.get(0);
        for (String item : listString) {
                if(item.length()<shortestWord.length()){
                shortestWord=item;
            }
        }
//        B:5 in ra kết quả.
        System.out.println("Chữ ngắn nhất là: "+shortestWord);
    }
}
