import java.util.ArrayList;

public class CocoaRegister {

    public static final double TAX_RATE = 0.0875;

    private ArrayList<Sellable> items;
    private ArrayList<Integer> quantities;

    public CocoaRegister() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Sellable item, int quantity) {
        // TODO:
        // - if item is null OR quantity <= 0, do nothing
        // - otherwise, add item and quantity to the parallel ArrayLists
        if (item == null || quantity <= 0) {
            return;
        } else {
            items.add(item);
            quantities.add(quantity);
        }
    }

    public double getSubtotal() {
        // TODO:
        // sum item.getBasePrice() * quantity for all line items
        // return rounded to 2 decimals using ChocolateBar.round2(...)
        double subtotal = 0.0;
        for (int i = 0; i < items.size(); i++) {
            Sellable item = items.get(i);
            int quantity = quantities.get(i);
            subtotal += item.getBasePrice() * quantity;
        }
        return ChocolateBar.round2(subtotal);
    }

    public double getTax() {
        // TODO:
        // tax = subtotal * TAX_RATE, rounded to 2 decimals
        double tax = getSubtotal() * TAX_RATE;
        return ChocolateBar.round2(tax);
    }

    public double getTotal() {
        // TODO:
        // total = subtotal + tax, rounded to 2 decimals
        double total = getSubtotal() + getTax();
        return ChocolateBar.round2(total);
    }

    public void printReceipt() {
        // TODO: Print EXACTLY the required receipt format.
        //
        // Hints:
        // - Header line: "== COCOA CORNER =="
        // - For each line item i:
        // (i+1) + ". " + name + " x" + qty + " @ $" + unit + " = $" + lineTotal
        // - Use ChocolateBar.money(...) for all currency formatting
        String result = "== COCOA CORNER ==\n";
        for (int i = 0; i < items.size(); i++) {
            if (i == 0) {
                result += (i + 1) + ". " + items.get(i).getName() + " x" + quantities.get(i) + " @ $"
                        + ChocolateBar.money(items.get(i).getBasePrice()) + " = $"
                        + ChocolateBar.money(items.get(i).getBasePrice() * quantities.get(i));
            } else {
                result += "\n" + (i + 1) + ". " + items.get(i).getName() + " x" + quantities.get(i) + " @ $"
                        + ChocolateBar.money(items.get(i).getBasePrice()) + " = $"
                        + ChocolateBar.money(items.get(i).getBasePrice() * quantities.get(i));
            }
        }
        System.out.println(result);
        System.out.println("Subtotal: $" + ChocolateBar.money(getSubtotal()));
        System.out.println("Tax: $" + ChocolateBar.money(getTax()));
        System.out.println("Total: $" + ChocolateBar.money(getTotal()));
    }

}
