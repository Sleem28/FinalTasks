package Classes.Animal;

/**
 * Базовый класс для животных
 */
public class BaseAnimal implements ICry {

    protected String name;

    public String getName() {
        return name;
    }

    protected int legs;
    protected String birthday;
    protected double height;
    protected double weight;
    protected String cry;
    protected String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLegs() {
        return legs;
    }

    public String getBirthday() {
        return birthday;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }


    /**
     * Базовый класс для животных
     * @param legs количество ног
     * @param birthday  дата рождения
     * @param height рост
     * @param weight вес
     */
    public BaseAnimal(int legs, String birthday, double height, double weight) {
        this.legs = legs;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.status = "";
    }

    @Override
    public void cry() {

    }


}
