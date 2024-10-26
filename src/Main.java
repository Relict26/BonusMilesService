public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice; // стоимость билета
        int milesPerRubles = 20; // количество рублей для одной бонусной мили
        int bonusMiles; // количество начисленных миль
        // стоимость билета
        ticketPrice = 15500; // примерная стоимость билета
        // расчет количества бонусных миль
        bonusMiles = ticketPrice / milesPerRubles;
        // результат
        System.out.println("За купленный билет начислено " + bonusMiles + " бонусных миль.");
    }
}