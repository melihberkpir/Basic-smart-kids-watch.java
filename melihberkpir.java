/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melih
 */
import java.util.Scanner;

public class melihberkpir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Contacts = "Mother,Father,Big Brother,Sister";
        int users_enter = 0;
        long start_time=0;
        long end_time=0;
        String call_logs ="";
        String message_logs="";
        while(users_enter!=7){
        System.out.println("What do you want to do?");
        System.out.print("1.Time\n2.Stopwatch\n3.Phone Functions\n4.Contact Management\n"
                + "5.Call Logs and Message Logs\n6.Guess Number Game\n7.Close smartwatch\n");
        
        users_enter = input.nextInt();
            switch (users_enter) {
                case 1:
                    break;
                case 2:
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Press a button for start clockwatch");
                        int startclockwatch = input.nextInt();
                        start_time = System.currentTimeMillis();
                        System.out.println("Press a button for stop clockwatch.");
                        int stopclockwatch = input.nextInt();
                        end_time = System.currentTimeMillis();                                               
                    }                                        
                    System.out.println(-(double)(start_time-end_time)/1000);
                    System.out.println("Press 2 for reset");
                    break;
                case 3:
                    System.out.println("Which function do you want to use?");
                    System.out.println("1.Make a call\n2.Send text message");                   
                    int select_function=input.nextInt();
                    if (select_function==1) {
                    System.out.println("Who do you want to call"); 
                    System.out.println("1.Mother\n2.Father\n3.Big Brother\n4.Sister");
                    int call = input.nextInt();
                        switch (call) {
                            case 1:
                                System.out.println("Mother is calling");
                                call_logs+="Mother,";
                                break;
                            case 2:
                                System.out.println("Father is calling");
                                call_logs+="Father,";
                                break;
                            case 3:
                                System.out.println("Big Brother is calling");
                                call_logs+="Big Brother,";
                                break;
                            case 4:
                                System.out.println("Sister is calling");
                                call_logs+="Sister,";
                                break;
                            default:
                                System.out.println("Invalid person");
                        }
                    }
                    else if(select_function==2){
                    System.out.println("Who do you want to send a message to?"); 
                    System.out.println("1.Mother\n2.Father\n3.Big Brother\n4.Sister");
                    int message = input.nextInt();
                    System.out.println("What do you want to text?");
                    String sending_messages = input.next();
                        
                    switch (message) {
                            case 1:
                                System.out.println("Sending message to Mother");
                                message_logs+=" Mother:"+sending_messages;
                                break;
                            case 2:
                                System.out.println("Sending message to Father");
                                message_logs+=" Father:"+sending_messages;
                                break;
                            case 3:
                                System.out.println("Sending message to Big Brother");
                                message_logs+=" Big Brother:"+sending_messages;
                                break;
                            case 4:
                                System.out.println("Sending message to Sister");
                                message_logs+=" Sister:"+sending_messages;
                                break;
                            default:
                                System.out.println("Invalid person");
                    }
                    }
                    else System.out.println("Wrong Function");
                    break;
                case 4:
                    System.out.println("What do you want to do in Contact Management");
                    System.out.println("1.View your Contacts\n2.Add a person\n3.Delete a person");
                    int users_contacts = input.nextInt();
                    switch(users_contacts){
                        case 1:System.out.println(Contacts);
                            break;
                        case 2:
                            System.out.println("What is the person's name");
                            String new_contact = input.next();
                            Contacts+=new_contact;
                            break;
                        case 3:
                            System.out.println("Who do you want to delete");
                            String delete_contact=input.next();
                            Contacts=delete_contact;
                            break;
                        default:System.out.println("Invalid Function");
                    
                    }
                    break;
                    
                case 5:
                    System.out.println("Which logs do you want to see");
                    System.out.println("1.Call Logs\n2.Message Logs");
                    int view_logs=input.nextInt();
                    switch(view_logs){
                        case 1:
                            System.out.println(call_logs);
                            break;
                        case 2:
                            System.out.println(message_logs);
                            break;
                        default:System.out.println("InvalidFunction");
                                
                    
                    }
                    break;
                case 6:
                    int randomNumber = (int) (Math.random() * 101);
        
                    System.out.print("Make a guess: ");
                    int guess = input.nextInt();

                    while (guess != randomNumber) {
                    if (guess < randomNumber) {
                    System.out.println("The guess is too low!");
                    } else if (guess > randomNumber) {
                    System.out.println("The guess is too high!");
                    }
                    System.out.print("Make a guess: ");
                    guess = input.nextInt();
                    }
                    System.out.println("You won the game");
                    break;
                case 7:
                    System.out.println("Smartwatch is turning off");
                default:
                    System.out.println("Invalid Function");
                    
                
            }
        }
    }

}

