package Assignment30;

public class Ascending {
	 public static void main(String[] args) {    
	        System.out.println(sort("hello"));
	    }

	    static String temp="";
	    static String answer ="";
	    public static String sort(String s)
	    {
	        temp = s.substring(0, 1);
	        if(s.length()<=1||s==null)
	        {
	            return s;
	        }           
	        else 
	        {
	            if(temp.compareTo(s.substring(1, 2))>1)
	            {
	                answer+=s.substring(0, 1);              
	            }

	            else 
	            {
	                answer += temp;
	                temp = s.substring(1, 2);               
	            }           

	            sort(s.substring(0, s.length()-1));           
	            return answer;
	        }
	    }
}
