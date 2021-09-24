import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MaterialManagement management = new MaterialManagement();
        Material material1 = new Meat("01", "thit bo",
                LocalDate.of(2021,10,1),30000,4);

        Material material2 = new Meat("02", "thit heo",
                LocalDate.of(2021,9,29),10000,6);

        Material material3 = new Meat("03", "thit ga",
                LocalDate.of(2021,9,26),10000,6);

        Material material4 = new Meat("04", "thit rong",
                LocalDate.of(2021,10,10),15000,4);

        Material material5 = new CrispyFlour("11","bot1",
                LocalDate.of(2021, 12, 5), 3000, 3);

        Material material6 = new CrispyFlour("22","bot2",
                LocalDate.of(2021, 11, 5), 5000, 5);

        Material material7 = new CrispyFlour("33","bot3",
                LocalDate.of(2022, 1, 5), 7000, 7);

        Material material8 = new CrispyFlour("44","bot4",
                LocalDate.of(2022, 3, 5), 2000, 2);

        List<Material> materialList = new ArrayList<>();
        management.setMaterialList(materialList);

        materialList.add(material1);
        materialList.add(material2);
        materialList.add(material3);
        materialList.add(material4);
        materialList.add(material5);
        materialList.add(material6);
        materialList.add(material7);
        materialList.add(material8);

        management.disPlayMaterial();
//        management.removeMaterial(material1);
    }
}
