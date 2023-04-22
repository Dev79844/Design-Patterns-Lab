package Mediator1;

public interface AuctionMediator {
    void addBidder(Bidder bidder);
    void placeBid(double bid, Bidder bidder);
}
