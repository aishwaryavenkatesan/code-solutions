import java.util.ArrayList;
import java.util.List;

public class robotCollisions {


    public class Robot {
        int position;
        int robotHealth;
        char side;
        int index;


        Robot(int position, int robotHealth, char side, int index)
        {
            this.position = position;
            this.robotHealth = robotHealth;
            this.side = side;
            this.index = index;
        }

    }
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {

        List<Integer> res = new ArrayList<>();
        int n = positions.length;
        List<Robot> vals = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            vals.add(new Robot(positions[i], healths[i], directions.charAt(i), i+1));
        }
        vals.sort((a,b) -> a.position - b.position);
        List<Robot> stack = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            if(stack.size() == 0)
            {
                stack.add(vals.get(i));
            }

            else
            {
                if((stack.get(stack.size() - 1).side == 'R'  && vals.get(i).side == 'L'))
                {
                    boolean robotOut = false;

                    while(!stack.isEmpty() && (stack.get(stack.size() - 1).side == 'R'  && vals.get(i).side == 'L' && robotOut == false))
                    { 
                      if(stack.get(stack.size() - 1).robotHealth == vals.get(i).robotHealth)
                      {
                        stack.remove(stack.size() - 1);
                        robotOut = true;
                        continue;
                      }

                       else if(stack.get(stack.size() - 1).robotHealth > vals.get(i).robotHealth)
                     {
                        Robot r2 = stack.get(stack.size() - 1);
                        r2.robotHealth--;
                        stack.set(stack.size() - 1, r2);
                        robotOut = true;
                        continue;
                     }

                       else
                      {
                        stack.remove(stack.size() - 1);
                        vals.get(i).robotHealth--;
                        //stack.add(vals.get(i));
                       }

                    }

                   if(robotOut == false)
                  {
                    stack.add(vals.get(i));
                  }

                
                    
                }

                else
                {
                    stack.add(vals.get(i));
                }

            
            }
        }

        stack.sort((a,b) -> a.index - b.index);

        for(Robot r : stack)
        {
            res.add(r.robotHealth);

        }

        return res;
        
    }

}
