public class minJumps {
    static int minJumps(int[] arr) {

        int jump = 1;

        int maxRange = arr[0];
        if (arr[0] == 0)
            return -1;
        if (arr.length <= 1)
            return 0;

        // int maxRange=0;
        // while(pos<arr.length && pos>=0)
        // {
        // int steps = arr[pos];

        // if (steps == 0) //retract
        // {
        // pos -= 1;
        // }

        // // pos += arr[pos];
        // maxRange = max(maxRange,i+arr[i]);
        // no_of_steps += 1;
        // }

        int steps = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1)
                return jump;
            maxRange = Math.max(maxRange, i + arr[i]);
            // no_of_steps -= 1;

            steps--;

            // If no further steps left
            if (steps == 0) {
                // we must have used a jump
                jump++;

                // Check if the current
                // / / index/position or lesser index
                // is the maximum reach point
                // from the previous indexes
                if (i >= maxRange)
                    return -1;

                // re-initialize the steps to the amount
                // of steps to reach maxReach from position i.
                steps = maxRange - i;
            }
        }

        return -1;
    }

}
