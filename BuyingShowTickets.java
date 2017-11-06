
public class BuyingShowTickets {

	static long waitingTime(vector<int> tickets, int p) {

		  // bool flag indicates whether it's Jesse or not

		  queue<pair<int, bool>> aQueue;

		  for(int i = 0; i < tickets.size(); i++) {

		    aQueue.push(make_pair(tickets[i], i == p));

		  }

		  long nTime = 1;
		  while(!aQueue.empty()) {
		    pair<int, bool> aItem = aQueue.front();
		    aQueue.pop();
		    nTime++;
		    if(aItem.first == 1 && aItem.second == true)
		      break;
		    else if(aItem.first > 1) {
		      aQueue.push(make_pair(aItem.first-1, aItem.second));
		    }
		  }
		  return nTime-1;
		}

	public static void main(String[] args) {
       
	}

}
