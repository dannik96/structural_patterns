package cvut.fel.omo.model;

// Dekorátor pro zaměstnance, který přidává bonus a prémii k měsíčnímu platu
public class BonusEmployee implements Employee {
    private Employee decoratedEmployee;
    private double bonus;
    private double performanceBonus;

    public BonusEmployee(Employee decoratedEmployee, double bonus, double performanceBonus) {
        this.decoratedEmployee = decoratedEmployee;
        this.bonus = bonus;
        this.performanceBonus = performanceBonus;
    }



    public void setPerformanceBonus(double performanceBonus) {
        this.performanceBonus = performanceBonus;
    }


}

