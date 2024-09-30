public class customStack {

        public int[] arr;
        public int maxSize;
        public int count = 0;
    
        public customStack(int maxSize) {
            this.maxSize = maxSize;
            arr = new int[maxSize];
        }
        
        public void push(int x) {
    
            if(count < maxSize)
            {
                arr[count] = x;
                count++;
            }
    
        }
        
        public int pop() {
            if(count == 0)
            return -1;
    
            else
            {
              count-=1;
              return arr[count];
            }
        }
        
        public void increment(int k, int val) {
    
            if(count <= k)
            {
                for(int i =0; i < count; i++)
                {
                    arr[i] = arr[i] + val;
                }
    
            }
    
            else
            {
                for(int i = 0; i < k; i++)
                {
                    arr[i] = arr[i] + val;
                }
            }
        }
    
}
