public class Cat {

    public static String catName;
    public static int catAge;
    public static String catSex;
    public static boolean isVaccinated;
    public static String ownerName;

    public RandomHelper randomHelper = new RandomHelper();

    public Cat() {
        randomHelper.getRandomCat();
    }

    public Cat(String catName, int catAge, String catSex,
               boolean isVaccinated, String ownerName) {
        validCatsName(catName);
        validCatsAge(catAge);
        Cat.catSex = catSex;
        Cat.isVaccinated = isVaccinated;
        validateOwnerName(ownerName);
    }

    public Cat(String catName, int catAge, String catSex,
               boolean isVaccinated) {
        validCatsName(catName);
        validCatsAge(catAge);
        Cat.catSex = catSex;
        Cat.isVaccinated = isVaccinated;
    }

    public Cat(String catName, int catAge, String catSex, String ownerName) {
        validCatsName(catName);
        validCatsAge(catAge);
        Cat.catSex = catSex;
        validateOwnerName(ownerName);
    }

    public Cat(String catName, int catAge, String catSex) {
        validCatsName(catName);
        validCatsAge(catAge);
        Cat.catSex = catSex;
    }

    public void printFullCat() {
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + catAge);
        System.out.println("Пол: " + catSex);
        System.out.println("Привит: " + isVaccinated);
        System.out.println("Имя хозяина: " + ownerName);
        System.out.println();
    }

    void printCatOnly() {
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + catAge);
        System.out.println("Пол: " + catSex);
        System.out.println();
    }

    void printCatWithVaccines() {
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + catAge);
        System.out.println("Пол: " + catSex);
        System.out.println("Привит: " + isVaccinated);
        System.out.println();
    }

    void printCatOwner() {
        System.out.println("Имя: " + catName);
        System.out.println("Возраст: " + catAge);
        System.out.println("Пол: " + catSex);
        System.out.println("Имя хозяина: " + ownerName);
        System.out.println();
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        validCatsName(catName);
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        validCatsAge(catAge);
    }

    public String getCatSex() {
        return catSex;
    }

    public void setCatSex(String catSex) {
        Cat.catSex = catSex;
    }

    public boolean getVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean isVaccinated) {
        Cat.isVaccinated = isVaccinated;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        validateOwnerName(ownerName);
    }

    public void validCatsName(String catName) {
        if (catName.length() >= 3) {
            Cat.catName = catName;
        } else {
            System.out.println("Имя кота слишком короткое");
        }
    }

    public void validCatsAge(int catAge) {
        if (catAge < 20 && catAge > 0) {
            Cat.catAge = catAge;
        } else {
            System.out.println("Неправильный возраст кота");
        }
    }

    public void validateOwnerName(String ownerName) {
        if (ownerName.length() >= 5) {
            Cat.ownerName = ownerName;
        } else {
            System.out.println("Имя хозяина слишком короткое");
        }
    }

}