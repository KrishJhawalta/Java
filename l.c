#include <stdio.h>
int main() {
    // store
    int choice, amount, withdraw;
    char name[50];

    while (1) {
        printf("\t ~ Simple Banking system ~ ");
        printf("\n1.Create Account");
        printf("\n2. View Balance");
        printf("\n3. Withdraw Money");
        printf("\n4. Add Money");
        printf("\n5. Exit");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1) {
            printf("Enter your name: ");
            scanf("%s", &name);
            printf("Enter your initial amount: ");
            scanf("%d", &amount);
            if (amount <= 0) {
                printf("Please enter a valid amount");
            }
            printf("Account Successfully created!");
        } else if (choice == 2) {
            printf("\nYour Balance is: %d", amount);
        } else if (choice == 3) {
            printf("Enter amount: ");
            scanf("%d", &withdraw);
            if (withdraw > amount) {
                printf("!! Insufficient balance!!");
            } else if (withdraw > 0) {
                amount -= withdraw;
                printf("Successfully withdrawn !");
            }
        } else if (choice == 4) {
            printf("Enter amount: ");
            scanf("%d", &withdraw);
            if (withdraw > 0) {
                amount += withdraw;
            }
        } else if (choice == 5) {
            break;
        } else {
            printf("Invalid Input!");
        }
    }

    return 0;
}