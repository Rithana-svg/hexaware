// User.java
package entity;

public class User {
    private int userId;
    private String username;
    private String password;
    private String role;

    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(int userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

// Client.java
package entity;

public class Client {
    private int clientId;
    private String clientName;
    private String contactInfo;
    private Policy policy;

    // Default constructor
    public Client() {}

    // Parameterized constructor
    public Client(int clientId, String clientName, String contactInfo, Policy policy) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.contactInfo = contactInfo;
        this.policy = policy;
    }

    // Getters and Setters
    public int getClientId() { return clientId; }
    public void setClientId(int clientId) { this.clientId = clientId; }
    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }
    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
    public Policy getPolicy() { return policy; }
    public void setPolicy(Policy policy) { this.policy = policy; }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", policy=" + policy +
                '}';
    }
}

// Claim.java
package entity;

import java.util.Date;

public class Claim {
    private int claimId;
    private String claimNumber;
    private Date dateFiled;
    private double claimAmount;
    private String status;
    private Policy policy;
    private Client client;

    // Default constructor
    public Claim() {}

    // Parameterized constructor
    public Claim(int claimId, String claimNumber, Date dateFiled, 
                double claimAmount, String status, Policy policy, Client client) {
        this.claimId = claimId;
        this.claimNumber = claimNumber;
        this.dateFiled = dateFiled;
        this.claimAmount = claimAmount;
        this.status = status;
        this.policy = policy;
        this.client = client;
    }

    // Getters and Setters
    public int getClaimId() { return claimId; }
    public void setClaimId(int claimId) { this.claimId = claimId; }
    public String getClaimNumber() { return claimNumber; }
    public void setClaimNumber(String claimNumber) { this.claimNumber = claimNumber; }
    public Date getDateFiled() { return dateFiled; }
    public void setDateFiled(Date dateFiled) { this.dateFiled = dateFiled; }
    public double getClaimAmount() { return claimAmount; }
    public void setClaimAmount(double claimAmount) { this.claimAmount = claimAmount; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Policy getPolicy() { return policy; }
    public void setPolicy(Policy policy) { this.policy = policy; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    @Override
    public String toString() {
        return "Claim{" +
                "claimId=" + claimId +
                ", claimNumber='" + claimNumber + '\'' +
                ", dateFiled=" + dateFiled +
                ", claimAmount=" + claimAmount +
                ", status='" + status + '\'' +
                ", policy=" + policy +
                ", client=" + client +
                '}';
    }
}

// Payment.java
package entity;

import java.util.Date;

public class Payment {
    private int paymentId;
    private Date paymentDate;
    private double paymentAmount;
    private Client client;

    // Default constructor
    public Payment() {}

    // Parameterized constructor
    public Payment(int paymentId, Date paymentDate, double paymentAmount, Client client) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.client = client;
    }

    // Getters and Setters
    public int getPaymentId() { return paymentId; }
    public void setPaymentId(int paymentId) { this.paymentId = paymentId; }
    public Date getPaymentDate() { return paymentDate; }
    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }
    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) { this.paymentAmount = paymentAmount; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentDate=" + paymentDate +
                ", paymentAmount=" + paymentAmount +
                ", client=" + client +
                '}';
    }
}
