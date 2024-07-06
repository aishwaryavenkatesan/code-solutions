public class passThePillow {

        public int passThePillowFunc(int n, int time) {
            
            int cycles = time/ (n -1);
            int remaining = time % (n -1);
    
             return (cycles % 2 == 0) ? remaining + 1 : n - remaining;
        }

}
