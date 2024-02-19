// Add a library to handle random numbers
import java.util.Random;

//Create my main class
public class Main{
    //Create my main method which is the actual entry point of the program
    public static void main(String[] args){
        //Display title to user
        displayTitle();
        //Display description to user
        displayDescription();
        // Display the names of the crew members
        displayCrewMembers();
        displayUserPIN();

    }


    //Create a method to display the title
    public static void displayTitle(){
        System.out.println("\n\n*** Welcome to Mars Base Alpha ***\n");
    }


    //Create a method to display the description to our user
    public static void displayDescription(){
        System.out.println("Welcome to Mars Base Alpha, the forefront of human exploration and habitation on the Red Planet!");
        System.out.println("As you step into our state-of-the-art simulation, you're embarking on a journey that pushes the boundaries of human ingenuity and discovery. ");
        System.out.println("Here, amidst the rugged Martian terrain and beneath the crimson sky, you'll experience the challenges and wonders of life on Mars like never before.");
        System.out.println("Our team of scientists, engineers, and explorers welcomes you to this extraordinary endeavor, where every moment is an opportunity to unlock the mysteries of our neighboring planet. ");
        System.out.println("So, prepare to immerse yourself in the thrill of exploration, as we strive together to unlock the secrets of Mars and pave the way for humanity's future among the stars.");
        System.out.println("Welcome to Mars Base Alpha, where the adventure of a lifetime awaits!");
        
    }

        //Display the names of 10 crew members using an array of strings
        public static void displayCrewMembers(){
            //Create an array of names of crew members as a data type string.
            String [] crewMembers = new String[10];

            //Assign the names of the crew to our array
            crewMembers[0] = "Commander henry";
            crewMembers[1] = "Pilot David";
            crewMembers[2] = "Engineer Olivia";
            crewMembers[3] = "Medic Micheal";
            crewMembers[4] = "Geologist Sophia";
            crewMembers[5] = "Supply Officer James";
            crewMembers[6] = "Mission Specialist Emma";
            crewMembers[7] = "Communications Expert William";
            crewMembers[8] = "Botanist Sarah";
            crewMembers[9] = "psycologist Mary";

            //Display the names of the crew members to the user
            System.out.println("\n\nThe Crew members on our Mars Base are: ");
            //Let's use a for loop since it is a lot less code
            for(int i=0; i<crewMembers.length; i++)
                System.out.println(i+1 + ". " +crewMembers[i]);
    }

    // Create a function to generate a random 4 digit pin for the user to get around the Mars base
    public static void displayUserPIN(){
        //Create a random number generator
        Random random = new Random();
        // Generate a random 4 digit pin Between 1000 and 9999
        int pin = random.nextInt(9999) + 1000;
        //Display the pin to the user
        System.out.println("Your 4 digit PIN to access the base is: " + pin);
        System.out.println("\n\n");
    }

}
