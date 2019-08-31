package pl.sda.List;

public class MainList {

    public static void main(String[] args) {
        IList list = new ArrayList2x();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0,5);

        long[] tab = list.getHolderView();

        for (long val:tab)
            System.out.print(val + " ");
    }
}
