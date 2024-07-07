public class waterBottles {

        public int numWaterBottles(int numBottles, int numExchange) {
            
            int sum = numBottles;
            int drink = 0;
            int remaining = 0;
    
            while(!(numBottles < numExchange))
            {
                drink = numBottles/numExchange;
                sum+=drink;
                remaining = drink + numBottles % numExchange;
                numBottles = remaining;
                
            }
            return sum;
        }
    
}
