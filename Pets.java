//Alenna - alenna.castaneda@oneidaihla.org
//for CTE software development 1
//instructor Mr Gross

public class Pets {
    String name;
    String owner;
    int age;
    int birthMonth;
    int birthDay;
    String breed;

    //constructor
    public Pets(String petName,String petBreed,int petAge,int petBirthMonth,int petBirthDay,String petOwner) {
        name = petName;
        breed = petBreed;
        age = petAge;
        birthMonth = petBirthMonth;
        birthDay = petBirthDay;
        owner = petOwner;
    }

    //prints moving pet
    void move() {
        System.out.println(name+" is on the move.");
    }

    //changes pet's age on birthday
    void birthday(int currentMonth,int currentDay) {
        if (birthMonth == currentMonth) {//checking if currentMonth is birthMonth
            if (birthDay == currentDay) {//checking if currentDay is birthDay
                System.out.println("Happy birthday, "+name+"!");
                age++;
                System.out.println(name+" turned "+age+".");
            }
        }
    }
}
//creating new bird subclass
class Bird extends Pets {
    int wingspanCM;

    void move() { //overriding move function
        System.out.println(name+" is flying.");
    }

    void sing() { //adding sing function to bird class
        System.out.println("tweet tweet");
    }

    //constructor
    public Bird(String petName,String petBreed,int petAge,int petBirthMonth,int petBirthDay,String petOwner,int birdWingspanCM) {
        //accessing Pets constructor
        super(petName, petBreed, petAge, petBirthMonth, petBirthDay, petOwner);
        wingspanCM = birdWingspanCM;
    }
}
//creating new snake subclass
class Snake extends Pets {
    int lengthFT;

    void move() { //overriding move function
        System.out.println(name+" is slithering.");
    }

    //constructor
    public Snake(String petName,String petBreed,int petAge,int petBirthMonth,int petBirthDay,String petOwner,int snakeLengthFT) {
        //accessing Pets constructor
        super(petName, petBreed, petAge, petBirthMonth, petBirthDay, petOwner);
        lengthFT = snakeLengthFT;
}
}

class test {
    public static void main(String[] args) {

        //creating new pet bird.
        Bird pet1 = new Bird("Pebbles", "budgie", 4, 12, 6, "Bencen", 30);
        //creating new pet snake.
        Snake pet2 = new Snake("Dotty", "corn snake", 6, 10, 4, "Beatrice", 3);
        //creating new pet
        Pets pet3 = new Pets("Abby", "fluffball", 2, 8, 9, "Bentley");

        pet1.sing();//running bird's sing function
        //running move function for each pet
        pet1.move();
        pet2.move();
        pet3.move();

        System.out.println();//adding a space
        System.out.println("Today is someone's birthday..");
        System.out.println();//adding a space

        //running birthday function for each pet
        pet1.birthday(10, 4);
        pet2.birthday(10, 4);
        pet3.birthday(10,4);
}
}