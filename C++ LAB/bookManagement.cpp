#include <iostream>
#include <string>
using namespace std;

class BookManagement {
private:
    int bookId;
    string title;
    string author;
    float price;
    static int totalBooks;

public:
    BookManagement() {
        bookId = 0;
        title = "";
        author = "";
        price = 0.0;
    }

    BookManagement(int id, string bookName, string bookBy, float amount) {
        bookId = id;
        title = bookName;
        author = bookBy;
        price = amount;
        totalBooks++;
    }

    void addBook() {
        cout << "Enter Book Id: ";
        cin >> bookId;

        cout << "Enter Book Title (single word): ";
        cin >> title;

        cout << "Enter Author Name (single word): ";
        cin >> author;

        cout << "Enter Price: ";
        cin >> price;

        totalBooks++;
    }

    void display() {
        cout << "\nBook Id: " << bookId << endl;
        cout << "Book Title: " << title << endl;
        cout << "Author: " << author << endl;
        cout << "Price: " << price << endl;
        cout << "-----------------------------" << endl;
    }

    static void showTotalBooks() {
        cout << "\nTotal books are: " << totalBooks << endl;
    }
};

int BookManagement::totalBooks = 0;

int main() {
    int n;
    cout << "How many books do you want to add? ";
    cin >> n;

    BookManagement books[n];  // array of objects

    for (int i = 0; i < n; i++) {
        cout << "\nEnter details for Book " << i + 1 << ":" << endl;
        books[i].addBook();
    }

    cout << "\n--- Book Details ---" << endl;
    for (int i = 0; i < n; i++) {
        books[i].display();
    }

    BookManagement::showTotalBooks();
    return 0;
}

  


    


