package model;

import java.sql.Timestamp;

public class Transaction {
    private int transactionId;
    private int itemId;
    private String type; // "IN" or "OUT"
    private int quantity;
    private Timestamp date;
    
    // Additional fields for reporting/display
    private String itemName;
    
    // Constructors
    public Transaction() {
    }
    
    public Transaction(int transactionId, int itemId, String type, int quantity, Timestamp date) {
        this.transactionId = transactionId;
        this.itemId = itemId;
        this.type = type;
        this.quantity = quantity;
        this.date = date;
    }
    
    // For creating new transactions (ID will be auto-generated by the database)
    public Transaction(int itemId, String type, int quantity) {
        this.itemId = itemId;
        this.type = type;
        this.quantity = quantity;
    }
    
    // Getters and Setters
    public int getTransactionId() {
        return transactionId;
    }
    
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    
    public int getItemId() {
        return itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Timestamp getDate() {
        return date;
    }
    
    public void setDate(Timestamp date) {
        this.date = date;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    @Override
    public String toString() {
        return "Transaction [transactionId=" + transactionId + ", itemId=" + itemId + ", type=" + type
                + ", quantity=" + quantity + ", date=" + date + "]";
    }
} 