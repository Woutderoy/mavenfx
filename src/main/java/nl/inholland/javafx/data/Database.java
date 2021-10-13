package nl.inholland.javafx.data;

import nl.inholland.javafx.models.Admin;
import nl.inholland.javafx.models.Customer;
import nl.inholland.javafx.models.Ticket;
import nl.inholland.javafx.models.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Admin> admins = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

//    public List<Admin> getAdmins() {
//        return admins;
//    }

    public List<Ticket> getTickets() {
        return tickets;
    }

//    public List<Customer> getCustomers() {
//        return customers;
//    }

    public Database(){
        //users
             //admins
        users.add(new Admin("Sjaak", "de Bruine", "sjaakbruin", "bruin123", "admin"));
        users.add(new Admin("Fred", "Johansen", "fredjohan", "johan123", "admin"));
            //customers
        users.add(new Customer("Kees", "Fredinson", "keesfred", "fredinson123", "customer"));
        users.add(new Customer("John", "Doe", "johndoe", "doe123", "customer"));

//        //admins
//        admins.add(new Admin("Sjaak", "de Bruine", "sjaakbruin", "bruin123", "admin"));
//        admins.add(new Admin("Fred", "Johansen", "fredjohan", "johan123", "admin"));
//
//        //customers
//        customers.add(new Customer("Kees", "Fredinson", "keesfred", "fredinson123", "customer"));
//        customers.add(new Customer("John", "Doe", "johndoe", "doe123", "customer"));

        //tickets
        LocalDateTime start = LocalDateTime.of(LocalDate.of(2021, 10, 9), LocalTime.of(20, 0));
        LocalDateTime end = LocalDateTime.of(LocalDate.of(20210, 10, 9), LocalTime.of(22, 5));
        tickets.add(new Ticket(start, end, "No time for lies", 200, 12));

        start = LocalDateTime.of(LocalDate.of(2021, 10, 9), LocalTime.of(22, 30));
        end = LocalDateTime.of(LocalDate.of(2021, 10, 10), LocalTime.of(00, 2));
        tickets.add(new Ticket(start, end, "The Addams Family 19", 200, 9));
    }

}
