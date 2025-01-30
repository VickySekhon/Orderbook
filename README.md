# Order Book

Order Book implementation in Java.

## About

Application program to manage an Order Book with price/time priority. Orders can be submitted via a csv file.

Order storing data structure is **TreeMap<BigDecimal, Queue<Order>>** type. Here the 'key' is 'Price' and the Orders are stored in a queue which are of the same price. Queue is ordered according to the order processed time.

SELL Orders are stored in natural price order and BUY Orders are stored in reverse price order.

## How to Run

1. Change your directory to '**src/main/**'.
2. Create a new folder named '**classes**'
3. Compile using:
   - **javac -sourcepath java -d classes java/com/orderbook/app/Main.java**
4. Execute using:
   - **java -cp classes/ com.orderbook.app.Main resources/data/MarketDataFile-XYZ.csv**
