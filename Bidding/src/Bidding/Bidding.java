package Bidding;

import java.util.List;

public class Bidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static boolean ListForAuction(int token, int user_id, int starting_price, 
			int buy_now_price, int start_time, int expire_time) {
		return true;
	}
	
	public static boolean PlaceBid(int token, int user_id, int auction_id, int bid_price, int buynow) {
		return true;
	}
	
	public static List<Auction> GetAuction(String category, String keyword, String sort_key, int order){
		return null;
	}
	
	public static boolean UpdateAuction(String data) {
		return true;
	}
	
	public class Auction{
		int auction_id;
		public Auction(int auction_id) {
			this.auction_id = auction_id;
		}
	}
}

