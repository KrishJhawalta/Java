#include <stdio.h>

// Structure to store account information
struct Account {
    float balance;
};

// Function to create an account with an initial balance
void createAccount(struct Account *account) {
    printf("Enter initial balance: $");
    scanf("%f", &account->balance);
    if (account->balance < 0) {
        printf("Invalid balance. Setting balance to $0.00.\n");
        account->balance = 0.0;
    }
    printf("Account created successfully!\n");
}

// Function to check balance
void checkBalance(struct Account *account) {
    printf("\nCurrent Balance: $%.2f\n", account->balance);
}

// Function to deposit money
void deposit(struct Account *account) {
    float amount;
    printf("\nEnter amount to deposit: $");
    scanf("%f", &amount);
    if (amount > 0) {
        account->balance += amount;
        printf("Deposited: $%.2f\n", amount);
    } else {
        printf("Invalid deposit amount.\n");
    }
}

// Function to withdraw money
void withdraw(struct Account *account) {
    float amount;
    printf("\nEnter amount to withdraw: $");
    scanf("%f", &amount);
    if (amount > 0 && amount <= account->balance) {
        account->balance -= amount;
        printf("Withdrew: $%.2f\n", amount);
    } else {
        printf("Invalid or insufficient funds.\n");
    }
}

// Main function
int main() {
    struct Account account;
    int choice;
    int accountCreated = 0;

    printf("Welcome to the Simple Banking System\n");

    while (1) {
        printf("\n1. Create Account\n2. Check Balance\n3. Deposit\n4. Withdraw\n5. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                if (!accountCreated) {
                    createAccount(&account);
                    accountCreated = 1;
                } else {
                    printf("Account already created.\n");
                }
                break;
            case 2:
                if (accountCreated) checkBalance(&account);
                else printf("Please create an account first.\n");
                break;
            case 3:
                if (accountCreated) deposit(&account);
                else printf("Please create an account first.\n");
                break;
            case 4:
                if (accountCreated) withdraw(&account);
                else printf("Please create an account first.\n");
                break;
            case 5:
                printf("Thank you for using our service!\n");
                return 0;
            default:
                printf("Invalid choice. Try again.\n");
        }
    }
}
