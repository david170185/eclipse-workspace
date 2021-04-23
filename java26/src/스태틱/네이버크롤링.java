package 스태틱;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

   public static void main(String[] args) throws Exception  {
      Connection con = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn");//변경
      //System.out.println(con);
      
      //2. 연결한 사이트에 html문서를 받아오세요.
      Document doc = con.get();
      //System.out.println(doc);
      Elements anav = doc.select("dt.tit  a");//변경
      //System.out.println(anav.size());
      for (int i = 0; i < anav.size(); i++) {
         System.out.println(anav.get(i).text());
      }
      
      Elements imgs = doc.getElementsByTag("img");
      if (imgs.size() > 0) {
		String src = imgs.get(0).attr("src");
		System.out.println(src);
	}
      
      
      
      
      
      
      
   }

}
