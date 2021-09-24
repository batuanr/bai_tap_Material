import java.time.LocalDate;
import java.util.List;

public class MaterialManagement {
    private List<Material> materialList;

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }
    public void addMaterial(Material material){
        materialList.add(material);
        disPlayMaterial();
    }
    public void removeMaterial(Material material) {
        materialList.remove(material);
        disPlayMaterial();
    }
    public void disPlayMaterial() {
        System.out.println("listMaterial");
        for (Material material:materialList) {
            System.out.println(material);
        }
    }
}

