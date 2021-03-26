package day21;

import javax.swing.text.Document;
import java.util.Arrays;
import java.util.List;

public class Java8MethodReference3 {

    private List<Page> pages;
    //Non Static Method
    public String getPageContent(int pageNumber){
        pages = Arrays.asList(new Page("content1"), new Page("content2"), new Page("content3"));
        return this.pages.get(pageNumber).getContent();
    }

    //stasic class
    public static void printPages(Java8MethodReference3 doc, int [] pageNumbers){
        Arrays.stream(pageNumbers)
                .mapToObj(doc::getPageContent)
                .forEach(Java8MethodReference2::print);
    }

    public static void main(String[] args) {
        Java8MethodReference3 doc = new Java8MethodReference3();
        int [] pageNumbers = {0,1,2};
        printPages(doc, pageNumbers);
    }
}
