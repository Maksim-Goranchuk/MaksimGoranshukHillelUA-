package less5.model;

public class Cat extends Sportsman {

    public static final String OBJECT_CLASS = "Кот";
    public static final String SUCCESFULL_RUN_RESULT = "пробежал  ";
    public static final String BAD_RUN_RESULT = " не пробежал  ";
    public static final String SUCCESFULL_JUMP_RESULT = " перепрыгнул  ";
    public static final String BAD_JUMP_RESULT = " не перепрыгнул ";

  public Cat(String name, int maxdistance, double maxheight) {
        super(name,maxdistance,maxheight);
        super.info= OBJECT_CLASS + " по кличке " + name;
        super.succesfulrunresult=SUCCESFULL_RUN_RESULT;
        super.badrunresult=BAD_RUN_RESULT;
        super.succesfuljumpresult=SUCCESFULL_JUMP_RESULT;
        super.badjumpresult=BAD_JUMP_RESULT;
    }
}
