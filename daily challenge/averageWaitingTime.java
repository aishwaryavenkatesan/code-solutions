public class averageWaitingTime {
    public double averageWaitingTimeFunc(int[][] customers) {

        double sum = 0;
        int currentTime = 0;

        for(int i = 0; i < customers.length; i++)
        {
            int arrival = customers[i][0];
            int serviceTime = customers[i][1];

            if(currentTime < arrival)
            {
                currentTime = arrival;
            }

            int waitingTime = currentTime + serviceTime - arrival;
            sum+= waitingTime;
            currentTime+= serviceTime;
        }

        return sum / customers.length;


    }
}
