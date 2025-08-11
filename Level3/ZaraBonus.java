package Level_3;
public class ZaraBonus {
    static double[][] generateData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + Math.random() * 90000;
            data[i][1] = (int) (Math.random() * 11);
        }
        return data;
    }

    static double[][] calculateBonus(double[][] data) {
        double[][] newData = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonusRate = data[i][1] > 5 ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusRate;
            newData[i][0] = data[i][0] + bonus;
            newData[i][1] = bonus;
        }
        return newData;
    }

    static void displayTotals(double[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.printf("%-5s %-12s %-10s %-12s %-10s\n", "ID", "OldSalary", "Service", "NewSalary", "Bonus");
        for (int i = 0; i < oldData.length; i++) {
            totalOld += oldData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];
            System.out.printf("%-5d %-12.2f %-10.0f %-12.2f %-10.2f\n", 
                              (i + 1), oldData[i][0], oldData[i][1], newData[i][0], newData[i][1]);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-5s %-12.2f %-10s %-12.2f %-10.2f\n", "Total", totalOld, "", totalNew, totalBonus);
    }

    public static void main(String[] args) {
        double[][] oldData = generateData(10);
        double[][] newData = calculateBonus(oldData);
        displayTotals(oldData, newData);
    }
}
