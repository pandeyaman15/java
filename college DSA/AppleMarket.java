public class AppleMarket {

    public static int minExpenditure(int N, int lotSizeA, int priceA, int lotSizeB, int priceB) {
        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i * lotSizeA <= N; i++) {
            int remainingApples = N - (i * lotSizeA);

            if (remainingApples % lotSizeB == 0) {
                int lotsFromB = remainingApples / lotSizeB;
                int totalCost = (i * priceA) + (lotsFromB * priceB);

                if (totalCost < minCost) {
                    minCost = totalCost;
                }
            }
        }

        return minCost == Integer.MAX_VALUE ? -1 : minCost;
    }

    public static void main(String[] args) {
        int N = 19;
        int lotSizeA = 3;
        int priceA = 10;
        int lotSizeB = 4;
        int priceB = 15;

        int result = minExpenditure(N, lotSizeA, priceA, lotSizeB, priceB);
        if (result == -1) {
            System.out.println("It is not possible to buy exactly " + N + " apples.");
        } else {
            System.out.println("The minimum expenditure is: " + result);
        }
    }
}
