package HomeWork14_19;

public class PrintingDate {

    public static String printingDate(String d) {
        String date = "";

        switch (d.substring(0, 2)) {
            case "01": {
                date += "January";
                break;
            }
            case "02": {
                date += "February";
                break;
            }
            case "03": {
                date += "March";
                break;
            }
            case "04": {
                date += "April";
                break;
            }
            case "05": {
                date += "May";
                break;
            }
            case "06": {
                date += "June";
                break;
            }
            case "07": {
                date += "July";
                break;
            }
            case "08": {
                date += "August";
                break;
            }
            case "09": {
                date += "September";
                break;
            }
            case "10": {
                date += "October";
                break;
            }
            case "11": {
                date += "November";
                break;
            }
            case "12": {
                date += "December";
                break;
            }
            default:
                System.out.println("BRRRRRR");
        }
        date += " " + d.substring(3, 5) + ", " + d.substring(6);

        return date;
    }

    public static void main(String[] args) {

        System.out.println(printingDate("02/22/1997"));
    }

}
