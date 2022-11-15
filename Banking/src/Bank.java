import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int uniqueIDAccounts = 0;

    private int uniqueIDClient = 0;
    private List<Client> clients;
    private Client currentClient = null;

    public Bank() {
	/***
	Constructor
	***/
    	clients = new ArrayList<>();
    }

    public void addNewClient(Client client, int pin) {
	/***
	Add clients to the bank. What do you do when a client has already been added to the bank?
	***/
    	if(!clients.contains(client)) {
    		client.setPin(pin);
    		client.addBankID(uniqueIDClient++);
    		clients.add(client);
    	}
    		
    }

    public void logOut() {
    	/***
    	Log the current user out of the bank
    	***/
    	currentClient = null;
    }

    public void logIn(int id, int pin) {
        /***
    	Log the current user in to the bank. What happens is someone is already logged in?
    	How do you validate if the user is indeed who they claim to be?
    	If the user is unable to provide the correct information, the following sentence should be displayed: 
    	"This user is not know to the bank, please check if you gave the correct ID and PIN!"
    	***/
    	for (int i = 0; i < clients.size(); i++) {
    		if (clients.get(i).getBankID() == id && clients.get(i).getPin() == pin) {
    			if (this.currentClient != null) {
    	    		this.logOut();
    	    	}
    			currentClient = clients.get(i);
    			break;
    		}
    	}
    	if (this.currentClient != null) {
    		this.logOut();
    	}
    }

    public void addAccount(Client client, double amount) {
        /***
    	Add an account, if all input valid in this method?
    	***/
    	if (amount > 0 && client == currentClient) {
    		BankAccount tmp = new BankAccount(uniqueIDAccounts++, amount);
    		client.addAccount(tmp);
    	}
    }

    public void removeAccount(BankAccount toRemove, BankAccount transferAccount) {
        /***
    	Remove an account, the user can transfer the money in the 'toRemove' account to the 'transferAccount'.
    	***/
		if (currentClient.getAccounts().contains(toRemove)) {
			transferAccount.addToBalance(toRemove.getBalance());
		}
    	
    }


    public void transfer(BankAccount transferFrom, BankAccount transferTo, double amount) {
        /***
    	Transfer from 'transferFrom' to 'TransferTo' with a given ammount?
    	Can anyone transfer, what with people that are not part of the bank?
    	***/
    	if (currentClient.getAccounts().contains(transferFrom) && transferFrom.canBeRemovedFromBalance(amount)) {
    		transferFrom.removeFromBalance(amount);
    		transferTo.addToBalance(amount);
    		
    	}
    }

    public void displayAccounts() {
        /***
    	Give a display to the user what accounts are associated with them.
    	Give info abouth the index (for easy access), the ID and the amount.
    	***/
    	System.out.println("Your accounts are:");
    	List<BankAccount> tmp = currentClient.getAccounts();
    	for (int i = 0; i < tmp.size(); i++) {
    		System.out.printf("Account %d: \n", i);
    		System.out.printf("  Account id: %d \n", tmp.get(i).getID());
    		System.out.printf("  Balance: %f \n", tmp.get(i).getBalance());
    	}
    	
    }

    public int maxIDClient(){
        /***
    	Getter
    	***/
    	
    }

    public Client getCurrentClient(){
        /***
    	Getter
    	***/
    	return currentClient;
    }

    public List<Client> getClients() {
        /***
	Getter    	
    	***/
    	return clients;
    }

}
