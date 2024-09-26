import java.util.Map;
import java.util.TreeMap;


    class MyCalendar {

    public Map<Integer, Integer> tm;
    public MyCalendar() {
        tm = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {

        for(Map.Entry<Integer, Integer> entry : tm.entrySet())
        {
            if((Math.max(entry.getKey(), start)) < (Math.min(entry.getValue(), end)))
            {
                return false;
            }
    
        }
        tm.put(start, end);
        return true;

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */

