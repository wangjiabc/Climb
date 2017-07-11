import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	static String getHost(String url){
		  if(url==null||url.trim().equals("")){
		   return "";
		  }
		  String host = "";
		  Pattern p =  Pattern.compile("(?<=//|)((\\w)+\\.)+\\w+/[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]/");
		  Matcher matcher = p.matcher(url);  
		  if(matcher.find()){
		   host = matcher.group();  
		  }
		  return host;
		 }
	public static void main(String[] args) {
	String aString=getHost("http://luzhou.58.com/tech/27625915178957x.shtml?psid=158649807196566960462158103&entinfo=27625915178957_j&ytdzwdetaildj=0");
	   System.out.println(aString);
	}
}
