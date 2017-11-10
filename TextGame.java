import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class TextGame {

    public static class var {
        public static int robHealth = 100;
        public static int petHealth = 20;
        public static int homeHealth = 40;
        public static int money;

        public static boolean livingSearch = false;
        public static boolean kitchenSearch = false;
        public static boolean pantrySearch = false;
        public static boolean hallwaySearch = false;
        public static boolean bedSearch = false;
        public static boolean studySearch = false;
        public static boolean crackedSafe = false;
        public static boolean baseSearch = false;

        public static boolean firstNum = false;
        public static boolean secNum = false;
        public static boolean thirdNum = false;
        public static boolean fourthNum = false;

        public static long response;
        public static long response2;
        public static long response3;
        public static long response4;
    }

    public static void enter(){
        StdOut.println("Welcome to Robber Barons. Would you like to rob someone? Yes or No");
        String response = StdIn.readString();
        if(response.equals("No")){
            StdOut.println("Your a good citizen.");
        }else if(response.equals("Yes")){
            StdOut.println("Let's enter the house of Mr. Monopoly.");
            living();
        }else{
            StdOut.println(response + " is not valid");
            enter();
        }
    }

    public static void living(){
        if(var.livingSearch == false){
            printFile("C://Users/jdgbs/IdeaProjects/Text Game/src/Living.txt");
            StdOut.println("You are in the living room. There are three doors; one for the kitchen, hallway, and the front door. " +
                    "Do you want to enter one? Kitchen, Hallway, or Front");
            StdOut.println("Would you like to search for money? Yes or No");
            String response = StdIn.readString();
            if(response.equals("Yes")) {
                var.livingSearch = true;
                StdOut.println("You found no money.");
                living();
            }else if(response.equals("No")){
                StdOut.println("You are a robber, act like it.");
                living();
            }else if(response.equals("Kitchen")){
                kitchen();
            }else if(response.equals("Hallway")){
                hallway();
            }else if(response.equals("Front")) {
                frontdoor();
            }else{
                StdOut.println(response + " is not valid");
                living();
            }
        }else {
            StdOut.println("You are in the living room. There are three doors; one for the kitchen, hallway, or front door. " +
                    "Do you want to enter one? Kitchen, Hallway, or Front");
            String response = StdIn.readString();
            if(response.equals("Kitchen")) {
                kitchen();
            }else if(response.equals("Hallway")) {
                hallway();
            }else if(response.equals("Front")){
                frontdoor();
            }else{
                StdOut.println(response + " is not valid");
                living();
            }
        }
    }

    public static int frontdoor(){
        if(var.money >= 50) {
            return var.money;
        }else{
            int dollar = 50 - var.money;
            StdOut.println("You don't have enough money to leave, you need " + dollar + " more dollars to leave.");
            living();
        }
        return var.money;
    }

    public static void kitchen(){
        if(var.kitchenSearch == false) {
            printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Kitchen.text");
            StdOut.println("You are in the kitchen. There is one door to the pantry. " +
                    "Do you want to enter? Y or N");
            StdOut.println("Would you like to search for money? Yes or No");
            StdOut.println("Or would you like to return to the living room? Living or Kitchen");
            String response = StdIn.readString();
            if(response.equals("Yes")) {
                var.kitchenSearch = true;
                printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Money.text");
                StdOut.println("You found 10 dollars.");
                var.money += 10;
                kitchen();
            }else if(response.equals("No")){
                StdOut.println("You are a robber, act like it.");
                kitchen();
            }else if(response.equals("Y")){
                pantry();
            }else if(response.equals("N")){
                kitchen();
            }else if(response.equals("Living")){
                living();
            }else if(response.equals("Kitchen")){
                kitchen();
            }else{
                StdOut.println(response + " is not valid");
                kitchen();
            }
        }else{
            StdOut.println("You are in the kitchen. There is one door to the pantry. " +
                    "Do you want to enter? Yes or No");
            StdOut.println("Or do you wish to return to the living room? Y or N");
            String response = StdIn.readString();
            if(response.equals("Yes")) {
                pantry();
            }else if(response.equals("No")) {
                kitchen();
            }else if(response.equals("Y")){
                living();
            }else if(response.equals("N")){
                kitchen();
            }else{
                StdOut.println(response + " is not valid");
                kitchen();
            }
        }
    }

    public static void pantry(){
        if(var.pantrySearch == false) {
            printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Pantry.txt");
            StdOut.println("You are in the pantry.");
            StdOut.println("Would you like to search for money? Yes or No");
            String response = StdIn.readString();
            if (response.equals("Yes")) {
                var.pantrySearch = true;
                printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Money.text");
                StdOut.println("You found 10 dollars.");
                var.money += 10;
                pantry();
            }else if(response.equals("No")){
                StdOut.println("You are a robber, act like it.");
                pantry();
            }else{
                StdOut.println(response + " is not valid");
                pantry();
            }
        }else{
            StdOut.println("You are in the pantry." +
                    "Do you want to return to the kitchen? Yes or No");
            String response = StdIn.readString();
            if(response.equals("Yes")) {
                kitchen();
            }else if(response.equals("No")) {
                StdOut.println("How are you going to finish robbing the place, if you don't move?");
                pantry();
            }else{
                StdOut.println(response + " is not valid");
                pantry();
            }
        }
    }

    public static void hallway(){
        if(var.hallwaySearch == false){
            StdOut.println("You are in the hallway. There are two doors; one for the bedroom and basement. " +
                    "Do you want to enter one? Bedroom or Basement");
            StdOut.println("Or do you want to go back to the living room? Y or N");
            StdOut.println("Would you like to search for money? Yes or No");
            String response = StdIn.readString();
            if(response.equals("Yes")) {
                var.hallwaySearch = true;
                printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Pet.txt");
                StdOut.println("A wild Iron Corgi appears.");
                petAttack();
            }else if(response.equals("No")){
                StdOut.println("You are a robber, act like it.");
                hallway();
            }else if(response.equals("Bedroom")){
                bedroom();
            }else if(response.equals("Basement")){
                basement();
            }else if(response.equals("Y")){
                living();
            }else if(response.equals("N")){
                hallway();
            }else{
                StdOut.println(response + " is not valid");
                hallway();
            }
        }else {
            StdOut.println("You are in the hallway. There are two doors; one for the bedroom and basement. " +
                    "Do you want to enter one? Bedroom or Basement.");
            StdOut.println("Or do you want to go back to the living room? Yes or No");
            String response = StdIn.readString();
            if(response.equals("Bedroom")) {
                bedroom();
            }else if(response.equals("Basement")) {
                basement();
            }else if(response.equals("Yes")){
                living();
            }else if(response.equals("No")){
                hallway();
            }else{
                StdOut.println(response + " is not valid");
                hallway();
            }
        }
    }

    public static void petAttack(){
        if(var.petHealth > 0){
            StdOut.println("Its attacking you, quiet it before it alerts Mr. Monopoly!!! Fight or Jail");
            String response = StdIn.readString();
                if(response.equals("Fight")){
                    fight();
                }else if(response.equals("Jail")){
                    jail();
                }else{
                    StdOut.println(response + " is not valid");
                    petAttack();
                }
        }else{
            hallway();
        }
    }

    public static void fight(){
        StdOut.println("You attacked the IRON CORGI");
        double hit = Math.random();
        double strike = Math.random();
        if(strike > 0.5){
            var.petHealth -= 10;
            unconPet();
        }else if(hit > 0.3){
            StdOut.println("Your attack missed the IRON CORGI. The IRON CORGI retaliates.");
            var.robHealth -= 5;
            jailRob();
        }else{
            StdOut.println("Attacks Failed to Land");
            petAttack();
        }
    }

    public static void unconPet(){
        if(var.petHealth > 0){
            StdOut.println("The IRON CORGI'S health is " + var.petHealth);
            petAttack();
        }else{
            StdOut.println("The IRON CORGI is unconscious");
            hallway();
        }
    }

    public static void jailRob(){
        if(var.robHealth < 0){
            StdOut.println("The IRON CORGI alerted Mr. Monopoly and the cops sent you to jail.");
        }else{
            StdOut.println("Your health is " + var.robHealth);
            petAttack();
        }
    }

    public static void jail(){
        printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Jail.txt");
        StdOut.println("You are pathetic robber to be found out.");
    }

    public static void bedroom(){
        if(var.bedSearch == false){
            printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Bed.txt");
            StdOut.println("You are in the bedroom. There is a door leading to the study." +
                    " Do you want to enter? Study or Bedroom");
            StdOut.println("Would you like to search for money? Yes or No");
            String response = StdIn.readString();
            if (response.equals("Yes")) {
                var.bedSearch = true;
                printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Money.text");
                StdOut.println("You found 10 dollars.");
                var.money += 10;
                bedroom();
            }else if(response.equals("No")){
                StdOut.println("You are a robber, act like it.");
                bedroom();
            }else if(response.equals("Study")) {
                study();
            }else if(response.equals("Bedroom")){
                bedroom();
            }else{
                StdOut.println(response + " is not valid");
                bedroom();
            }
        }else{
            StdOut.println("You are in the bedroom." +
                    " Do you want to return to the hallway? Yes or No");
            StdOut.println("Do you want to enter the study? Study or Bedroom");
            String response = StdIn.readString();
            if(response.equals("Yes")){
                hallway();
            }else if(response.equals("No")) {
                StdOut.println("How are you going to finish robbing the place, if you don't move?");
                bedroom();
            }else if(response.equals("Study")){
                study();
            }else if(response.equals("Bedroom")) {
                bedroom();
            }else{
                StdOut.println(response + " is not valid");
                bedroom();
            }
        }
    }

    public static void study(){
        if(var.studySearch == false){
            printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Study.txt");
            StdOut.println("You are in the study. Do you want to search for money? Yes or No");
            String response = StdIn.readString();
            if(response.equals("Yes")){
                safe();
            }else if(response.equals("No")){
                StdOut.println("You are a robber, like like it");
                study();
            }else{
                StdOut.println(response + " is not valid");
                study();
            }
        }else{
            StdOut.println("You are in the study. Do you want to return to the bedroom? Yes or No" +
                    "Do you want to look at the safe? Y or N");
            String response = StdIn.readString();
            if(response.equals("Yes")){
                bedroom();
            }else if(response.equals("No")) {
                StdOut.println("How are you going to finish robbing the place, if you don't move?");
                study();
            }else if(response.equals("Y")){
                crack();
            }else if(response.equals("N")){
                study();
            }else{
                StdOut.println(response + " is not valid.");
                study();
            }
        }
    }

    public static void safe(){
        printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Safe.txt");
        StdOut.println("While you found no money, you discovered a safe behind the bookcase made in 1935.");
        StdOut.println("Do you want to crack the safe open? Yes or No");
        String response = StdIn.readString();
        if(response.equals("Yes")){
            crack();
        }else if(response.equals("No")){
            StdOut.println("You are a robber, like like it");
            safe();
        }else{
            StdOut.println(response + " is not valid.");
            safe();
        }
    }

    public static void crack() {
        if (var.crackedSafe == false) {
            StdOut.println("Type in a number greater than zero and try to figure out the combination to the safe.");
            if (var.firstNum == false) {
                StdOut.println("The combination is _ _ _ _");
                var.response = StdIn.readInt();
                long code = Math.round(Math.random() * 10);
                if (var.response == code || var.response == 1) {
                    var.firstNum = true;
                    StdOut.println("That's the first number in the combination.");
                    crack();
                } else if (var.response > 0) {
                    StdOut.println("That's not the first number in the combination.");
                    crack();
                } else {
                    StdOut.println(var.response + " is not valid");
                    crack();
                }
            } else if (var.secNum == false) {
                StdOut.println("The combination so far is " + var.response + " _ _ _");
                var.response2 = StdIn.readInt();
                long code = Math.round(Math.random() * 10);
                if (var.response2 == code || var.response2 == 9) {
                    var.secNum = true;
                    StdOut.println("That's the second number in the combination");
                    crack();
                } else if (var.response2 > 0) {
                    StdOut.println("That's not the second number");
                    crack();
                } else {
                    StdOut.println(var.response2 + " is not valid");
                    crack();
                }
            } else if (var.thirdNum == false) {
                StdOut.println("The combination so far is " + var.response + " " + var.response2 + " _ _");
                var.response3 = StdIn.readInt();
                long code = Math.round(Math.random() * 10);
                if (var.response3 == code || var.response3 == 3) {
                    var.thirdNum = true;
                    StdOut.println("That's the third number in the combination");
                    crack();
                } else if (var.response3 > 0) {
                    StdOut.println("That's not the third number");
                    crack();
                } else {
                    StdOut.println(var.response3 + " is not valid");
                    crack();
                }
            } else if (var.fourthNum == false) {
                StdOut.println("The combination so far is " + var.response + " " + var.response2 + " " + var.response3 + " _");
                var.response4 = StdIn.readInt();
                long code = Math.round(Math.random() * 10);
                if (var.response4 == code || var.response4 == 5) {
                    var.fourthNum = true;
                    var.crackedSafe = true;
                    var.studySearch = true;
                    StdOut.println("That's the fourth number in the combination");
                    StdOut.println("The combination to the safe was " + var.response + " " + var.response2 + " " + var.response3 + " " + var.response4);
                    printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Money.text");
                    StdOut.println("You found fifty dollars.");
                    var.money += 50;
                    study();
                } else if (var.response4 > 0) {
                    StdOut.println("That's not the fourth number");
                    crack();
                } else {
                    StdOut.println(var.response4 + " is not valid");
                    crack();
                }
            }
        }else{
            StdOut.println("You have already cracked the safe.");
            study();
        }
    }

    public static void basement(){
        if(var.baseSearch == false) {
            printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Basement.txt");
            StdOut.println("You are in the basement.");
            StdOut.println("Would you like to search for money? Yes or No");
            String response = StdIn.readString();
            if(response.equals("Yes")){
                var.baseSearch = true;
                printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Monopoly.txt");
                StdOut.println("Mr. Monopoly found you. Stop him from contacting the police.");
                monopolyAttack();
            }else if(response.equals("No")){
                StdOut.println("You are a robber, act like it.");
                basement();
            }else{
                StdOut.println(response + " is not valid");
                basement();
            }
        }else{
            StdOut.println("You are in the basement." +
                    "Do you want to return to the hallway? Yes or No");
            String response = StdIn.readString();
            if(response.equals("Yes")) {
                hallway();
            }else if(response.equals("No")) {
                StdOut.println("How are you going to finish robbing the place, if you don't move?");
                basement();
            }else{
                StdOut.println(response + " is not valid");
                basement();
            }
        }
    }

    public static void monopolyAttack() {
        if (var.homeHealth > 0) {
            StdOut.println("He's attacking you, stop him from subduing you!!! Battle or Jail");
            String response = StdIn.readString();
                if (response.equals("Battle")) {
                    battle();
                } else if (response.equals("Jail")) {
                    jail();
                } else {
                    StdOut.println(response + " is not valid");
                }
            }else {
            hallway();
        }
    }

    public static void battle(){
        StdOut.println("You attacked Mr. Monopoly");
        double hit = Math.random();
        double strike = Math.random();
        if(strike > 0.3){
            var.homeHealth -= 20;
            unconMon();
        }else if(hit > 0.1){
            StdOut.println("Your attack missed Mr. Monopoly. He retaliates by hitting you with his cane.");
            var.robHealth -= 10;
            jailRob2();
        }else{
            StdOut.println("Attacks Failed to Land");
        }
    }

    public static void unconMon(){
        if(var.homeHealth > 0){
            StdOut.println("Mr. Monopoly's health is " + var.homeHealth);
            monopolyAttack();
        }else{
            StdOut.println("Mr. Monopoly is unconscious");
            printFile("C:\\Users\\jdgbs\\IdeaProjects\\Text Game\\src\\Money.text");
            StdOut.println("You found 20 dollars");
            var.money += 20;
            basement();
        }
    }

    public static void jailRob2(){
        if(var.robHealth < 0){
            StdOut.println("Mr. Monopoly alerted the cops and they sent you to jail.");
        }else{
            StdOut.println("Your health is " + var.robHealth);
            monopolyAttack();
        }
    }


    public static void printFile(String filename){
        In reader = new In(filename);
        while(reader.hasNextLine()){
            StdOut.println(reader.readLine());
        }
    }

    public static void main(String[] args){
        enter();
        if(var.money >= 50){
            StdOut.println("You have successfully robbed the house. You got away scott clean.");
        }
    }
}