package Mediator1;

class AuctionBidder implements Bidder {
    private String name;
    private AuctionMediator mediator;

    public AuctionBidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void bid(double bid) {
        mediator.placeBid(bid, this);
    }

    @Override
    public void notifyBid(double bid) {
        System.out.println(name + ": Current bid is " + bid);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
