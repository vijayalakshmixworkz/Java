 
 class MaskRunner
 {
 public static void main (String[] args) {
        Mask mask1 = new Mask();
        System.out.println(mask1);

        Mask mask2 = new Mask(29.99);
        System.out.println(mask2);

        Mask mask3 = new Mask('L');
        System.out.println(mask3);

        Mask mask4 = new Mask("Cotton");
        System.out.println(mask4);

        Mask mask5 = new Mask(19.99, 'M', "Silk");
        System.out.println(mask5);

        Mask mask6 = new Mask(24.99, 'S');
        System.out.println(mask6);
    }
}