package Mediator1;
import java.util.ArrayList;
import java.util.List;

class AuctionMediatorImpl implements AuctionMediator {
    private List<Bidder> bidders;
    private double currentBid;

    public AuctionMediatorImpl() {
        this.bidders = new ArrayList<>();
        this.currentBid = 0.0;
    }

    @Override
    public void addBidder(Bidder bidder) {
        this.bidders.add(bidder);
    }

    @Override
    public void placeBid(double bid, Bidder bidder) {
        if (bid > currentBid) {
            System.out.println(bidder.getName() + " placed a bid of " + bid);
            currentBid = bid;
            for (Bidder b : bidders) {
                if (b != bidder) {
                    b.notifyBid(currentBid);
                }
            }
        } else {
            System.out.println("Bid of " + bid + " was too low.");
        }
    }
}
