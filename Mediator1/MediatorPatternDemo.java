package Mediator1;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        AuctionMediator mediator = new AuctionMediatorImpl();
        Bidder bidder1 = new AuctionBidder("Alice", mediator);
        Bidder bidder2 = new AuctionBidder("Bob", mediator);
        Bidder bidder3 = new AuctionBidder("Charlie", mediator);

        mediator.addBidder(bidder1);
        mediator.addBidder(bidder2);
        mediator.addBidder(bidder3);

        bidder1.bid(100.0);
        bidder2.bid(150.0);
        bidder3.bid(75.0);
        bidder1.bid(200.0);
    }
}
