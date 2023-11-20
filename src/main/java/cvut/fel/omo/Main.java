package cvut.fel.omo;

import cvut.fel.omo.model.BonusEmployee;
import cvut.fel.omo.model.SimpleEmployee;


/*

Zadání: Inovativní řízení mzdové politiky ve firmě
Úvod
Firma se rozhodla zavést inovativní řízení mzdové politiky pro své zaměstnance. Cílem je využít návrhové vzory k implementaci
flexibilního systému, který umožní přidávat různé benefity a prémie ke standardním mzdovým sazbám. Implementace bude zahrnovat
využití design patternů, jako jsou Decorator a Proxy, pro efektivní a snadno rozšiřitelnou správu zaměstnaneckých informací a benefity.

Návrhové vzory
1. Konkrétní implementace zaměstnance (SimpleEmployee)
Vytvořte třídu pro konkrétní implementaci zaměstnance, který bude obsahovat základní informace, jako je jméno a měsíční plat.
Tato třída bude implementovat rozhraní pro získání měsíčního platu a zobrazení informací o zaměstnanci.

2. Dekorátor pro přidání bonusu a prémie (BonusPerformanceEmployeeDecorator)
Implementujte dekorátor, který umožní přidávat bonus a prémie ke standardním mzdovým sazbám zaměstnance. Tento dekorátor
by měl být schopen dynamicky měnit prémii za výkon v průběhu času.

3. Proxy pro omezení přístupu k citlivým informacím (EmployeeProxy)
Vytvořte proxy, které bude sloužit jako ochranný mechanismus pro citlivé informace zaměstnance. Proxy by mělo umožnit omezený
přístup pouze pro určité role a zajistit, že citlivé informace nejsou zobrazeny neoprávněným osobám.

Hlavní program
Vytvořte hlavní program, který demonstruje využití implementovaných návrhových vzorů. Vytvořte různé typy zaměstnanců, přidávejte a měňte benefity a prémie, a využijte proxy pro omezení přístupu k citlivým informacím.

 */

public class Main {
    public static void main(String[] args) {
        // Vytvoření jednoduchých zaměstnanců
        Employee employee1 = new SimpleEmployee("John Doe", 5000);
        Employee employee2 = new SimpleEmployee("Jane Doe", 6000);

        // Přidání bonusu a prémie k měsíčnímu platu pomocí Decorator Pattern
        BonusEmployee bonusPerformanceEmployee = new BonusEmployee(employee1, 1000, 500);

        // Zobrazení informací pro jednotlivé zaměstnance
        System.out.println("Displaying information for each employee:");

        System.out.println("\nSimple Employee 1:");
        employee1.displayInformation();

        System.out.println("\nSimple Employee 2:");
        employee2.displayInformation();

        System.out.println("\nEmployee with Bonus and Performance Bonus:");
        bonusPerformanceEmployee.displayInformation();

        // Nastavení nové prémie za výkon
        bonusPerformanceEmployee.setPerformanceBonus(700);

        // Zobrazení aktualizovaných informací pro zaměstnance s prémiovým bonusem
        System.out.println("\nEmployee with Updated Performance Bonus:");
        bonusPerformanceEmployee.displayInformation();
    }
}    }
        }
