public class BetterProgrammerTask {
    private static int[] moneyVal    = {1, 5, 10, 25, 50};
    public static int countWaysToProduceGivenAmountOfMoney(int cents) {
        /*
          Please implement this method to
          return the number of different combinations of US coins
          (penny: 1c, nickel: 5c, dime: 10c, quarter: 25c, half-dollar: 50c)
          which may be used to produce a given amount of money.

          For example, 11 cents can be produced with
          one 10-cent coin and one 1-cent coin,
          two 5-cent coins and one 1-cent coin,
          one 5-cent coin and six 1-cent coins,
          or eleven 1-cent coins.
          So there are four unique ways to produce 11 cents.
          Assume that the cents parameter is always positive.
         */

        return getCountOfWays(cents, 4);
    }

    private static int getCountOfWays(int cents, int indexOfCoin) {
        if (cents < 0 || indexOfCoin < 0) return 0;
        if (cents == 0 || indexOfCoin == 0) return 1;
        return getCountOfWays(cents, indexOfCoin - 1) + getCountOfWays(cents - moneyVal[indexOfCoin], indexOfCoin);
    }

}
