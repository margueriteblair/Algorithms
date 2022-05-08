package OODesign;

import java.util.*;

public class ATM {
    private int availableCash;
    private User currentUser;
    private State currentState;
    private Map<Integer, Integer> denominations; //will count the 1's, 5's, 10's 20's, 50's, 100's


}

class User {
   private Account account;
   private Card card;

   public User(Account account, Card card) {
       this.account = account;
       this.card = card;
   }
}

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void updateBalance(double amount) {
        balance += amount;
    }
}

class Card {
    private int PIN;

    public boolean authenticatePin(int userInputPIN) {
        return this.PIN == userInputPIN;
    } 
}

enum State {
    READY,
    ENTER_PIN,
    SELECT_TX,
    DEPOSIT,
    WITHDRAW,
    DISPLAY_BALANCE,
    CASH_DISPENSED,
    ERROR
}

