public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;
        double subtotal = calculateSubtotal(items, expensiveItemsTemp);
        premiumCount = countPremiumItems(expensiveItemsTemp);
        String[] premiumItems = trimPremiumItems(expensiveItemsTemp, premiumCount);
        double tax = calculateTax(subtotal, taxRate);
        double total = calculateTotal(subtotal, taxRate);
        printOrderSummary(subtotal, tax, total, premiumCount);
        return new OrderSummary(total, subtotal, tax, premiumItems);
    }

    public static double calculateSubtotal(Item[] items, String[] premiumItems) {
        double subtotal = 0.0;
        int premiumIndex = 0;
        for (Item item : items) {
            double itemTotal = calculateItemTotal(item.getPrice(), item.getQuantity());
            subtotal += itemTotal;

            if (isPremiumItem(item) == true) {
                premiumItems[premiumIndex++] = item.getName();
                printPremiumItem(item);
            } else {
                printRegularItem(item);
            }
        }
        return subtotal;
    }

    public static boolean isPremiumItem(Item item) {
        if (item.getPrice() > 50.0) {
            return true;
        }
        return false;
    }

    public static boolean isRegularItem(Item item) {
        if (isPremiumItem(item) == false) {
            return true;
        }
        return false;
    }

    public static void printPremiumItem(Item item) {
        if (isPremiumItem(item) == true) {
            System.out.println(item.getName() + " is a premium item at $" + item.getPrice());
        }
    }

    public static void printRegularItem(Item item) {
        if (isRegularItem(item) == true) {
            System.out.println(item.getName() + " is a regular item at $" + item.getPrice());
        }
    }

    public static int countPremiumItems(String[] premiumItems) {
        int count = 0;
        for (String item : premiumItems) {
            if (item != null) {
                count++;
            }
        }
        return count;
    }

    public static String[] trimPremiumItems(String[] temp, int amount) {
        String[] result = new String[amount];
        for (int x = 0; x < amount; x++) {
            result[x] = temp[x];
        }
        return result;
    }

    public static double calculateTotal(double subtotal, double taxRate) {
        double tax;
        double total;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
            total = subtotal + tax;
        } else {
            total = 0;
        }
        return total;
    }

    public static double calculateTax(double subtotal, double taxRate) {
        double tax;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
        } else {
            tax = 0;
        }
        return tax;
    }

    public static double calculateItemTotal(double price, int quantity) {
        double itemTotal = price * quantity;
        return itemTotal;
    }

    public static void printOrderSummary(double subtotal, double tax, double total, int premiumCount) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);
    }
}