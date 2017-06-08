package test.generic;

/**
 * Created by admin on 2017/5/3.
 */
public class CosmeticProducts implements CosmeticProductsInterface<Lipstick>{
    @Override
    public Lipstick getCosmeticProducts(Lipstick product) {
        if(null != product){
            return product ;
        }
        return null;
    }

    public static void main(String[] args) {
        CosmeticProducts cosmeticProducts = new CosmeticProducts();
        Lipstick lipstick = cosmeticProducts.getCosmeticProducts(new Lipstick());
        if(null != lipstick){
            System.out.println(lipstick.toString());
        }
    }
}
