public class Temperatures {
    private String weekName;
    private int[] temperatures;

    
    public Temperatures(String weekName, int[] temperatures) {
        this.weekName = weekName;
        this.temperatures = temperatures;
    }

    
    private int getMinTemperature() {
        int min = temperatures[0];
        for (int temp : temperatures) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    
    private int getMaxTemperature() {
        int max = temperatures[0];
        for (int temp : temperatures) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(weekName).append(" temperatures are between ")
          .append(getMinTemperature()).append(" and ").append(getMaxTemperature())
          .append("\n(");

        for (int i = 0; i < temperatures.length; i++) {
            sb.append(temperatures[i]);
            if (i < temperatures.length - 1) {
                sb.append(" ");
            }
        }

        sb.append(")");
        return sb.toString();
    }
}
