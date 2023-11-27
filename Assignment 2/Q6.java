// Q6.	Create a class called Date that includes three pieces of information as instance variables—a month (type int), a day (type int) and a year (type int). Your class should have a constructor that initializes the three instance variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. Provide a method displayDate that displays the month, day and year separated by forward slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.

class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

public class Q6 {
    public static void main(String[] args) {
        // Create Date object
        Date date = new Date(7, 4, 2004); // Assuming correct values

        // Display the date
        System.out.print("The initial date is: ");
        date.displayDate();

        // Update the date
        date.setMonth(11);
        date.setDay(1);
        date.setYear(2003);

        // Display the updated date
        System.out.print("Date with new values is: ");
        date.displayDate();
    }
}

// Sample output:
// The initial date is: 7/4/2004
// Date with new values is: 11/1/2003