import java.util.ArrayList;
import java.util.List;

public class sortThePeople {

    public class People
    {
        int height;
        String name;

        People(int height, String name)
        {
            this.height = height;
            this.name = name;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        List<People> personList = new ArrayList<>();
        String[] result = new String[names.length];
        List<String> res = new ArrayList<>();

        for(int i = 0; i < names.length; i++)
        {
            personList.add(new People(heights[i], names[i]));
        }
        personList.sort((a,b) -> b.height - a.height);


        for(int i =0; i < names.length; i++)
        {
            result[i] = personList.get(i).name;
        }

        return result;
    }

}
