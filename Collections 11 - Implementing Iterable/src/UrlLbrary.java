
import java.util.*;
import java.io.*;
import java.net.*;

public class UrlLbrary implements Iterable<String>{
	private LinkedList<String> urls = new LinkedList<String>(); 
	
private class UrlIterator implements Iterator<String> {
        
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {
            
            StringBuilder sb = new StringBuilder();
            
            try {
                URL url = new URL(urls.get(index));
                
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                
                String line = null;
                
                while( (line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("n");
                }
                
                br.close();
                
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            index++;
            
            return sb.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);
        }
        
    }
 
	
	public UrlLbrary() {
		urls.add("http://www.ru");
		urls.add("http://vk.ru");
		urls.add("http://ya.ru");
	}
	
	@Override
	public Iterator<String> iterator() {
		return null;
	}
	
/*	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}*/
}
